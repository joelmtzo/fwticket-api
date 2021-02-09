package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

	public Customer findByUserId_Username(String username);
	
}
