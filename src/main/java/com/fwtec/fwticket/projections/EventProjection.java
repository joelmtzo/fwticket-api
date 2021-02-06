package com.fwtec.fwticket.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.fwtec.fwticket.entity.Event;
import com.fwtec.fwticket.entity.Venue;

@Projection(name = "inlineData", types = Event.class)
public interface EventProjection {

	int			getId();
	String 		getTitle();
	String		getDescription();
	Date 		getDate();
	String 		getImgurlBanner();
	String 		getImgurlHeader();
	boolean 	getIsActive();
	boolean 	getIsVisible();
	Venue 		getVenueId();
	
}