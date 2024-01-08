package com.example.bookshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderItem { //join table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private int quantity;
    //acutally order and book should connect with manytomany , but when we add value from UI manymany is not easy
    //and adding column new is impossible, in this we need to add [private int quantity;]
    //Order table act like as join table and get connection of oneMany from both book and order
    @ManyToOne
    private Book book;
    @ManyToOne
    @JoinColumn(name = "order_id_fk")
    private Order order;
}
