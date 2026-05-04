package com.firstassignment.scenarios;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isLeap = false;
		if(year%4==0) {
			isLeap=true;
			if(year%100==0) {
				isLeap=false;
				if(year%400==0) {
					isLeap=true;
				}
			}
		}
		if(isLeap) {
			System.out.println(year+" is leap year");
		}
		if(!isLeap) {
			System.out.println(year+" is not leap year");
		}
	}
 

	}


