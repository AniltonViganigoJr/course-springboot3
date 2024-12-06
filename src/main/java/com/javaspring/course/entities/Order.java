package com.javaspring.course.entities;

import java.util.Date;
import java.util.Objects;

import com.javaspring.course.enums.OrderStatus;

public class Order {

	private Long id;
	private Date moment;
	private OrderStatus orderStatus;
	
	public Order() {
	}

	public Order(Long id, Date moment, OrderStatus orderStatus) {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	public double total() {
		return 0.0;
	}
}