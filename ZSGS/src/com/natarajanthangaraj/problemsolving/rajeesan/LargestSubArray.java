package com.natarajanthangaraj.problemsolving.rajeesan;

public class LargestSubArray {

	public static void main(String[] args) {
		LargestSubArray obj = new LargestSubArray();
		int[] arr = { 1, 1, 1, 1, 1, 0, 0 };
		obj.findPosition(arr);

	}

	private void findPosition(int[] arr) {
		int one, zero, max = 0, start = 0, end = 0;
		for (int i = 0; i < arr.length; i++) {
			one = 0;
			zero = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 1) {
					one++;
				} else {
					zero++;
				}
				if (one == zero && max <= one) {
					max = one;
					start = i;
					end = j;
				}
			}
		}
		if (start != 0 && end != 0)
			System.out.println(start + " " + end);
		else
			System.out.println("No such possible");
	}

}
