package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		pyramid(n);
		

	}
	public static void pyramid(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>=0;j--) {
				if(i>=j)
				System.out.print((i+1)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}

}
