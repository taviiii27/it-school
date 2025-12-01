package com.session24;

public class DoubleLambda {
    public static void main(String[] args) {
        DoubleIntf sqrt = x -> Math.sqrt(x);

        System.out.println(sqrt.apply(16));  // 4.0
        System.out.println(sqrt.apply(2));   // 1.414...
    }

}
