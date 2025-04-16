package org.example;

import java.util.Scanner;

public class mortgageCalc {
    static Scanner calcScan = new Scanner(System.in); //Makes scanner outside main method for all methods to use
    public static void main(String[] args) {



        System.out.println("How much of a loan would you like?");
        double loanamt = mortgageCalc.calcScan.nextDouble(); // How much is loan (loanamt)

        System.out.println("What is the annual interest rate %?");
        double annualIR = calcScan.nextDouble()/100; //annual rate / 100 for percent

        System.out.println("How many years do you want for the loan payment?");
        int loanyears = mortgageCalc.calcScan.nextInt();

        int howmanymonths = loanyears * 12;
        double monthlyinterest = annualIR / 12;

        double monthlypay = monthly(loanamt,monthlyinterest,howmanymonths);
        System.out.println("Your total monthly pay is: $" + String.format("%.2f",monthlypay));

        double totalinterest = totalinterestcalc(monthlypay,howmanymonths,loanamt);
        System.out.println("Your total interest payed over this time period is: $" + String.format("%.2f",totalinterest));
    }

    public static double monthly(double principal, double monthlyinterest, int howmanymonths){
        return principal * (monthlyinterest * Math.pow(1+monthlyinterest, howmanymonths))  //M=P×(i*(1+i)^n / ((1+i)^n)-1) is the original formula
        /(Math.pow(1+monthlyinterest, howmanymonths) - 1); // n is "howmanymonths" after comma to insert into Math.pow function (power)


    }

    public static double totalinterestcalc(double monthlypay, int howmanymonths, double principal) { //Total interest payed over time
        return (monthlypay * howmanymonths) - principal;
    }
}
