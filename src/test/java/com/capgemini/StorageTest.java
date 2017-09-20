package com.capgemini;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class StorageTest {
    
    private Storage storage = new Storage();
    
    @Before
    public void initTest() {
        storage.addStock(new Stock(1, new Soda(5.0, "Sisi", 1)));
        storage.addStock(new Stock(2, new Soda(5.0, "Cola", 2)));
        storage.addStock(new Stock(3, new Soda(5.0, "Pepsi", 3)));
        storage.addStock(new Stock(4, new Chips(2.5, "Croky", 1500)));
        storage.addStock(new Stock(5, new Chips(2.5, "Lays", 1500)));
    }
    
    @Test
    public void testListAllStock() {
        assertEquals(5, storage.getAllStock().size());
    }
    
    @Test
    public void testFindStock() {
        assertEquals(1, storage.findStock("Sisi").getQuantity());
        assertEquals(3, storage.findStock("Pepsi").getQuantity());
        assertEquals(5, storage.findStock("lays").getQuantity());
    }
    
    @Test
    public void testFindStockOfType() {
        assertEquals(3, storage.findAllStockOfType(Soda.class).size());
        assertEquals(2, storage.findAllStockOfType(Chips.class).size());
    }
}
