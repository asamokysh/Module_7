package ua.goit.java;

import java.util.*;

public class NumbersOfMusicalInstruments {

    public static void main(String[] args) {
                InstrumentsShop shop = new InstrumentsShop();

                shop.setPianos(2);
                shop.setGuitars(16);
                shop.setTrumpets(7);

                System.out.println(shop);
                System.out.println();



                Map<String, Integer> order1 = new HashMap<>();
                order1.put("pianos", 0);
                order1.put("guitars", 7);
                order1.put("trumpets", 2);

                Map<String, Integer> order2 = new HashMap<>();
                order2.put("pianos", 1);
                order2.put("guitars", 0);
                order2.put("trumpets", 0);

                Map<String, Integer> order3 = new HashMap<>();
                order3.put("pianos", 1);
                order3.put("guitars", 8);
                order3.put("trumpets", 6);

                PrepareOrder prepareOrder = new PrepareOrder();

                System.out.println("First order: 0 pianos, 7 guitars, 2 trumpets");
                List<Instrument> instrumentsToRemove = prepareOrder.prepareOrder(shop, order1);

                System.out.println("First order has done!");
                System.out.println(shop.leftInTheShop());
                System.out.println();

                System.out.println("Second order: 1 pianos, 0 guitars, 0 trumpets");
                List<Instrument> instrumentsToRemove2 = prepareOrder.prepareOrder(shop, order2);

                System.out.println("Second order has done!");
                System.out.println(shop.leftInTheShop());
                System.out.println();

                System.out.println("Third order: 1 pianos, 8 guitars, 6 trumpets");
                List<Instrument> instrumentsToRemove3 = prepareOrder.prepareOrder(shop, order3);
                System.out.println(shop.leftInTheShop());

                System.out.println();

            }
        }






