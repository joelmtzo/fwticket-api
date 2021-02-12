package com.fwtec.fwticket.jparepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fwtec.fwticket.entity.OrderDetail;
import com.fwtec.fwticket.entity.OrderDetailId;

public interface OrderDetailJpaRepository extends JpaRepository<OrderDetail, OrderDetailId> {

	List<OrderDetail> findById_OrderId_Id(int orderId);
	
}
