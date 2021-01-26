package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.TicketType;

public interface TicketTypeJpaRepository extends JpaRepository<TicketType, Integer> {

}
