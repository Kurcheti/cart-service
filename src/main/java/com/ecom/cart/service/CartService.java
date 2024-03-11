package com.ecom.cart.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.cart.entity.Cart;
import com.ecom.cart.repository.CartRepo;

@Service
public class CartService {
	
	@Autowired
	private CartRepo cartRepo;
	
	public Cart addCart(Cart cart){
		cart.setQuantity(1);
		return cartRepo.save(cart);
	}
	
	public Cart updateCartQuantityById(Cart cart){
		cartRepo.findById(cart.getCartId()).orElseThrow(
				()->new RuntimeException("Cart not found with "+cart.getCartId()));
		return cartRepo.save(cart);
	}
	
	public List<Cart> getCartByUserId(Integer userId){
		return cartRepo.findByUserId(userId);
	}
	
	public void deleteCartById(Integer cartId){
		cartRepo.deleteById(cartId);
	}
	
	

}
