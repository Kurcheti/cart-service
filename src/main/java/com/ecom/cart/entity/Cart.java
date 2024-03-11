package com.ecom.cart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private Integer cartId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	
	
	

}
