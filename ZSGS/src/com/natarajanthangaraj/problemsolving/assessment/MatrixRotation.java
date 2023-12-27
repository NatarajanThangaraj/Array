package com.natarajanthangaraj.problemsolving.assessment;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		MatrixRotation rotate = new MatrixRotation();
		int[][] matrix = rotate.getSquareMatrix();
		rotate.display(rotate.Rotation((rotate.swapedMatrix(matrix))));
	}

	private int[][] swapedMatrix(int[][] mat) {
		int start = 0, end = mat.length - 1, temp = 0;
		while (start < end) {
			for (int i = 0; i < mat[0].length; i++) {
				temp = mat[start][i];
				mat[start][i] = mat[end][i];
				mat[end][i] = temp;
			}
			start++;
			end--;
		}
		return mat;
	}

	private int[][] Rotation(int[][] matrix) {
		int start = 0, end = matrix.length - 1;
		while (start < end) {
			for (int i = start; i < end; i++) {
				swap(start, i, matrix);
			}
			for (int j = end; j >= start; j--) {
				swap(end, j, matrix);
			}
			start++;
			end--;
		}
		return matrix;
	}

	private void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}

	}

	public void swap(int i, int j, int[][] matrix) {
		int temp = matrix[j][i];
		matrix[j][i] = matrix[i][j];
		matrix[i][j] = temp;
	}

	public int[][] getSquareMatrix() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Row and Column Length : ");
		int n = scan.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Matrix[" + i + "] [" + j + "] : ");
				matrix[i][j] = scan.nextInt();
			}
		}
		return matrix;
	}

}
