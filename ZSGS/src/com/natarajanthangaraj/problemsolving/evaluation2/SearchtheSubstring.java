package com.natarajanthangaraj.problemsolving.evaluation2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchtheSubstring {

	public static void main(String[] args) {
		// char[][] input=
		getArray();
	}

	private static char[][] getArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = scan.next();
		System.out.print("Enter the Row Length : ");
		int n = scan.nextInt();
		char[][] inputArray = new char[(str.length() / n) + 1][n];
		int index = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				inputArray[i][j] = str.charAt(index);
				index++;
			}
			System.out.print(Arrays.toString(inputArray[i]));
		}
		return inputArray;
	}
}
