package com.natarajanthangaraj.pattern;

import java.util.Scanner;

public class DownNumberTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=scan.nextInt();
		downNumberTriangle(n);
		

	}
	public static void downNumberTriangle(int n) {
		int num=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=n;k++)
				System.out.print(" "+num);
			System.out.println();
			num--;
		}
	}

}
