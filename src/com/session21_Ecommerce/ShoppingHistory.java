package com.session21_Ecommerce;

import java.util.*;

public class ShoppingHistory {
    private final List<List<String>> carts; // stores all purchases
    private final Map<String, Integer> frequencyMap;

    public ShoppingHistory() {
        this.carts = new ArrayList<>();
        this.frequencyMap = new HashMap<>();
    }

    public void addPurchase(List<String> cart) {
        carts.add(cart);
        for (String item : cart) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
    }
    public List<String> getTopKFrequentItems(int k) {
        if (frequencyMap.isEmpty()) return Collections.emptyList();
        PriorityQueue<Map.Entry<String, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        int kthFrequency = 0;
        if (!minHeap.isEmpty()) kthFrequency = minHeap.peek().getValue();
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= kthFrequency) {
                result.add(entry.getKey());
            }
        }
        result.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            return freqCompare != 0 ? freqCompare : a.compareTo(b);
        });

        return result;
    }

    public void displayFrequencies() {
        System.out.println("Item Frequencies:");
        frequencyMap.forEach((key, value) -> System.out.println(key + " → " + value));
    }

    //ca si exemplu de utilizare
    public static void main(String[] args) {
        ShoppingHistory history = new ShoppingHistory();
        history.addPurchase(Arrays.asList("Laptop", "iPhone", "mouse"));
        history.addPurchase(Arrays.asList("iPhone", "iPhone", "Laptop"));
        history.addPurchase(Arrays.asList("Laptop", "earpods", "iPhone"));
        history.addPurchase(Arrays.asList("earpods", "iPhone", "keyboard", "keyboard"));
        history.addPurchase(Arrays.asList("Laptop", "iPhone", "keyboard"));

        history.displayFrequencies();

        int k = 2;
        List<String> topItems = history.getTopKFrequentItems(k);

        System.out.println("\nTop " + k + " most frequently purchased items:");
        for (String item : topItems) {
            System.out.println(item + " → " + history.frequencyMap.get(item));
        }
    }
}
