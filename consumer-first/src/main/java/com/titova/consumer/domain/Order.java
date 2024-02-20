package com.titova.consumer.domain;


import javax.persistence.*;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "orders")
@Builder
public class Order {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
//    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence")
    @Column(name = "id")
    private Long id;
    @Column(name="product_name",
            nullable = false)
    private String productName;
    @Column(name="bar_code",
            nullable = false)
    private String barCode;
    @Column(name="first_name",
            nullable = false)
    private String firstName;
    @Column(name="last_name",
            nullable = false)
    private String lastName;
    @Column(name="quantity",
            nullable = false)
    private int quantity;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="amount")
    private BigDecimal amount;
    @Column(name="order_date",
            nullable = false, updatable = false)
    private LocalDateTime orderDate;
    @Column(name="status",
            nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public Order(Long id, String productName, String barCode, String firstName, String lastName, int quantity, BigDecimal price, BigDecimal amount, LocalDateTime orderDate, Status status) {
        this.id = id;
        this.productName = productName;
        this.barCode = barCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
//       if(id == null)
//           this.id += 1;
//
//       else this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity && Objects.equals(id, order.id) && Objects.equals(productName, order.productName) && Objects.equals(barCode, order.barCode) && Objects.equals(firstName, order.firstName) && Objects.equals(lastName, order.lastName) && Objects.equals(price, order.price) && Objects.equals(amount, order.amount) && Objects.equals(orderDate, order.orderDate) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, barCode, firstName, lastName, quantity, price, amount, orderDate, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", barCode='" + barCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", amount=" + amount +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }

}
