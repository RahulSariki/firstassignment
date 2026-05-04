package com.firstassignment.scenarios;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter purchase amount:");
		     int purchaseAmount = sc.nextInt();
		     if(purchaseAmount>=5000){
		            purchaseAmount = purchaseAmount-purchaseAmount*30/100;
		            System.out.println("30% discount");
		        }else{
		            if(purchaseAmount<5000 && purchaseAmount>=3000){
		                purchaseAmount=purchaseAmount-purchaseAmount*20/100;
		                System.out.println("20% discount");
		            }else{
		                if(purchaseAmount<3000 && purchaseAmount>1000){
		                    purchaseAmount=purchaseAmount-purchaseAmount*10/100;
		                    System.out.println("10% discount");
		                }else{
		                    System.out.println("No discount");
		                }
		            }
		        }
	 
		}
	 

	}

