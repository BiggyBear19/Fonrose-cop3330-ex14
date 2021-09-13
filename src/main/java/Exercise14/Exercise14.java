/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise14;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner IRS =  new Scanner(System.in);

        System.out.print("Please enter the order amount: ");

        double raw_order = IRS.nextDouble();
        IRS.nextLine();

        double order = Math.round(raw_order * 100)/100.0;

        double rate = .055;

        double tax;

        double total;

        System.out.print("What state are you currently in?");

        String state = IRS.nextLine();

        String Wisconsin  = "WI";

        if(Wisconsin.compareTo(state) == 0){

            tax = rate * order;

            total = tax + order;

            System.out.printf("The Subtotal is $%f\nThe Tax is $%f\nThe Total is $%f", order, tax, total);

        }

        if(Wisconsin.compareTo(state) != 0){

            System.out.printf("\nYour total is $%f", order);
        }

    }
}
