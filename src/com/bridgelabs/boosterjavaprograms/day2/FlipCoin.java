package com.bridgelabs.boosterjavaprograms.day2;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	
	 public static void main(String[] args)
	   {
	      // Create a Random object to generate random numbers.
	      Random rand = new Random();
			
			// Simulate the coin tosses.
			for (int count = 0; count < 10; count++)
			{
				if (rand.nextInt(2) == 0)
					System.out.println("Tails");
				else
					System.out.println("Heads");
			}
	
	}
}
		
	


