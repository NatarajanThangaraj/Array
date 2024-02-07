package com.natarajanthangaraj.problemsolving.rajeesan.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LongestChain {

	public static void main(String[] args) {
		int[][]matrix= {{5,24},{39,60},{15,28},{27,40},{50,90}};
		 System.out.println(" Number of pairs : "+numberOfPairs(matrix));
	}

	private static int numberOfPairs(int[][] matrix) {
		Arrays.sort(matrix,(a,b)->a[0]-b[0]);
		List<int[]>list=new ArrayList<>();
		list.add(matrix[0]);
		int current=matrix[0][1];
		for(int i=1;i<matrix.length;i++) {
			if(matrix[i][0]>current) {
				list.add(matrix[i]);
				current=matrix[i][1];
			}
		}
		System.out.println(list);
		return list.size();
	}

}
