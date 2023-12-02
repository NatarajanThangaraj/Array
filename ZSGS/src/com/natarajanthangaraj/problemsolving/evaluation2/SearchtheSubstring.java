package com.natarajanthangaraj.problemsolving.evaluation2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchtheSubstring {

	public static void main(String[] args) {
		char[][] arr = getArray();
		String str = searchString();
		new SearchtheSubstring().findIndex(arr, str);
	}

	private void findIndex(char[][] arr, String str) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == str.charAt(0)) {
					if ((j + str.length() - 1 < arr[0].length)) {
						if (searchIndex(arr, str, i, j, 1)) {
							System.out.println("Start Index : [" + i + "][" + (j) + "] \n End Index : [" + i + "]["
									+ (j + str.length() - 1) + "]");
						}
					} if ((i + str.length() - 1 < arr.length)) {
						if (searchIndex(arr, str, i, j, 0)) {
							System.out.println("Start Index : [" + i + "][" + j + "] \n End Index : ["
									+ (i + str.length() - 1) + "][" + j + "]");
						}
					}
				}
			}
		}

	}

	private boolean searchIndex(char[][] arr, String str, int start, int end, int direction) {
		int index = 0;
		boolean flag = true;
		if (direction == 1) {
			while (index <= str.length() - 1) {
				if (arr[start][end] != str.charAt(index)) {
					flag = false;
					break;
				}
				index++;
				end++;
			}
		} else {
			while (index <= str.length() - 1) {
				if (arr[start][end] != str.charAt(index)) {
					flag = false;
					break;
				}
				index++;
				start++;
			}
		}
		return flag;
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
			for (int j = 0; j < n && index < str.length(); j++) {
				inputArray[i][j] = str.charAt(index);
				index++;
			}
			System.out.println(Arrays.toString(inputArray[i]));
		}
		return inputArray;
	}

	private static String searchString() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String we want to search : ");
		String str = scan.next();
		return str;
	}
}
//WELCOMETOZOHOSCHOOLFORGRADUATESTUDIES