package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
	    numberPyramid(n);
		

	}
	public static void numberPyramid(int n) {
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++) 
				System.out.print((num++)+" ");
			num-=2;
			for(int l=0;l<i;l++)
				System.out.print(num--+" ");
			System.out.println();
			num=1;
		}
		
	}

}
