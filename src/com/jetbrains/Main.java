package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userInput = 0;
        int i = 0;
        int atBat = 0;
        int count = 0;
        double avg = 0.0;
        int totalBases = 0;
        double slug = 0.0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Batting Average Calculator!");

        System.out.println("Enter number times at bat: ");

        userInput = scnr.nextInt();
        int[] batArray = new int[userInput];

        System.out.println("Please enter the at-bat result for each batting turn: \n");

        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

        for(i = 0; i < userInput; i++) {
            System.out.print("Result for at-bat " + i + " :");
            atBat = scnr.nextInt();
            totalBases += atBat;
            batArray[i] = atBat;

        }
        System.out.print("Batting Average: " + "");

        for (i = 0; i < userInput; i++ ) {
            if (batArray[i] > 0) {
                count++;
            }
        }
                avg = ((double)count / (double)userInput);

                avg = (double)Math.round(avg * 1000d) / 1000d;
                System.out.println(avg);

                slug = ((double)totalBases / userInput);

                slug = (double)Math.round(slug * 1000d) / 1000d;

                System.out.println("Slugging Percentage: " + slug);
    }
}
