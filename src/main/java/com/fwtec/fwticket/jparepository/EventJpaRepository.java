package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.fwticket.entity.Event;
import com.fwtec.fwticket.projections.EventProjection;

@RepositoryRestResource(excerptProjection = EventProjection.class)
public interface EventJpaRepository extends JpaRepository<Event, Integer> {

}
