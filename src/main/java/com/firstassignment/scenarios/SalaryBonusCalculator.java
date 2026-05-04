package com.firstassignment.scenarios;

import java.util.Scanner;

public class SalaryBonusCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int experience = sc.nextInt();
		 if(experience<1){
	            System.out.println("No Bonus");
	        }
	        else if(experience>=1 && experience<=4){
	           System.out.println("5% bonus");
	        }
	         else if(experience>=5 && experience<=10){
	           System.out.println("10% bonus");
	        } else{
	           System.out.println("20% bonus");
	        }	
	}
	}

