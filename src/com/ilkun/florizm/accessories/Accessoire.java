package com.ilkun.florizm.accessories;

/**
 * This class represents an abstract accessoire object.
 * There are 2 properties of the accessoire implemented in this class:
 * name, price.
 *
 * @author alexander-ilkun
 */
public abstract class Accessoire {
    
    private String name;
    private double price;

    /**
     * Initializes the accessoire object with the specified properties.
     * 
     * @param name
     * @param price 
     */
    public Accessoire(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.valueOf(price).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Accessoire) {
            Accessoire other = (Accessoire) o;
            return name.equals(other.name) && price == other.price;
        } else {
            return false;
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
