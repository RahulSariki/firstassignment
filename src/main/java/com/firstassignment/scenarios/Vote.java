package com.firstassignment.scenarios;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>100) {
			System.out.println("Invalid age");
			return;
		}
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
