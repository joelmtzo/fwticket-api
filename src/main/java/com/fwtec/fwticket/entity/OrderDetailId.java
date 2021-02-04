package com.fwtec.fwticket.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class OrderDetailId implements Serializable {

	private static final long serialVersionUID = -256020413383098455L;

	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private Order orderId;
	
	@ManyToOne
	@JoinColumn(name = "event_tickets_id", referencedColumnName = "id")
	private EventTicket eventTicketsId;
	
}
