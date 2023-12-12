package com.example.inventoryservice.InventoryService.service;

import com.example.inventoryservice.InventoryService.model.Inventory;
import com.example.inventoryservice.InventoryService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isProductInStock(String productname)
    {
        return false;
    }
}
