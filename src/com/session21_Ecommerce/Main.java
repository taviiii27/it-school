package com.session21_Ecommerce;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        ShoppingHistory history = new ShoppingHistory();

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addAll(Arrays.asList("Laptop", "iPhone", "mouse"));

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addAll(Arrays.asList("iPhone", "iPhone", "Laptop"));

        ShoppingCart cart3 = new ShoppingCart();
        cart3.addAll(Arrays.asList("Laptop", "earpods", "iPhone"));

        ShoppingCart cart4 = new ShoppingCart();
        cart4.addAll(Arrays.asList("earpods", "iPhone", "keyboard", "keyboard"));

        ShoppingCart cart5 = new ShoppingCart();
        cart5.addAll(Arrays.asList("Laptop", "iPhone", "keyboard"));

        history.addPurchase(cart1);
        history.addPurchase(cart2);
        history.addPurchase(cart3);
        history.addPurchase(cart4);
        history.addPurchase(cart5);
        history.displayFrequencies(); //arata frecventa, de cate ori apare un obiect
        int k = 2;
        List<String> topItems = history.getTopKFrequentItems(k);

        System.out.println("\nTop " + k + " most frequently purchased items:");
        for (String item : topItems) {
            System.out.println(item + " → " + history.getFrequencyMap().get(item));
        }
    }
}
