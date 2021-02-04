package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.fwticket.entity.Order;
import com.fwtec.fwticket.projections.OrderProjection;

@RepositoryRestResource(excerptProjection = OrderProjection.class)
public interface OrderJpaRepository extends JpaRepository<Order, Integer> {

}
