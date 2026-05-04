package com.firstassignment.scenarios;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int num1 = sc.nextInt();
	     int num2 = sc.nextInt();
	     String operator = sc.next();
	     switch(operator) {
	     case "+":
	    	 System.out.println(num1+num2);
	    	 break;
	     case "-":
	    	 System.out.println(num1-num2);
	    	 break;
	     case "*":
	    	 System.out.println(num1*num2);
	    	 break;
	     case "/":
	    	 if(num2!=0) {
	    	 System.out.println(num1/num2);
	    	 }else {
	    		 System.out.println(" Need to handle exception");
	    	 }
	    	 break;
	    	 default:
	    		 System.out.println("Invalid operator/Input");
	     }
	}



	}


