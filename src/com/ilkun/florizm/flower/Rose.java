package com.ilkun.florizm.flower;

import java.util.Date;

/**
 * This class represents Rose flower.
 * There is 1 extra property which specifies
 * the rose flower - length of the thorns.
 * 
 * @author alexander-ilkun
 */
public class Rose extends Flower {
    
    private double thornsLength;
    
    /**
     * Constructs the Rose object with the specified properties.
     * 
     * @param price - price of the flower
     * @param clipped - clipping date
     * @param stemLength - length of the stem
     * @param thornsLength - length of the thorns 
     */
    public Rose(double price, Date clipped, double stemLength, double thornsLength) {
        super("Rose", price, clipped, stemLength);
        this.thornsLength = thornsLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thorns length: " + thornsLength;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.valueOf(thornsLength).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o) && o instanceof Rose) {
            Rose other = (Rose) o;
            return thornsLength == other.thornsLength;
        } else {
            return false;
        }
    }
    
    public double getThornsLength() {
        return thornsLength;
    }

    public void setThornsLength(double thornsLength) {
        this.thornsLength = thornsLength;
    }

}
