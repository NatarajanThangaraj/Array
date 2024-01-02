package com.natarajanthangaraj.problemsolving.rajeesan;

public class SubSequence {

	public static void main(String[] args) {
		SubSequence obj=new SubSequence();
		String str="abc";
		obj.findSubsequence(str);

	}

	private void findSubsequence(String str) {
		String temp;
		int n=1<<str.length();
		//System.out.println(n);
		for(int i=0;i<n;i++) {
			temp="";
			for(int j=0;j<str.length();j++) {
				if((i&(1<<j))>0) {
					temp+=str.charAt(j);
				}
			}
			System.out.println(temp);
			}
			
		}
		
	

}
