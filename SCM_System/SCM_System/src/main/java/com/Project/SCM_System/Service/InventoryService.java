package com.Project.SCM_System.Service;

import java.util.List;

import com.Project.SCM_System.Model.Inventory;

public interface InventoryService {
    Inventory createInventory(Inventory inventory);

    Inventory getInventoryById(String inventoryId);

    List<Inventory> getAllInventory();

    Inventory updateInventory(String inventoryId, Inventory inventory);

    void deleteInventory(String inventoryId);

}
