package com.demo.firstassignment.arrays;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                flag = false;
                break;
            }
        }
         if (flag)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is Not Palindrome");
    }

	}
