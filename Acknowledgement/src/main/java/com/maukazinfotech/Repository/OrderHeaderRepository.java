package com.maukazinfotech.Repository;

import java.io.Serializable;

import com.maukazinfotech.Entity.OrderHeader;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Serializable>{

}
