package com.demo.firstassignment.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }
		        Arrays.sort(arr);
		        System.out.print("Enter element to search: ");
		        int key = sc.nextInt();
		        int l = 0;
		        int r = arr.length - 1;
		        boolean found = false;
		        while (l <= r) {
		            int mid = (l + r) / 2;
		            if (arr[mid] == key) {
		                System.out.println("Element found at index: " + mid);
		                found = true;
		                break;
		            } else if (key < arr[mid]) {
		                r = mid - 1;
		            } else {
		                l = mid + 1;
		            }
		        }

		        if (!found) {
		            System.out.println("Element not found");
		        }

		        sc.close();
		    }
	}