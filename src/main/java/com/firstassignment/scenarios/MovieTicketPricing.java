package com.firstassignment.scenarios;

import java.util.Scanner;

public class MovieTicketPricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int price;
        if(age<12) {
     	   price = 100;
        }else if(age>=12 && age<=60) {
     	   price = 200;
        }else {
     	   price = 120;
        }
      System.out.println(price);
	}
	}


