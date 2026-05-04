package com.demo.firstassignment.arrays;
import java.util.Scanner;

class SecondSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Second smallest not possible");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int low = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < low) {
                low = arr[i];
            }
        }
        int secondSmall = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > low && arr[j] < secondSmall) {
                secondSmall = arr[j];
            }
        }
        if (secondSmall == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest element is: " + secondSmall);
        }
    }
}