package com.natarajanthangaraj.problemsolving.assessment;

import java.util.HashSet;
import java.util.Set;

public class LongestPolindromicSubSequnce {

	public static void main(String[] args) {
		LongestPolindromicSubSequnce subseq=new LongestPolindromicSubSequnce();
		String str="abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba";
		System.out.println(subseq.getSubSequences(str));
	}
	private int getSubSequences(String str) {
	   Set<String>set=new HashSet<>();
			int length=1<<str.length();
		String temp;
		for(int i=0;i<length;i++) {
			temp="";
			for(int j=0;j<str.length();j++) {
				if((i&(1<<j))!=0) {
					temp+=str.charAt(j);
					if((!temp.equals(""))&&isPalindrome(temp)) {
						set.add(temp);
						
					}
				}
			}
		}
		//System.out.println(set);
		return set.size();
	}
	boolean isPalindrome(String str) {
		return (str.equals(new StringBuffer(str).reverse().toString()));
	}

}
