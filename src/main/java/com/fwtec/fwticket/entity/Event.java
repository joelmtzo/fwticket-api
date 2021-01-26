package com.fwtec.fwticket.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties({"active", "visible"})
@Data
@Entity
@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private Date date;
	
	@Column
	private String imgurlBanner;
	
	@Column
	private String imgurlHeader;
	
	@JsonProperty
	@Column
	private boolean isActive;
	
	@JsonProperty
	@Column
	private boolean isVisible;
	
	@ManyToOne
	@JoinColumn(name = "venue_id", referencedColumnName = "id")
	private Venue venueId;
	
}
