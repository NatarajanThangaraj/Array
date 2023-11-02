package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class ReversedTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		downNumberPyramid(n);

	}
	public static void downNumberPyramid(int n) {
		int temp=n,num=n;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++) 
				System.out.print((num++)+" ");
			num-=1;
			for(int l=0;l<i;l++)
				System.out.print((--num)+" ");
			System.out.println();
			num=--temp;
		}
		
	}

}
