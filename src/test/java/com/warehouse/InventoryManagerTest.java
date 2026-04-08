package com.warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {

    @Test
    void testAddStock() {
        InventoryManager manager = new InventoryManager();
        manager.addStock("ItemA", 10);
        assertEquals(10, manager.getStock("ItemA"));
    }

    @Test
    void testRemoveStock() {
        InventoryManager manager = new InventoryManager();
        manager.addStock("ItemA", 10);
        manager.removeStock("ItemA", 5);
        assertEquals(5, manager.getStock("ItemA"));
    }

    @Test
    void testNegativeInventory() {
        InventoryManager manager = new InventoryManager();
        manager.addStock("ItemA", 5);

        assertThrows(IllegalArgumentException.class, () -> {
            manager.removeStock("ItemA", 10);
        });
    }
}