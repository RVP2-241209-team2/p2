package com.revature.shoply.cart.controller;

import com.revature.shoply.models.Cart;
import com.revature.shoply.cart.service.CartService;
import com.revature.shoply.cart.DTOs.IncomingCartItemDTO;
import com.revature.shoply.login.service.LoginService;
import com.revature.shoply.models.DTOs.LoginDTO;
import com.revature.shoply.models.DTOs.OutgoingUserDTO;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @DeleteMapping("/RemoveItem/{cartItemId}")
    public ResponseEntity<String> RemoveItemFromCart(@PathVariable UUID cartItemId){
        cartService.DeleteCartItemById(cartItemId);
        return ResponseEntity.ok(null);
    }
    
    @PostMapping
    public ResponseEntity<Cart> addToCart(@RequestBody IncomingCartItemDTO cartItemDTO) {
        return ResponseEntity.ok(cartService.addToCart(cartItemDTO));
    }
}
