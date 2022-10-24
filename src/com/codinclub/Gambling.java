package com.codinclub;

import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
        System.out.println("------ Welcome to Gambling Simulator ------ ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter amount of stack ");
        int stakePerDay = scanner.nextInt();
        System.out.println(" Enter the price for the game ");
        int betPrice = scanner.nextInt();

        int maxStack = stakePerDay + 50 % stakePerDay;
        int minStack = stakePerDay - 50 % stakePerDay;

        System.out.println(" Total stack per day is $ : " + stakePerDay);
        System.out.println(" Bet price per game is $ : " + betPrice);

        while (stakePerDay > minStack && stakePerDay < maxStack) {
            int play = (int) (Math.random() * 2);
            switch (play) {
                case 0:
                    stakePerDay += betPrice;
                    System.out.println("\n Player Won $1 ");
                    System.out.println("Stake after winning the game is $ " + stakePerDay);
                case 1:
                    stakePerDay -= betPrice;
                    System.out.println("\n Player lost $1 ");
                    System.out.println("Stake after the losing the game is $ " + stakePerDay);
            }
        }
        System.out.println("Player has reached the 50% stake limit and the stake now is $" + stakePerDay + " for the day.");
    }
}