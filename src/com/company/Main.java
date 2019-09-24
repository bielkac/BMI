package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        Double inch;
        Double pound;
        int bodymass;
        System.out.println("Hello");
        System.out.println("Answer these questions to calculate your body mass index.");
        System.out.println(" after the questions have been answered your body mass will be recorded.");
        System.out.println("What is your height in inches instead of feet ?");
        inch = keyboard.nextDouble();
        System.out.println("What is your weight in pounds?");
        pound = keyboard.nextDouble();
        bodymass= 703;
        System.out.println(" ");
        System.out.println(" Your body mass index is ");
        System.out.println( bodymass * pound/(inch*inch));
        System.out.println(" Body mass may change due to age and height.");













    }
}
