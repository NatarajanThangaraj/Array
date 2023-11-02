package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern(n);
		

	}
	public static void starPattern(int n) {
		int i, j, index = 2 * n - 1;
		for (i = 1; i <= index; i++) {
			for (j = 1; j <= index; j++) {
				if (j == 1 || j == index)
					System.out.print("* ");
				else if (i <= n && (j < i || j >= (index + 1) - i))
					System.out.print("* ");
				else if (i > n && (j < (index + 1) - i || j >= i + 1))
					System.out.print("* ");
				else if (i == j || j == (index + 1) - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}


}
