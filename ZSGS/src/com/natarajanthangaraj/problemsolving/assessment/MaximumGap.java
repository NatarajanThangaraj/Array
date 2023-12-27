package com.natarajanthangaraj.problemsolving.assessment;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {

	public static void main(String[] args) {
		MaximumGap gap=new MaximumGap();
		int[] arr=gap.getArray();
		System.out.println(gap.maxGap(arr));
	}
	private int maxGap(int [] arr) {
		int maxgap=0;
		sort(arr);
		for(int i=1;i<arr.length;i++) {
			if((arr[i]-arr[i-1])>maxgap) {
				maxgap=(arr[i]-arr[i-1]);
			}
		}
		return maxgap;
	}
	private int[] getArray() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;
	}
	private void sort(int[] arr) {
		int i,j,temp;
		for(i=0;i<arr.length-1;i++) {
			for( j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
