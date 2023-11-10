package com.natarajanthangaraj.problemsolving.array;

import java.util.Scanner;

public class MatrixMultiple {

	public static void main(String[] args) {
		int[][] firstMatrix = matrix();
		int[][] secondMatrix = matrix();
		if (firstMatrix[0].length == secondMatrix.length) {
			display(matrixMultiple(firstMatrix, secondMatrix));
		} else
			System.out.println("We Don't Make Multiple to Given Input");
	}

	public static int[][] matrix() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Rows :");
		int row = scan.nextInt();
		System.out.print("Enter Number of Columns :");
		int column = scan.nextInt();
		int[][] array = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] += scan.nextInt();
			}
		}
		return array;
	}

	public static int[][] matrixMultiple(int[][] arr1, int[][] arr2) {
		int i, j, k;
		int[][] result = new int[arr1.length][arr2[0].length];
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2[0].length; j++) {
				for (k = 0; k < arr1[0].length; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		return result;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
