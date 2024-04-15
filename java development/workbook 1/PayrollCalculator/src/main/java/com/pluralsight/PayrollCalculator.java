package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner eScanner = new Scanner(System.in);

        System.out.println( " please enter your name ");
        String name = eScanner.nextLine();

        System.out.println(" Please enter your hours worked ");
        double hours = eScanner.nextDouble();

        System.out.println( " Please enter your pay rate ");
        double rate = eScanner.nextDouble();

        double grossPay = hours * rate;

        System.out.println( " Name: " + name + " Gross pay: $: " + grossPay);

    }
}
