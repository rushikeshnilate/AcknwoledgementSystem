package com.maukazinfotech.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItmId;
	
	private int productNo;
	
	private String prodName;
	
	private int prodQuatity;
	
	private double prodPrice;
	
	
	//23ertyuiosdfcgvhbnm,
	
	
}
