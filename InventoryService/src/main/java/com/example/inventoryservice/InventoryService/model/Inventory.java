package com.example.inventoryservice.InventoryService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String productname;
    private Integer quantity;
}
