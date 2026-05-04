package com.firstassignment.scenarios;

import java.util.Scanner;

public class TemperatureAdvise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		if(temperature>35) {
			System.out.println("Very Hot");
		}else if(temperature>=25 && temperature<=35){
			System.out.println("Warm");
		}else if(temperature>=15 && temperature<=24) {
			System.out.println("Cool");
		}else {
			System.out.println("Cold");
		}
		
	}

}
