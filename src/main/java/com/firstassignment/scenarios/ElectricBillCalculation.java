package com.firstassignment.scenarios;

import java.util.Scanner;

public class ElectricBillCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int units = sc.nextInt();
	     System.out.print("Total Bill : ");
	     if (units <= 100) {
	            System.out.println(units*2);
	        } else {
	            if (units <= 300) {
	                int temp = units-100;
	                System.out.println(100*2 + temp*3);
	            } else {
	                int a = units-300;
	                System.out.println(100*2 + 200*3 + a*5);
	            }
	}
}

	}
