package com.natarajanthangaraj.problemsolving.evaluation;

import java.util.Scanner;

public class ZigZag {
//ZOHOISHIRING,ZOHOOOISHIRING
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s = scan.nextLine();
		int n = scan.nextInt();
		pattern(n, s);
	}

	private static void pattern(int n, String s) {
		if(n==1) {
           System.out.println(s);
		}else {
		char[][] arr = new char[n][s.length()/2+1];
		int index = 0;
		int i = 0, j = 0;
		while (index < s.length()) {
			if (i == 0) {
				while (i < n && index < s.length()) {
					arr[i][j] = s.charAt(index);
					i++;
					index++;
				}
			} else {
				i -= 2;
				j++;
				while (i > 0 && index < s.length()) {
					arr[i][j] = s.charAt(index);
					i--;
					j++;
					index++;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= 'A' && arr[i][j] <= 'z')
					System.out.print(arr[i][j] + " ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	}
}
