package com.natarajanthangaraj.problemsolving.rajeesan.assessment.assesement2;

import java.util.Arrays;

public class PushAllZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0,1,0,1,0,1,0};
		System.out.println(Arrays.toString(pushZero(arr)));

	}

	private static int[] pushZero(int[] arr) {
		int start = 0, temp, swaper;
		outer: while (arr[start] < arr.length - 1) {
			while (arr[start] != 0) {
				start++;
			}
			swaper = start;
			while (start <= arr.length - 1 && arr[swaper] == 0) {
				swaper++;
				if (swaper == arr.length) {
					break outer;
				}
			}
			temp = arr[start];
			arr[start] = arr[swaper];
			arr[swaper] = temp;
			start++;
		}
		return arr;
	}

}
