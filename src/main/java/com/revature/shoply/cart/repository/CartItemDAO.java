package com.revature.shoply.cart.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.shoply.models.CartItem;

public interface CartItemDAO extends JpaRepository<CartItem,UUID> {
    
}
