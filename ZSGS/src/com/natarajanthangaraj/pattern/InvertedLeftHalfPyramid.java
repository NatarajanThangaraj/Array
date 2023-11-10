package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class InvertedLeftHalfPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern1(n);
	}
	public static void starPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++)
				System.out.print("  ");
			for (int k = i; k <= n; k++) {
				if (i == 1 || (i == k || k == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
