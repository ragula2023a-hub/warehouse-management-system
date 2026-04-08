package com.warehouse;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private Map<String, Integer> inventory = new HashMap<>();

    // Add stock
    public void addStock(String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }

    // Remove stock
    public void removeStock(String item, int quantity) {
        int current = inventory.getOrDefault(item, 0);

        if (current - quantity < 0) {
            throw new IllegalArgumentException("Negative inventory not allowed");
        }

        inventory.put(item, current - quantity);
    }

    // Get stock level
    public int getStock(String item) {
        return inventory.getOrDefault(item, 0);
    }
}