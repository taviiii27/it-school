package com.pack.session11.homework_8_09_2025;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();

        try {
            int decimal = Integer.parseInt(binaryStr, 2);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
    }
}
