package com.session24;

import java.util.List;
@FunctionalInterface
interface MappingIntf {
    List<Integer> map(List<Integer> list, Function function);
}