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
		String symbol="+-*%\\";
		char x='a';
		boolean flag=true;
		for(int i=1;i<s.length()-1;i++) {
			x=s.charAt(i);
			if(x=='(') {
				if(s.charAt(i+1)<'a'||s.charAt(i+1)>'z') {
					flag=false;
					break;
				}
			}
			else if(x==')') {
				if(s.charAt(i-1)<'a'||s.charAt(i-1)>'z') {
					flag=false;
					break;
				}
			}
			else if(symbol.contains(x+"")) {
				if((s.charAt(i+1)<'a'||s.charAt(i+1)>'z')||(s.charAt(i-1)<'a'||s.charAt(i-1)>'z')) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
	}

}
