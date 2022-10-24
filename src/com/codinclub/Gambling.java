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

        System.out.println(" Total stack per day is $ : " + stackPerDay);
        System.out.println(" Bet price per game is $ : " + betPrice);

        int play = (int)(Math.random() * 2);

        switch (play){
            case 0:
                stackPerDay += betPrice;
                System.out.println("\n Player Won $1 ");
                System.out.println("Stake after winning the game is $ " + stackPerDay);
            case 1:
                stackPerDay -= betPrice;
                System.out.println("\n Player lost $1 ");
                System.out.println("Stake after the losing the game is $ " + stackPerDay);
        }
    }
}
