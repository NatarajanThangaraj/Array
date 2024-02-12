package com.natarajanthangaraj.problemsolving.rajeesan.assessment.assesement2;

import java.util.ArrayList;
import java.util.List;

public class AntiDiagonal {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(antiDiagonal(matrix));
	}

	private static List<List<Integer>> antiDiagonal(int[][] matrix) {
		List<List<Integer>>list=new ArrayList<>();
		int row=0,col=0;
		while(col<matrix.length-1) {
			list.add(findAll(row,col,matrix));
			col++;
		}
		//System.out.println(row+" " +col);
		while(row<matrix.length) {
			list.add(findAll(row,col,matrix));
			row++;
		}
		//System.out.println(list);
		return list;
	}

	private static List<Integer> findAll(int row, int col,int[][] matrix) {
		List<Integer>list=new ArrayList<>();
		while(col>=0&&row<=matrix.length-1) {
			//System.out.println(col+" "+row);
			list.add(matrix[row][col]);
			row++;
			col--;
		}
		return list;
	}

}
