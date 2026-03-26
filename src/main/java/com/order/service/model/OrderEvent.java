package com.order.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderEvent {

    private String orderId;
    private String product;
    private int quantity;

    // ✅ Required by Jackson for deserialization
    public OrderEvent() {}

    public OrderEvent(String orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    // ✅ Getters & Setters required
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "OrderEvent{orderId='" + orderId + "', product='" + product + "', quantity=" + quantity + "}";
    }
}