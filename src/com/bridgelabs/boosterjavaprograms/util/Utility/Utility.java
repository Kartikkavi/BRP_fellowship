package com.bridgelabs.boosterjavaprograms.util.Utility;

import java.util.Scanner;

public class Utility {

	public static int add(int fno, int sno) {
		// TODO Auto-generated method stub
		return fno + sno;
	}

	public static int reversed(int num) {
		int remainder = 0, reversed = 0;

		while (num > 0) {

			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;
		}
		return reversed;
	}

	public static void leapYear() {
		System.out.println("Enter year....");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + " Is a leap Year");
		else
			System.out.println(year + " Is Not a Leap Year");

	}

	public static String reversedName(Scanner scan) {

		String[] names = new String[3];
		String[] result = new String[names.length];
		System.out.println("Enter three names ");

		for (int i = 0; i < names.length; i++) {
			names[i] = scan.next();
		}
		for (int i = 0; i < names.length; i++) {
			result[i] = names[names.length - i - 1];
			System.out.println("hello " + result[i]);
		}
		return " ";
	}

	public static String dateMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Month :");
		int month = input.nextInt();

		System.out.println("Enter Day");
		int day = input.nextInt();

		boolean isTrue = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30)
				|| (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);
		System.out.println(isTrue);
		return "";
	}

	public static double twoDice() {

		int sum;
		int dice1 = (int) (Math.random() * 6) + 1;
		System.out.println("Dice 1 :" + dice1);
		int dice2 = (int) (Math.random() * 6) + 1;
		System.out.println("Dice 2 :" + dice2);
		sum = dice1 + dice2;
		System.out.println("Sum of two Dice is :" + sum);
		return sum;
	}

	public static String root() {
		double a, b, c;
		double root1;
		double root2;
		System.out.println("Enter the value of a, b, c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root1 : " + root1);
			System.out.println("Root2 : " + root2);
		} else if (delta == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("Root 1 : " + root1);
			System.out.println("Root 2 : " + root2);
		}
		return "";

	}

	public static double distance() {

		int x1, x2, y1, y2;

		double distance;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();

		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println(
				"Distance Between Two Points" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + distance);
		return distance;

	}
	public static double Wheather() {
		double windChill = 0;
		double t;
		double v;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of temprature less than 50");
		t = sc.nextDouble();
		System.out.println("Enter value of wind Speed (larger than 120 or less than 3) ");
		v = sc.nextDouble();
		if ((t < 50) && ((v> 120) || (v <3)) ){
			 windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Given a temperature of " + t + " Fahrenheit" + " and a wind speed of " + v + " mph");
			System.out.println("The wind chill is " + windChill);

		}
		else {
			System.out.println("Invalid inputs");
		}
		
		return windChill;
	}
	public static String temConversion() {
		double f, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter  Fahrenheit temperature");
			Scanner sc1 = new Scanner(System.in);
			f = sc1.nextDouble();
			c = (f - 32) * 5 / 9;
			System.out.println("Celsius temperature is = " + c);
			break;
		case 2:
			System.out.println("Enter  Celsius temperature");
			Scanner sc2 = new Scanner(System.in);
			c = sc2.nextDouble();
			f = ((9 * c) / 5) + 32;
			System.out.println("Fahrenheit temperature is = " + f);
			break;
		default:
			System.out.println("please choose valid choice");
		}
		return "";
	}
	public static String trignometryFun() {

	       Scanner sc = new Scanner(System.in);
	        int degree = sc.nextInt();
	        // convert degrees to radians
	        double radians = Math.toRadians(degree);
	  
	     
	        double sinValue = Math.sin(radians);
	        double cosValue = Math.cos(radians);
	  
	        System.out.println("Degree to Radian  : "  +radians );
	        System.out.println("sin(" + degree + ") = " + sinValue);
	        System.out.println("cos(" + degree + ") = " + cosValue);
			return "";
	}
	public static String power() {
		Scanner sc = new Scanner(System.in);
        int	n= sc.nextInt();


        for(int i=1;i<=n;i++) {

            System.out.println(Math.pow(i,2));

        }
		return "";

	}

	public String inputInteger() {
		// TODO Auto-generated method stub
		return "";
	}
	
	public static int Harmonic() {
		int num;
		double result = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();

		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.println(result + ",");
		}
		return (int) result;
	}
public static String flipCoinWin() {
	 int loopCount = 1;
     int headCount = 0;
     int tailCount = 0;
     double result;
     int num;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Number: ");
     num = sc.nextInt();

     while (loopCount < num) {

         result = Math.random();

         if (result <= .5) {
             headCount++;
             System.out.println("Thelt is heads.");
         }
         else {
             tailCount++;
             System.out.println("Thelt is tails.");
         }
         loopCount = loopCount + 1;


         }
     if(headCount > tailCount){
         System.out.println("Head Wins");
     }
     else {
         System.out.println("Tail Wins");
     }
	return "";
}
}
