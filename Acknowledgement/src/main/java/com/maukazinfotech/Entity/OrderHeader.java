package com.maukazinfotech.Entity;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordId;
	
	private String userName;
	
	private long userNumber;
	
	private String purchaseOrderNumber;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDate purchaseOrderDate;
	
	@OneToOne
	private OrderItems orderItems;
	
	@OneToOne
	private Address address;
	
	

} 	
