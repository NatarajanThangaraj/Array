package com.natarajanthangaraj.problemsolving.rajeesan.assessment;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "wh", "heih", "height" };
		System.out.println(" Longest common Prefix : " + findLongestCommonPrefix(arr));

	}

	private static String findLongestCommonPrefix(String[] arr) {
		Arrays.sort(arr, (a, b) -> a.length() - b.length());
		StringBuilder str = new StringBuilder();

		String temp = arr[0];
		outer: for (int i = 0; i < temp.length(); i++) {
			for (int j = 1; j < arr.length; j++) {
				if (temp.charAt(i) != arr[j].charAt(i)) {
					break outer;
				}

			}
			str.append(temp.charAt(i));
		}
		return str.toString();
	}

}
