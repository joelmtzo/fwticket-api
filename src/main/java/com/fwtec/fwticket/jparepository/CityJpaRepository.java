package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.City;

public interface CityJpaRepository extends JpaRepository<City, Integer> {

}
