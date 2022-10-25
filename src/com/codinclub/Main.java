package com.codinclub;

import static com.codinclub.Gambling.*;

public class Main {
    public static void main(String[] args) {
        Gambling gamble = new Gambling();
        gamble.gamble20Days();
        System.out.println(" \n In total 30 days, the player has won " + win + " days and loose " + loose + " days");
        System.out.println("The total gain amount for 30 Days is $" + profit); // printing the total profit
        System.out.println("Maximum Amount Won: " + maxWin);
        System.out.println("Maximum Amount Won On Day " + maxWinDay);
        System.out.println("Maximum Amount Loss: " + maxLoss);
        System.out.println("Maximum Amount Loss On Day " + maxLossDay);
    }
}

