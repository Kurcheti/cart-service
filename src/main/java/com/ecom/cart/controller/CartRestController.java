package com.ecom.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.cart.entity.Cart;
import com.ecom.cart.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping(path="/addCart")
	public ResponseEntity<Cart> addCart(@RequestBody Cart cart){
		return new ResponseEntity<>(cartService.addCart(cart),HttpStatus.OK);
	}
	
	@PostMapping(path="/updateCartQuantityById")
	public ResponseEntity<Cart> updateCartQuantityById(@RequestBody Cart cart){
		return new ResponseEntity<>(cartService.updateCartQuantityById(cart),HttpStatus.OK);
	}
	
	
	@PostMapping(path="/getCartByUserId/{userId}")
	public ResponseEntity<List<Cart>> getCartByUserId(@PathVariable("userId") Integer userId){
		return new ResponseEntity<>(cartService.getCartByUserId(userId),HttpStatus.OK);
	}
	
	
	@GetMapping(path="/deleteCartById/{cartId}")
	public ResponseEntity<?> deleteUserById(@PathVariable("cartId") Integer cartId){
		cartService.deleteCartById(cartId);
		return new ResponseEntity<>("User "+cartId+" deleted Successfully",HttpStatus.OK);
	}
	
}
