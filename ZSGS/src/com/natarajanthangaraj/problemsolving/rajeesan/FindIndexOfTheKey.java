package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Scanner;

public class FindIndexOfTheKey {
Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		FindIndexOfTheKey index=new FindIndexOfTheKey();
		int[] arr= {15,16,19,20,25,1,3,4,5,7,10,14};
		int key=5;
		System.out.println(index.findIndex(arr,key));

	}
	private int findIndex(int[] arr, int key) {
		
		return 0;
	}
	int[] getArray(){
		System.out.print("Enter the Length :");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("array [" + i + "] : ");
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	int getKey() {
		System.out.print("Enter the k : ");
		int k = scan.nextInt();
		return k;
	}

}
