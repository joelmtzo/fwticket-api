package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.Venue;

public interface VenuesJpaRepository extends JpaRepository<Venue, Integer> {

}
