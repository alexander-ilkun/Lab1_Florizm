package com.ilkun.florizm.flower;

import java.util.Date;

/**
 * This class represents an abstract flower object.
 * There are 4 properties of the flower implemented in this class:
 * name, price, clipping date, length of the stem.
 * 
 * @author alexander-ilkun
 */
public abstract class Flower implements Comparable {
    
    private String name;
    private double price;
    private Date clipped;
    private double stemLength;
    
    /**
     * Initializes the flower object with the specified properties.
     * 
     * @param name - name of the flower
     * @param price - price of the flower
     * @param clipped - clipping date
     * @param stemLength - length of the stem
     */
    public Flower(String name, double price, Date clipped, double stemLength) {
        this.name = name;
        this.price = price;
        this.clipped = clipped;
        this.stemLength = stemLength;
    }

    /**
     * Compares two flower by clipping date.
     * 
     * @param flower - flower to be compared with
     * @return 
     */
    @Override
    public int compareTo(Object flower) {
                return this.getClipped().compareTo(((Flower)flower).getClipped());
    }
    
    @Override
    public String toString() {
        return "Name: " + name +
                ", Price: " + price +
                ", Clipped: " + clipped +
                ", Stem length: " + stemLength;
    }

    @Override
    public int hashCode() {
        return name.hashCode() +
                Double.valueOf(price).hashCode() +
                clipped.hashCode() +
                Double.valueOf(stemLength).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Flower) {
            Flower other = (Flower) o;
            return name.equals(other.name) &&
                    price == other.price &&
                    clipped.equals(other.clipped) &&
                    stemLength == other.stemLength;
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

    public Date getClipped() {
        return clipped;
    }

    public void setClipped(Date clipped) {
        this.clipped = clipped;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

}
