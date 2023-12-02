package com.natarajanthangaraj.problemsolving.evaluation2;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuesSubarray {

	public static void main(String[] args) {
		ContinuesSubarray obj = new ContinuesSubarray();
		int[] arr = obj.getArray();
		System.out.println("The answer Subarray is : " + Arrays.toString(obj.findSubarry(arr)));
	}

	private int[] findSubarry(int[] arr) {
		int maxSum = 0, tempSum;
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			tempSum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				tempSum += arr[j];
				if (tempSum > maxSum) {
					maxSum = tempSum;
					ans = subArray(arr, i, j);
				}
			}
		}
		return ans;
	}

	private int[] subArray(int[] arr, int start, int end) {
		int[] ans = new int[(end + 1) - start];
		int index = 0;
		for (int i = start; i <= end; i++) {
			ans[index++] = arr[i];
		}
		return ans;
	}

	private int[] getArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array Length : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter array [" + i + "]  :");
			arr[i] = scan.nextInt();
		}
		return arr;
	}

}
