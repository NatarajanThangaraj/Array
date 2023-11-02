package com.natarajanthangaraj.pattern;
import java.util.Scanner;
public class InvertedRightHalfPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		starPattern2(n);
		
		
	}
	public static void starPattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (i == 1 || (i == j || j == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
