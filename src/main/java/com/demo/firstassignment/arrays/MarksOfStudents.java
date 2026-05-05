package com.demo.firstassignment.arrays;

import java.util.Scanner;

public class MarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        int[] marks = new int[n];

        int sum = 0, max = 0;
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
            if (marks[i] > max) max = marks[i];
        }

        double avg = (double) sum / n;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] > avg) count++;
        }

        System.out.println(avg);
        System.out.println(max);
        System.out.println(count);
 }
	}
