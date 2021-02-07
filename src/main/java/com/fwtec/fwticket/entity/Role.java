package com.fwtec.fwticket.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Role {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

	@Column
	private String description;

	@ManyToMany(mappedBy = "roles")
	private Set<User> usuarios = new HashSet<>();
	
}
