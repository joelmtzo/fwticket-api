package com.fwtec.fwticket.security;

import static com.auth0.jwt.algorithms.Algorithm.HMAC512;
import static com.fwtec.fwticket.security.JwtProperties.EXPIRATION_TIME;
import static com.fwtec.fwticket.security.JwtProperties.HEADER_STRING;
import static com.fwtec.fwticket.security.JwtProperties.SECRET;
import static com.fwtec.fwticket.security.JwtProperties.TOKEN_PREFIX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager authenticationManager;

	public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException {
		try {
			com.fwtec.fwticket.entity.User creds = new ObjectMapper().readValue(req.getInputStream(), com.fwtec.fwticket.entity.User.class);

			return authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							creds.getUsername(), 
							creds.getPassword(), 
							new ArrayList<>())
					);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, 
			FilterChain chain, Authentication auth) throws IOException, ServletException {

		String username = ((User) auth.getPrincipal()).getUsername();
		
		String token = JWT.create()
				.withSubject(username)
				.withClaim("username", username)
				.withClaim("roles", auth.getAuthorities().toString())
				.withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
				.sign(HMAC512(SECRET.getBytes()));
		
		res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
	}

}