package com.demo.firstassignment.arrays;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n1=sc.nextInt();
        int []a=new int[n1];
        System.out.println("Enter Elements in first array");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int n2=sc.nextInt();
        int []b=new int[n2];
        System.out.println("Enter the elements in second array");
        for(int j=0;j<n2;j++){
            b[j]=sc.nextInt();
        }
        System.out.println("Common Elements are");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i] + "");
                    break;
                }
            }
        }
    }
	}
