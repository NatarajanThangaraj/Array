package com.natarajanthangaraj.problemsolving.evaluation;
import java.util.Arrays;
import java.util.Scanner;
public class Lexicographical {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of strings to b entered : ");
		int n=scan.nextInt();
		      scan.nextLine();
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the String "+i);
			String s=scan.nextLine();
			 System.out.println("String "+i+isPossible(s));
		}      

	}

	private static String isPossible(String s) {
		String ans="";
		char[]arr=s.toCharArray();
		Arrays.sort(arr);
		for(int i=s.length()-1;i>=0;i--) {
			ans+=Character.toString(arr[i]);
		}
		return ans;
	}

}
