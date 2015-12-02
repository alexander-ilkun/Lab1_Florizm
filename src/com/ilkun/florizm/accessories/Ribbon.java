package com.ilkun.florizm.accessories;

/**
 * This class represents Ribbon accessoire. There is 1 extra property which
 * specifies the ribbon - length.
 *
 * @author alexander-ilkun
 */
public class Ribbon extends Accessoire {

    private double length;

    /**
     * Constructs the Ribbon object with the specified properties.
     *
     * @param price - price of the accessoire
     * @param length - length of the ribbon
     */
    public Ribbon(double price, double length) {
        super("Ribbon", price);
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.valueOf(length).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o) && o instanceof Ribbon) {
            Ribbon other = (Ribbon) o;
            return length == other.length;
        } else {
            return false;
        }
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
