package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);
	}
	public static void starPattern(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++)
				System.out.print(" ");
			for (k = 1; k <= i; k++) {
				if (k == 1 || k == i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (i = 1; i < n; i++) {
			for (j = 0; j <= i; j++)
				System.out.print(" ");
			for (k = i; k < n; k++) {
				if (k == i || k == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
