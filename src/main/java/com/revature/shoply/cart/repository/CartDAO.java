package com.revature.shoply.cart.repository;

import com.revature.shoply.models.Cart;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface CartDAO extends JpaRepository<Cart,UUID> {
    
}
