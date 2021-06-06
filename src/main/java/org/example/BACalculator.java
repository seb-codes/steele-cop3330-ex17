/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;
import java.util.Scanner;

public class BACalculator {
    public static void main(String[] args) {
        Scanner intscan = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        Integer gender = intscan.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        Integer ounces = intscan.nextInt();
        System.out.print("What is your weight, in pounds? ");
        Integer pounds = intscan.nextInt();
        System.out.print("How many hours has it been since your last drink?  ");
        Integer hours = intscan.nextInt();

        final double bac_const = gender == 1
                ? 0.73
                : 0.66;

        // I hate that I have to this. can java learn pemdas?
        double bac_a = 5.14 / pounds;
        double bac_b = bac_a * bac_const;
        double bac_c = bac_b * ounces;
        double bac_d = 0.015 * hours;
        double bac = bac_c - bac_d;

        System.out.println(String.format("\nYour BAC is %.06f", bac));

        final String msg = bac >= 0.08
                ? "It is not legal for you to drive."
                : "It is legal for you to drive.";

        System.out.println(msg);

    }
}
