package com.venkat.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.order.entity.Order;
import com.venkat.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService service;

	@PostMapping("/placeorder")
	public Order placeOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}

}
