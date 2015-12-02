package com.ilkun.florizm;

import com.ilkun.florizm.accessories.Accessoire;
import com.ilkun.florizm.flower.Flower;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * This class represents Bouquet.
 * It encapsulates work with composition of different parts of bouquet.
 *
 * @author alexander-ilkun
 */
public class Bouquet {
    
    private final Map<Flower, Integer> flowers = new TreeMap<>();
    private final Map<Accessoire, Integer> accessories = new HashMap<>();
    private double totalPrice;

    /**
     * Adds the specified flower and its quantity.
     * 
     * @param flower - flower to add
     * @param quantity - quantity of flower
     */
    public void addFlower(Flower flower, int quantity) {
        Integer currentQuantity = flowers.get(flower);
        currentQuantity = currentQuantity == null ? quantity : currentQuantity + quantity;
        flowers.put(flower, currentQuantity);
        totalPrice += quantity * flower.getPrice();
    }

    /**
     * Adds the specified accessoire and its quantity.
     * 
     * @param accessoire - accessoire to add
     * @param quantity - quantity of accessoire
     */
    public void addAccessoire(Accessoire accessoire, int quantity) {
        Integer currentQuantity = accessories.get(accessoire);
        currentQuantity = currentQuantity == null ? quantity : currentQuantity + quantity;
        accessories.put(accessoire, currentQuantity);
        totalPrice += quantity * accessoire.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Flowers:\n");
        for (Entry<Flower, Integer> entry: flowers.entrySet()) {
            result.append(entry.getKey().toString());
            result.append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        result.append("Accessories:\n");
        for (Entry<Accessoire, Integer> entry: accessories.entrySet()) {
            result.append(entry.getKey().toString());
            result.append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        result.append("Total price: ").append(totalPrice).append("\n");
        return result.toString();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
