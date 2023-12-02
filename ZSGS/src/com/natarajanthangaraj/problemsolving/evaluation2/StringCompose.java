package com.natarajanthangaraj.problemsolving.evaluation2;

import java.util.Scanner;

public class StringCompose {

	public static void main(String[] args) {
		 StringCompose obj=new  StringCompose();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String1 :");
		String str1=scan.next();
		System.out.print("Enter the String2 :");
		String str2=scan.next();
		if(obj.isFormed(str1,str2)) {
			System.out.println("true - "+str2+" is formed .");
		}else {
			System.out.println("false - "+str2+" is not formed .");
		}
	}

	private boolean isFormed(String str1, String str2) {
		boolean flag=true;
		char[] str1Arr=str1.toCharArray();
		for(char str2each:str2.toCharArray()) {
			flag=true;
			for(int i=0;i<str1Arr.length;i++) {
				if(str2each==str1Arr[i]) {
					flag=false;
					str1Arr[i]='_';
					break;
				}
				
			}
			if(flag) {
				return false;
			}
		}
		
		return true;
	}
	
}
