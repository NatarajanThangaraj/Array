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
			System.out.print("Enter the String "+i+" :");
			String s=scan.nextLine();
			 System.out.println("String "+i+":"+isPossible(s));
		}      

	}

	private static String isPossible(String s) {
		String ans="";
		char[]arr=s.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				char temp=arr[i];
				if(temp<arr[j]) {
					arr[i]=arr[j];
					arr[j]=temp;
						
				}
				//arr[i]=temp;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			ans+=Character.toString(arr[i]);
		}
		return ans;
	}

}
