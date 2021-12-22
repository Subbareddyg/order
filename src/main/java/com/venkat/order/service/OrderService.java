package com.venkat.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.order.entity.Order;
import com.venkat.order.repository.OrderRepository;

@Service
public class OrderService {
     @Autowired
	OrderRepository ord;
	
  public Order saveOrder(Order order) {
	  return ord.save(order);
  }

}
