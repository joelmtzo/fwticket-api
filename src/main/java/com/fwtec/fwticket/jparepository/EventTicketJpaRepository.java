package com.fwtec.fwticket.jparepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.fwticket.entity.EventTicket;
import com.fwtec.fwticket.projections.EventTicketsProjection;

@RepositoryRestResource(excerptProjection = EventTicketsProjection.class)
public interface EventTicketJpaRepository extends JpaRepository<EventTicket, Integer> {

	@Query
	public List<EventTicket> findByEventId_Id(int eventId);
	
}
