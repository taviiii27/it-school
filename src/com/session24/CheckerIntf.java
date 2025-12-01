package com.session24;

import java.util.List;

@FunctionalInterface
public interface CheckerIntf<T> {
    boolean contains(List<T> list, T item);
}

