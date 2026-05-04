package com.firstassignment.scenarios;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		if(number==0) {
			System.out.println("0");
		}
		if(number%2==0) {
			System.out.println("Even");
		}
		if((number%2)!=0){
			System.out.println("Odd");
		}

	}

}
