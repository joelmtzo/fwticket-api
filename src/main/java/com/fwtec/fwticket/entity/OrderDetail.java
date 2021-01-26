package com.fwtec.fwticket.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetail {
	
	@EmbeddedId
	private OrderDetailId id;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
	
}
