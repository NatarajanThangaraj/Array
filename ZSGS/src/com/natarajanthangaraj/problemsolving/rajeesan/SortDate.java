package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortDate {

	public static void main(String[] args) {
		SortDate date = new SortDate();
		int[][] arr = { { 2, 9, 1900 }, { 3, 10, 2022 }, { 8, 12, 2020 }, { 9, 9, 2022 } };
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr, new Comparator<int[]>() {

				@Override
				public int compare(int[] arr1, int[] arr2) {
					if (arr1[2] == arr2[2]) {
						if (arr1[1] == arr2[1]) {
							return arr1[0] - arr2[0];
						}
						return arr1[1] - arr2[1];
					}
					return (arr1[2] - arr2[2]);

				}
			});
		}
		for (int i = 0; i < arr.length; i++)
			System.out.println(Arrays.toString(arr[i]));
	}

	int[][] getDate() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter Number of Dates : ");
		int n = scan.nextInt();
		int[][] array = new int[n][];
		for (int k = 0; k < n; k++) {
			System.out.print(" Enter date : ");
			String date = scan.next();
			String[] arr = date.split("/");
			int[] nums = new int[3];
			for (int i = 0; i < 3; i++) {
				int x = Integer.parseInt(arr[i]);
				if (i == 0) {

				}
			}
			array[k] = nums;
		}
		return array;
	}
}
