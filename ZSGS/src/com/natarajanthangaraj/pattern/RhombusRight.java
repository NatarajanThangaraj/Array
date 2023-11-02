package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class RhombusRight {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);
		

	}
	public static void starPattern(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++)
				System.out.print(" ");
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n)
					System.out.print("*");
				else if (j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
