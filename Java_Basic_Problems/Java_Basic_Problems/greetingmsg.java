package com.company;

//Take name as input and print a greeting message for that name.

import java.util.Locale;
import java.util.Scanner;

public class greetingmsg {
    public static void main(String[] args) {
        System.out.print("Enter you're name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " To samsung Head Office we are so happy to see you here.");
    }
}
