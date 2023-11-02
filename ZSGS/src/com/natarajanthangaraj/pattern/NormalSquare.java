package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class NormalSquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);

	}
	public static void starPattern(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
