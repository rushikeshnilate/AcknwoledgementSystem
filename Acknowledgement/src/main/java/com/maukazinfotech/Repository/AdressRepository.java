package com.maukazinfotech.Repository;

import java.io.Serializable;

import com.maukazinfotech.Entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Address, Serializable> {

}
