package com.session22_23;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache<T> {
    private final Map<Integer, T> cache = new HashMap<>();

    public void put(T obj) {
        cache.put(obj.hashCode(), obj);
    }

    public T get(int hash) {
        return cache.get(hash);
    }
}
