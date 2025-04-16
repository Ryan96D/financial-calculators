package org.example;

import java.util.Scanner;

public class futureValueCalc {
    static Scanner investScan = new Scanner(System.in);

    public static void main(String[] args) {



        System.out.println("How much money do you wish to deposit?");
        double initialdeposit = investScan.nextDouble();

        System.out.println("What is the annual interest rate %?");
        double annualIR = investScan.nextDouble()/100; //annual rate / 100 for percent

        System.out.println("How many years do you want to keep this deposit invested?");
        int years = investScan.nextInt();
        double days = years * 365;

        double futureValue = initialdeposit * Math.pow(1 + (annualIR / 365),days);

        System.out.println("Your initial deposit will be worth: $" +
                String.format("%.2f",futureValue) + " in " + years + "years");

        double interestEarned = futureValue - initialdeposit;
        System.out.println("Your total interest earned will be: $" +
                String.format("%.2f",interestEarned) + "!");



    }
}

