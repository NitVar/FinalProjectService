package com.example.orderservice.OrderService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderListItemsDTO {

    private Integer id;
    private String productid;
    private Integer price;
    private Integer quantity;
}
