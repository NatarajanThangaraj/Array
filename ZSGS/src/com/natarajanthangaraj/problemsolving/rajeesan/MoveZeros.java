package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		MoveZeros obj=new MoveZeros();
	 int[] arr= obj.getInputArray();
	 System.out.println(Arrays.toString(obj.moveZerosToLast(arr)));
	}

	private int[] moveZerosToLast(int[] arr) {
		int start=0,end=arr.length-1;
		while(start<end) {
			while(arr[start]!=0) {
				start++;
			}
			while(arr[end]==0){
				end--;
			}
			if(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			}
		}
		return arr;
	}
	public  int[] getInputArray() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Length :");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("array [" + i + "] : ");
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	

}
