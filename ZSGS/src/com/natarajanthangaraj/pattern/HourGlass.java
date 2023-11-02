package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);
		

	}
	public static void starPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			for (int k = i; k <= n; k++) {
				if (i == 1 || (k == i || k == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = i; j <= n; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++) {
				if (i == n || (k == 1 || i == k))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}


}
