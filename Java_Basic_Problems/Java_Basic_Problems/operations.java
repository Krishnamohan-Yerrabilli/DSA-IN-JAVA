package com.company;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner num1  = new Scanner(System.in);
        int firstnum = num1.nextInt();
        System.out.print("Enter a second number: ");
        Scanner num2  = new Scanner(System.in);
        int secondnum = num2.nextInt();
        System.out.print("Enter an operand(+,-,*,/): ");
        Scanner input  = new Scanner(System.in);
        char operands = input.next().charAt(0);
        if (operands == '+')
            System.out.println("Adding of two numbers " + firstnum + " and " + secondnum + " = " + (firstnum+secondnum));
        else if (operands == '-')
            System.out.println("Subtract of two numbers " + firstnum + " and " + secondnum + " = " + (firstnum-secondnum));
        else if (operands == '*')
            System.out.println("multiply of two numbers " + firstnum + " and " + secondnum + " = " + (firstnum*secondnum));
        else
            System.out.println("division of two numbers " + firstnum + " and " + secondnum + " = " + (firstnum/secondnum));
    }
}
