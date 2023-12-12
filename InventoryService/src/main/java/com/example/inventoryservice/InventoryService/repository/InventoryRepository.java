package com.example.inventoryservice.InventoryService.repository;

import com.example.inventoryservice.InventoryService.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
