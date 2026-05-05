package com.demo.firstassignment.arrays;

import java.util.Scanner;

public class DiscountPrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prices:");
        int n = sc.nextInt();   
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
        	System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }
        System.out.println("Prices after 10% discount:");
        for (int i = 0; i < n; i++) {
            prices[i] = prices[i] - (prices[i] * 0.10);
            System.out.println(prices[i]);
        }
    }
	}
