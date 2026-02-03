package io.github.emilyfiirst.workshop.entities;

import io.github.emilyfiirst.workshop.entities.pk.OrderItemPK;

import java.io.Serializable;
import java.util.Objects;

public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    private OrderItemPK id;

    private Integer quantity;
    private Double price;

    public OrderItem() { }

    public OrderItem(Order order, Product product, Double price, Integer quantity) {
        id.setOrder(order);
        id.setProduct(product);
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
