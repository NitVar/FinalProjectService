package com.example.inventoryservice.InventoryService.controller;

import com.example.inventoryservice.InventoryService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/inventoryservice")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{productname}")
    public boolean isProductInStock(@PathVariable String productname)
    {

        return inventoryService.isProductInStock(productname);
    }
}
