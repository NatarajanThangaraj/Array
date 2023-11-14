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
		int[][] arr = new int[n][n];
		int i = 0, j = 0, index = 1;
		int left = 0, bottom = n-1;
		int top = 0, right = n-1;
		while (true) {
			if (j == left || i == top) {
				while (i <=bottom) {
					arr[i][j] = index++;
					i++;
					j++;
				}

			}
			left++;
			if (left == n - 2) {
				break;
			}
			bottom -= 2;
			
			if ( j == right) {
				while (i > top) {
					i--;
					arr[i][j] = index++;

				}
			}
			
			right--;
				while ((j--)>left) {
					arr[i][j] = index++;
					
				}
			i++;
			j++;
			top++;
			
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (arr[i][j] != 0)
					System.out.printf("%3d",arr[i][j]);
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
