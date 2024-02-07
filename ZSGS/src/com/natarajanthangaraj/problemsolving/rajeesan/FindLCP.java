package com.natarajanthangaraj.problemsolving.rajeesan;

public class FindLCP {

	public static void main(String[] args) {
		FindLCP lcp = new FindLCP();
		String[] arr = { "techie delight", "tech", "techie", "technology", "technical" };
		System.out.println(" Answer : " + lcp.findLongestCommonPrefix(arr));
	}

	private String findLongestCommonPrefix(String[] arr) {
		String tempStr = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (tempStr.length() > arr[i].length()) {
				tempStr = arr[i];
			}
		}
		for (int i = 0; i < tempStr.length(); i++) {
			
			for (String str : arr) {
				if (tempStr.charAt(i) != str.charAt(i)) {
					return tempStr.substring(0, i );
				}
			}
			
		}

		return tempStr;
	}

}
