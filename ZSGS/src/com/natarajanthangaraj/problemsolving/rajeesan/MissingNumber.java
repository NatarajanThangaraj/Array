package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		MissingNumber num = new MissingNumber();
		int[] arr = num.getArray();
		num.findMissingNumber(arr);
	}

	private void findMissingNumber(int[] arr) {
		int actualSum = 0;
		for (int x : arr) {
			actualSum += x;
		}
		int originalSum = (arr[arr.length - 1] * (arr[arr.length - 1] + 1)) / 2;
		System.out.println("Answer is : " + (actualSum - originalSum));

	}

	private int[] getArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

}
