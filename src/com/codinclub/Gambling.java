package com.codinclub;

import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
        System.out.println("------ Welcome to Gambling Simulator ------ ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter amount of stack ");
        int stackPerDay = scanner.nextInt();
        System.out.println(" Enter the price for the game ");
        int betPrice = scanner.nextInt();

        System.out.println(" Total stack per day is : " + stackPerDay);
        System.out.println(" Bet price per game is : " + betPrice);
    }
}
