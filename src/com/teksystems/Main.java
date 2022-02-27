package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        ifLessThan10();
//        ifLessThanGreaterThan();
//        xLessBetweenGreater();
//        xRange();
//        grader();
        dayOfWeek();
    } //main

    public static void ifLessThan10() {
        int x = 15;
        if (x < 10) {
            System.out.println("X is less than 10.");
        } //if x < 1
    } //ifLessThan10

     public static void ifLessThanGreaterThan() {
        int x = 15;
        if (x < 10)
            System.out.println("X is less than 10.");
        else if (x >= 10)
            System.out.println("Greater than 10");
    } //ifLessThanGreaterThan

    public static void xLessBetweenGreater() {
        int x = 25;
        if (x < 10)
            System.out.println("X is less than 10.");
        else if (x >= 10 && x < 20)
            System.out.println("Greater than 10");
        else
            System.out.println("Greater than 20");
    } //xLessBetweenGreater()

     public static void xRange() {
        int x = 5;
        if (x < 10)
            System.out.println("Out of range.");
        else if (x >= 10 && x < 20)
            System.out.println("In range.");
        else
            System.out.println("Out of range.");
    } //xRange()

    public static void grader() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numeric grade as a whole number: ");
        int grade = input.nextInt();
        System.out.printf("Your numeric grade was: %d", grade);
        input.close();
        if (grade <= 100 && grade >= 90)
            System.out.println("Your letter grade was: A!");
        else if (grade >= 80 && grade <= 89)
            System.out.println("Your letter grade was: B.");
        else if (grade >= 70 && grade <= 79)
            System.out.println("Your letter grade was: C.");
        else if (grade >= 60 && grade <= 69)
            System.out.println("Your letter grade was: D.");
        else
            System.out.println("Your letter grade was: F.");
    } //grader
    public static void dayOfWeek() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number, 1-7: ");
            int day = input.nextInt();
            System.out.printf("You inputted the number: %d \n", day);

            switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Out of range.");
        } //switch
    }//dayOfWeek()


} // Main
