package com.natarajanthangaraj.problemsolving.evaluation;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		makeSpiral(n);
		scan.close();
	}

	private static void makeSpiral(int n) {
		int[][] mat = new int[n][n];
		int i = 0, j = 0, count = 1;
		int left = 0, bottom = n-1;
		int top = 0, right = n-1;
		while (left <= right && top <= bottom) {
			for ( i = top; i <= bottom; i++) {
				mat[i][i + top] = count++;
			}
			left++;
			bottom--;
			if (left <= right) {
				for ( i = bottom; i >= top; i--) {
					mat[i][right] = count++;
				}
				right--;
			}
			bottom--;
			if (top <= bottom) {
				for ( i = right; i >= left; i--) {
					mat[top][i] = count++;
				}
				left++;
				top++;
		}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] != 0)
					System.out.printf("%3d",mat[i][j]);
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	}

