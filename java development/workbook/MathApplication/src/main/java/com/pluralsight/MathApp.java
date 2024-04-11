package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 26_000;
        double garySalary = 25_000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highestSalary is " + highestSalary);


        double carPrice = 45;
        double truckPrice = 35;
        double minPrice= Math.min(carPrice, truckPrice);

        System.out.println(minPrice);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("the square root of " + num1 + " is " +sqrtNum1);

        double num2 = -3.8;
        double absNum2 = Math.abs(num2);






    }
}
