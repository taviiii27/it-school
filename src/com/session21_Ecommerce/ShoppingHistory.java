package com.session21_Ecommerce;

import java.util.*;

public class ShoppingHistory {
    private final List<ShoppingCart> carts;
    private final Map<String, Integer> frequencyMap;

    public ShoppingHistory() {
        this.carts = new ArrayList<>();
        this.frequencyMap = new HashMap<>();
    }

    public void addPurchase(ShoppingCart cart) {
        carts.add(cart);
        for (String item : cart) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
    }

    public List<String> getTopKFrequentItems(int k) {
        if (frequencyMap.isEmpty()) return Collections.emptyList();

        Comparator<Map.Entry<String, Integer>> valueComparator =
                Map.Entry.comparingByValue(Comparator.reverseOrder());
        PriorityQueue<Map.Entry<String, Integer>> maxHeap =
                new PriorityQueue<>(valueComparator);

        maxHeap.addAll(frequencyMap.entrySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            Map.Entry<String, Integer> head = maxHeap.poll();
            if (head != null) {
                result.add(head.getKey());
            }
        }

        return result;
    }

    public void displayFrequencies() {
        System.out.println("Item Frequencies:");
        frequencyMap.forEach((key, value) -> System.out.println(key + " → " + value));
    }

    public Map<String, Integer> getFrequencyMap() {
        return Collections.unmodifiableMap(frequencyMap);
    }
}
