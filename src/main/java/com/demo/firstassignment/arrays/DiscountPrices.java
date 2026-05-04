package com.demo.firstassignment.arrays;

import java.util.Scanner;

public class DiscountPrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            prices[i] = prices[i] - (prices[i] * 0.10);
            System.out.println(prices[i]);
        }
    }
	}
