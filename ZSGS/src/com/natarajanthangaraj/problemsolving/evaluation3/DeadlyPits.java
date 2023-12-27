package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class DeadlyPits {
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		DeadlyPits obj = new DeadlyPits();
		char[][] arr =Utility.getMatrix();
		int[] adv =Utility.findPosition(arr,'A');
		obj.checkRightTop(adv[0], adv[1], arr, 0);
		obj.checkLeftDown(adv[0], adv[1], arr, 0);
		if(min==Integer.MAX_VALUE) {
			System.out.println(" Not Possible");
		}
		System.out.println("Minimum steps : " + min);
	}

	private void checkRightTop(int i, int j, char[][] arr, int k) {

		if (j == arr[0].length || i == 0) {
			return;
		} else if (arr[i][j] == 'P') {
			return;
		} else if (arr[i][j] == 'G') {
			if (min > k) {
				min = k;
			}
			return;
		} else {
			checkRightTop(i, j + 1, arr, k + 1);
			checkRightTop(i - 1, j, arr, k + 1);
		}
	}
	private void checkLeftDown(int i, int j, char[][] arr, int k) {
		
		if(i==arr.length||j==-1) {
			return;
		}else if(arr[i][j]=='P') {
			return;
		}else if(arr[i][j]=='G') {
			if(min>k) {
				min=k;
			}
			return;
		}else {
			checkLeftDown(i,j-1,arr,k+1);
			checkLeftDown(i+1,j,arr,k+1);
		}
	}

	



}
