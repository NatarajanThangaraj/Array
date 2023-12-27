package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class Utility {
	public static char[][] getMatrix() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] matrix = new char[row][col];

		System.out.print(" Position of Adventurer : ");
		matrix[scan.nextInt() - 1][scan.nextInt() - 1] = 'A';
		 
		System.out.print(" Position of Trigger : ");
		matrix[scan.nextInt() - 1][scan.nextInt() - 1] = 'T';
		
		System.out.println("Position of Monster : ");
		matrix[scan.nextInt()-1][scan.nextInt()-1]='M';

		System.out.print(" Enter the Number of Pits : ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the " + (i + 1) + " Pit position : ");
			matrix[scan.nextInt() - 1][scan.nextInt() - 1] = 'P';
		}
		System.out.print(" Position of Gold : ");
		matrix[scan.nextInt() - 1][scan.nextInt() - 1] = 'G';
		return matrix;
	}

	static int[] findPosition(char[][] matrix, char who) {
		int[] arr = new int[2];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == who) {
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return arr;
	}
	public static int steps(int[] start, int[] end) {
		return Math.abs(start[0] - end[0]) + Math.abs(start[1] - end[1]);
	}
//	public static void main(String[] args) {
//	char[][]arr=new char[5][4];
//	arr[3][0]='A';
//	arr[3][1]='P';
//	arr[3][2]='P';
//	arr[3][3]='T';
//	arr[2][0]='P';
//	arr[0][0]='M';
//	arr[0][2]='G';
//	}
}
