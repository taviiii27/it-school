package com.session22_23;

import java.util.List;

public class LargeDataset {
    private final List<String> data;

    public LargeDataset(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LargeDataset(size=" + data.size() +
                ", preview=" + data.subList(0, Math.min(5, data.size())) + ")";
    }
}

