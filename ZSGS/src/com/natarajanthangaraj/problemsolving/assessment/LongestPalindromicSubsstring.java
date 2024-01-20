package com.natarajanthangaraj.problemsolving.assessment;

public class LongestPalindromicSubsstring {

	public static void main(String[] args) {
		LongestPalindromicSubsstring  substring=new LongestPalindromicSubsstring ();
		String str="cbbd";
		System.out.println(substring.findLongestSubstring(str));

	}

	private String findLongestSubstring(String str) {
		String max="";
		String temp;
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				temp=str.substring(i,j);
					if(max.length()<temp.length()&&isPalindrome(temp)) {
						max=temp;
					}
			}
		}
		return max;
	}
	boolean isPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
