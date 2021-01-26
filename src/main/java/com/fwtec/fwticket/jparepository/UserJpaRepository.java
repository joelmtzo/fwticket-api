package com.fwtec.fwticket.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.User;

public interface UserJpaRepository extends JpaRepository<User, Integer> {

}
