package com.bridgelabs.boosterjavaprograms.day2;

import java.util.Scanner;

public class GamllingSimulator {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Stake value: ");
	        int Stake = sc.nextInt();
	        System.out.println("Enter Goal value: ");
	        int Goal = sc.nextInt();
	        System.out.println("Enter number of times: ");
	        int Trails = sc.nextInt();

	        int bets = 0;
	        int wins = 0;

	        for (int i=0; i< Trails; i++)
	        {
	            int cash = Stake;

	            while (cash > 0 && cash < Goal)
	            {
	                bets++;

	                if (Math.random() < 0.5)
	                    cash++;
	                else
	                    cash--;
	            }
	            if (cash == Goal)
	                wins++;
	        }
	        System.out.println();
	        System.out.println(wins + " wins of " + Trails);
	        System.out.println("Percent of games won = " + 100.0 * wins / Trails);
	        System.out.println("Avg # bets           = " + 1.0 * bets / Trails);
	    }
	}


