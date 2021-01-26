package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.Order;

public interface OrderJpaRepository extends JpaRepository<Order, Integer> {

}
