package com.acgroup.menu.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

@Embeddable
public class CartItem {
    @ManyToOne
    private Product product;
    private int quantity;
    private BigDecimal price;

    // Getters and setters
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
}
