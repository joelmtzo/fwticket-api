package com.fwtec.fwticket.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fwtec.fwticket.entity.Role;
import com.fwtec.fwticket.jparepository.UserJpaRepository;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
    UserJpaRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.fwtec.fwticket.entity.User usuario = userRepository.findByUsername(username);

		if(usuario == null) throw new UsernameNotFoundException(username);
		
		Set<GrantedAuthority> grantList = new HashSet<>();

		for (Role role : usuario.getRoles()) {
			grantList.add(new SimpleGrantedAuthority(role.getDescription()));
		}

		return new User(usuario.getUsername(), usuario.getPassword(), grantList);

	}
	
}
