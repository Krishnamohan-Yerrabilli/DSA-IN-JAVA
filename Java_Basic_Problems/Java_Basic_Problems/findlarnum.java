package com.company;

//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class findlarnum {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner firstnuminput = new Scanner(System.in);
        int firstnum = firstnuminput.nextInt();
        System.out.print("Enter another number: ");
        Scanner secnuminp = new Scanner(System.in);
        int secondnum = secnuminp.nextInt();
        if (firstnum > secondnum)
            System.out.println(firstnum + " is bigger then " + secondnum);
        else
            System.out.println(secondnum + " is bigger then " + firstnum);
    }
}
