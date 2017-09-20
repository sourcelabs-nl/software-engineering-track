package com.capgemini.se.week2.soda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Storage {

    private List<Stock> stock = new ArrayList<>(); // 0..*

    public void addStock(Stock stockItem) {
        stock.add(stockItem);
    }

    public List<Stock> getAllStock() {
        return stock;
    }

    public Stock findStock(String name) {
        return stock.stream().filter(stock -> stock.getProduct().getName().equalsIgnoreCase(name)).findFirst().get();
    }
    
    public List<Stock> findAllStockOfType(Class clazz){
        return stock.stream().filter(stock -> stock.getProduct().getClass().isAssignableFrom(clazz)).collect(Collectors.toList());       
    }
}
