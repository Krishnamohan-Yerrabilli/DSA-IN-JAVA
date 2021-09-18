package com.company;

//Input currency in rupees and output in USD.

import java.util.Scanner;

public class currencyconvertor {
    public static void main(String[] args) {
        System.out.print("Enter money in rupees: ");
        Scanner moneyinp = new Scanner(System.in);
        double indianrupee = moneyinp.nextDouble();
        double count = 0;
        double maxnum = count;
        double indtodoll = 0;
        while (count <= indianrupee) {
            indtodoll += maxnum + 0.014;
            count++;
        }
        System.out.println(indianrupee + " is equal to " + indtodoll + "$");
    }
}
