package com.ilkun.florizm.flower;

import java.util.Date;

/**
 * This class represents Camomile flower.
 * There is 1 extra property which specifies
 * the camomile flower - count of petals.
 *
 * @author alexander-ilkun
 */
public class Camomile extends Flower {
    
    private int petalsCount;
    
    /**
     * Constructs the Camomile object with the specified properties.
     * 
     * @param price - price of the flower
     * @param clipped - clipping date
     * @param stemLength - length of stem
     * @param petalsCount - count of petals 
     */
    public Camomile(double price, Date clipped, double stemLength, int petalsCount) {
        super("Camomile", price, clipped, stemLength);
        this.petalsCount = petalsCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Petals count" + petalsCount;
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                Integer.valueOf(petalsCount).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o) && o instanceof Camomile) {
            Camomile other = (Camomile) o;
            return petalsCount == other.petalsCount;
        } else {
            return false;
        }
    }
    
    public double getPetalsCount() {
        return petalsCount;
    }

    public void setPetalsCount(int petalsCount) {
        this.petalsCount = petalsCount;
    }

}
