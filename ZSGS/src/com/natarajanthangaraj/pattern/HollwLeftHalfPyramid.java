package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class HollwLeftHalfPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);
		

	}
	public static void starPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (j == i || j == n - 1)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
