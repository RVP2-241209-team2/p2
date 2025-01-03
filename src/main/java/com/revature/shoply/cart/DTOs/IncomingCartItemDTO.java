package com.revature.shoply.cart.DTOs;

import java.util.UUID;

public class IncomingCartItemDTO {

    private UUID userId;
    private UUID productId;
    private int quantity;

    public IncomingCartItemDTO() {
    }

    public IncomingCartItemDTO(UUID userId, UUID productId, int quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "IncomingCartItemDTO{" +
                "userId=" + userId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
