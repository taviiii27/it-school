package com.session22_23;

public class Entity {
    private final int id;
    private final String name;
    private final long timestamp;

    public Entity(int id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Entity other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id) ^ 0x123456;
    }
}

