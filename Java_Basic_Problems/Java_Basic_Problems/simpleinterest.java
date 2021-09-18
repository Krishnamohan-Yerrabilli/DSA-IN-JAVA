package com.company;

//Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        System.out.print("Enter you're loan amount: ");
        Scanner input = new Scanner(System.in);
        float loanamount  = input.nextFloat();
        System.out.print("Enter you're interest percentage: ");
        Scanner interest = new Scanner(System.in);
        float interestamount  = interest.nextFloat();
        System.out.print("Enter you're time period: ");
        Scanner tp = new Scanner(System.in);
        int year = tp.nextInt();
        float result = (loanamount * interestamount * year) / 100;
        System.out.print("You're interest of the required amount is: " + result);
    }
}
