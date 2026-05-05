package com.demo.firstassignment.arrays;
import java.util.Scanner;

class SecondSmall {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int secondSmall=arr[0];
        for(int i=1;i<arr.length;i++){
            if(secondSmall>arr[i]){
               secondSmall=arr[i];
            }
        }
        int secondSmall1=arr[0];
        for(int j=1;j<arr.length;j++){
            if(secondSmall1>arr[j] && arr[j]>secondSmall){
                secondSmall1=arr[j];
            }
        }
        System.out.println(secondSmall1);
    }
}