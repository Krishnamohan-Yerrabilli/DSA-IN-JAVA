package com.company;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.print("Enter temperature in celsius: ");
        Scanner input = new Scanner(System.in);
        float temperatureindeg  = input.nextFloat();
        float tempf = (temperatureindeg * 9/5) + 32;
        System.out.println("The Temperature in fahrenheit is: " + tempf);
    }
}
