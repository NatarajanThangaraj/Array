package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class InnerDiamond {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);

	}
	public static void starPattern(int n) {
		int i, j, k, l;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++)
				System.out.print("*");
			for (k = 1; k < i; k++)
				System.out.print("  ");
			for (l = i; l <= n; l++)
				System.out.print("*");

			System.out.println();
		}
		for (i = 2; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			for (k = i; k < n; k++)
				System.out.print("  ");
			for (l = 1; l <= i; l++)
				System.out.print("*");
			System.out.println();
		}

	}


}
