package org.example;

import java.util.Scanner;

public class annuityCalculator {
    static Scanner presentScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What monthly amount would you like from your annuity?");
        double annuityAmt = presentScanner.nextDouble();

        System.out.println("How much is the expected interest rate %?");
        double annualInterest = presentScanner.nextDouble()/100;  // annual interest (need to divide 100
        System.out.println("And how many years will this annuity pay?");
        double years = presentScanner.nextDouble();


        double monthlyInterest = annualInterest / 12;
        double months = years * 12;


        double presentValueNeed = annuityAmt * (1- Math.pow(1+monthlyInterest,-months)) /monthlyInterest;

        System.out.println("The amount you would need to invest for this amount is: $"+ String.format("%.2f",presentValueNeed));

    }
}
