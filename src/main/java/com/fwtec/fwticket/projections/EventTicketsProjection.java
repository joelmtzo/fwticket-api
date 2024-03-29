package com.fwtec.fwticket.projections;

import org.springframework.data.rest.core.config.Projection;

import com.fwtec.fwticket.entity.Event;
import com.fwtec.fwticket.entity.EventTicket;
import com.fwtec.fwticket.entity.TicketType;

@Projection(name = "inlineData", types = EventTicket.class)
public interface EventTicketsProjection {

	Event		getEventId();
	TicketType 	getTicketTypeId();
	double 		getPrice();
	int 		getStock();
	int			getId();
	
}