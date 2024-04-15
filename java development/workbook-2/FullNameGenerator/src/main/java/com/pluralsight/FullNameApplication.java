package com.pluralsight;

import java.util.Scanner;


public class FullNameApplication {
        public static void main(String[] args) {
            Scanner nameScanner = new Scanner(System.in);
            System.out.println("Enter your name:");

            System.out.print("Enter first Name:");
            String firstName = nameScanner.nextLine().trim();

            System.out.print("Enter last Name:");
            String lastName = nameScanner.nextLine().trim();

            System.out.print("Enter middle name if applicable:");
            String middleName = nameScanner.nextLine().trim();

            System.out.print("Enter suffix if applicable:");
            String suffix = nameScanner.nextLine().trim();

            String fullName = firstName;

            if (!middleName.isEmpty()){
                fullName += " " + middleName;
            }
            fullName += " " + lastName;
            if(!suffix.isEmpty()){
                fullName += ", " + suffix;
            }
            System.out.println("\nFull name: " + fullName);
        }
    }

