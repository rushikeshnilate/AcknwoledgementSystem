package com.maukazinfotech.Repository;

import java.io.Serializable;

import com.maukazinfotech.Entity.OrderItems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Serializable>{

}
