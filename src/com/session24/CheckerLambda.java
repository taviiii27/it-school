package com.session24;

import java.util.Arrays;
import java.util.List;

public class CheckerLambda{
    public static void main(String[] args) {

        CheckerIntf <String> containsString = (list, item) ->
                list.contains(item);

        List<String> names = Arrays.asList("Ana", "Bobby", "Tavi");

        System.out.println(containsString.contains(names, "Bobby"));
        System.out.println(containsString.contains(names, "David"));
    }
}

