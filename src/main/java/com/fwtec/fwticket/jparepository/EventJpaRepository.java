package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.Event;

public interface EventJpaRepository extends JpaRepository<Event, Integer> {

}
