package com.natarajanthangaraj.problemsolving.evaluation2;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		TransposeMatrix object = new TransposeMatrix();
		int[][] matrix = object.getMatrix();
		object.transpose(matrix);
	}

	private void transpose(int[][] matrix) {
		int[][] mulArr = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				mulArr[j][i] = matrix[i][j];
			}
		}
		display(mulArr);
	}

	private void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private int[][] getMatrix() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter matrix length :");
		int n = scan.nextInt();
		System.out.print("Enter matrix [] length :");
		int each = scan.nextInt();
		int[][] matrix = new int[n][each];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < each; j++) {
				System.out.print("Enter matrix [" + i + "][" + j + "] :");
				matrix[i][j] = scan.nextInt();
			}
		}
		return matrix;
	}

}
