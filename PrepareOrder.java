package ua.goit.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 7 on 19.03.2016.
 */
public class PrepareOrder {
    public static List<Instrument> prepareOrder(InstrumentsShop shop, Map<String, Integer> order) {
        int numberOfPianosToRemove = order.get("pianos");
        int numberOfGuitarsToRemove = order.get("guitars");
        int numberOfTrumpetsToRemove = order.get("trumpets");

        try {

            if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
            if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
            if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();

            shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
            shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
            shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

            List<Instrument> result = new ArrayList<>();
            for (int i = 0; i < numberOfPianosToRemove; i++) {
                result.add(new Piano());
            }
            for (int i = 0; i < numberOfGuitarsToRemove; i++) {
                result.add(new Guitar());
            }
            for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
                result.add(new Trumpet());
            }
            return result;
        } catch (IllegalStateException ex) {
            System.out.println("Order hasn't done, not enough musical instruments in the shop!");
        } return null;
    }
}
