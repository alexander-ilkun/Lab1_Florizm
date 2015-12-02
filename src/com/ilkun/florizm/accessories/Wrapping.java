package com.ilkun.florizm.accessories;

/**
 * This class represents Wrapping accessoire.
 * There is 1 extra property which specifies the wrapping - material.
 *
 * @author alexander-ilkun
 */
public class Wrapping extends Accessoire {
    
    public enum Material {
        PAPER, CELLOPHANE, CLOTH, BASKET;
    }

    private Material material;

    /**
     * Constructs the Wrapping object with the specified properties.
     * 
     * @param price - price of the accessoire
     * @param material - material of the wrapping 
     */
    public Wrapping(double price, String material) {
        super("Wrapping", price);
        this.material = Material.valueOf(material);
    }

    @Override
    public String toString() {
        return super.toString() + ", Material:" + material;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + material.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o) && o instanceof Wrapping) {
            Wrapping other = (Wrapping) o;
            return material.equals(other.material);
        } else {
            return false;
        }
    }
    
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
