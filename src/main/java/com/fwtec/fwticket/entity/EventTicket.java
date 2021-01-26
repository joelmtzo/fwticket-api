package com.fwtec.fwticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "event_tickets")
public class EventTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event eventId;
	
	@ManyToOne
	@JoinColumn(name = "ticket_type_id")
	private TicketType ticketTypeId;
	
	@Column
	private double price;
	
	@Column
	private int stock;
	
}
