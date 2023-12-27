package com.natarajanthangaraj.problemsolving.assessment;

import java.util.Scanner;

public class KthSmallestElement {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		KthSmallestElement kth = new KthSmallestElement();
		int[] arr = kth.getArray();
		System.out.print("Enter K : ");
		int k = scan.nextInt();
		System.out.println(kth.findSmallest(arr, k));
	}

	private int findSmallest(int[] array, int k) {
		sort(array);
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] != array[i]) {
				k--;
			}
			if (k == 1) {
				return array[i];
			}
		}
		return 0;
	}

	private int[] getArray() {
		System.out.print("Enter Array Size : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	private void sort(int[] array) {
		int i, j, key;
		for (i = 1; i < array.length; i++) {
			j = i - 1;
			key = array[i];
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
}