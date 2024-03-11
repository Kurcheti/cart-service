package com.ecom.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.cart.entity.Cart;
@Repository
public interface CartRepo extends JpaRepository<Cart, Integer>{
	public List<Cart> findByUserId(Integer userId);

}
