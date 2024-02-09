package com.natarajanthangaraj.problemsolving.evaluation;
import java.util.Scanner;
public class Express {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter expression :");
		String s=scan.nextLine();
		validOrNot(s);
	}

	private static void validOrNot(String s) {	
		String symbol="+-*%/";
		char x=' ';
		boolean flag=true;
		int stack=0;
		for(int i=0;i<s.length();i++) {
			x=s.charAt(i);
		 if(x=='(') {
			 stack++;
		 }else if(x==')') {
			if(stack==0) {
				flag=false;
				break;
			} 
			stack--;
		 }else if(symbol.contains(x+"")) {
			
			 if((i==0||i==s.length()-1)||(s.charAt(i-1)=='('&&s.charAt(i+1)==')')||(s.charAt(i-1)!='('&&s.charAt(i+1)==')')) {
				 flag=false;
				 break;
			 }
		 }
		// ((a+b)+(c-))
		}
		if(flag&&stack==0) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
	}

}
