package com.natarajanthangaraj.pattern;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangleNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		pascalPattern(n);

	}

	private static void pascalPattern(int n) {
		int[][] pascal=new int[n][];
		
		for(int i=0;i<n;i++) {
			int[] jagged= new int[i+1];
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
					jagged[j]=1;
				}else {
					jagged[j]=pascal[i-1][j]+pascal[i-1][j-1];
				}
			}
			pascal[i]=jagged;
		}
		for(int[] arr:pascal)
		System.out.println(Arrays.toString(arr));
	}

}
