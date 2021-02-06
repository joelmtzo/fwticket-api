package com.fwtec.fwticket.projections;

import org.springframework.data.rest.core.config.Projection;

import com.fwtec.fwticket.entity.Customer;
import com.fwtec.fwticket.entity.Order;

@Projection(name = "inlineData", types = Order.class)
public interface OrderProjection {

	int			getId();
	String 		getDate();
	double 		getTotal();
	String 		getNotes();
	Customer	getCustomerId();
	
}