package com.example.orderservice.OrderService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="order_list_items")
public class OrderListItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String productcode;
    private Integer price;
    private Integer quantity;
}
