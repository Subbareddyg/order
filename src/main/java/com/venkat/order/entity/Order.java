package com.venkat.order.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orderMC")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
	
	@Id
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	

}
