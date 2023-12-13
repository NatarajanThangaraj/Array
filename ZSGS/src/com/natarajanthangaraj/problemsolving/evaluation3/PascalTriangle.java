package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle pascal = new PascalTriangle();
		int rows = pascal.getNumber();
		pascal.display(pascal.triangle(rows));
	}

	private int[][] triangle(int row) {
		int[][] jagged = new int[row][];
		for (int i = 0; i < row; i++) {
			jagged[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					jagged[i][j] = 1;
				} else {
					jagged[i][j] = jagged[i - 1][j - 1] + jagged[i - 1][j];
				}
			}
		}
		return jagged;
	}

	private int getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int n = scan.nextInt();
		return n;
	}

	private void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
