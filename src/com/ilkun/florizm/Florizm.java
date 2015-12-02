package com.ilkun.florizm;

import com.ilkun.florizm.accessories.Accessoire;
import com.ilkun.florizm.accessories.Ribbon;
import com.ilkun.florizm.accessories.Wrapping;
import com.ilkun.florizm.flower.Camomile;
import com.ilkun.florizm.flower.Flower;
import com.ilkun.florizm.flower.Rose;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class tests the functionality of the project.
 *
 * @author alexander-ilkun
 */
public class Florizm {

    private static final ArrayList<Flower> flowers = new ArrayList<>();
    private static final ArrayList<Accessoire> accessories = new ArrayList<>();

    public static void initialize() {
        Scanner sc;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
            sc = new Scanner(new File("initialization.txt"));
            while (sc.hasNext()) {
                switch (sc.next()) {
                    case "Rose":
                        flowers.add(
                                new Rose(
                                        Double.parseDouble(sc.next()),
                                        formatter.parse(sc.next()),
                                        Double.parseDouble(sc.next()),
                                        Double.parseDouble(sc.next())));
                        break;
                    case "Camomile":
                        flowers.add(
                                new Camomile(
                                        Double.parseDouble(sc.next()),
                                        formatter.parse(sc.next()),
                                        Double.parseDouble(sc.next()),
                                        Integer.parseInt(sc.next())));
                        break;
                    case "Ribbon":
                        accessories.add(
                                new Ribbon(
                                        Double.parseDouble(sc.next()),
                                        Double.parseDouble(sc.next())));
                        break;
                    case "Wrapping":
                        accessories.add(
                                new Wrapping(
                                        Double.parseDouble(sc.next()),
                                        sc.next()));
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException | ParseException ex) {
            Logger.getLogger(Florizm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void process() {
        Scanner sc;
        Bouquet bouquet = new Bouquet();
        int i = 0;
        sc = new Scanner(System.in);
        System.out.println("Welcome! We have the next staff:");
        for (Flower flower: flowers) {
            System.out.println(i + 1 + ". " + flower);
            i++;
        }
        String[] quantities = sc.nextLine().split(" ");
        i = 0;
        for (String str: quantities) {
            int quantity = Integer.parseInt(str);
            if (quantity != 0) {
                bouquet.addFlower(flowers.get(i), quantity);
            }
            i++;
        }
        i = 0;
        System.out.println("\nAdd some accessories:");
        for (Accessoire accessoire: accessories) {
            System.out.println(i + 1 + ". " + accessoire);
            i++;
        }
        quantities = sc.nextLine().split(" ");
        i = 0;
        for (String str: quantities) {
            int quantity = Integer.parseInt(str);
            if (quantity != 0) {
                bouquet.addAccessoire(accessories.get(i), quantity);
            }
            i++;
        }
        System.out.println("\nYour order:");
        System.out.println(bouquet);
    }
    
    public static void main(String[] args) {
        initialize();
        process();
    }

}
