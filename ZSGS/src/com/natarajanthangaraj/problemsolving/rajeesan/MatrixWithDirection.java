package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Arrays;

public class MatrixWithDirection {

	public static void main(String[] args) {
		MatrixWithDirection obj=new MatrixWithDirection();
		int[][]matrix= {{5,1,4,3},{6,4,3,1},{8,3,7,2},{9,4,9,6}};
		obj.print(obj.sortMatrix(matrix, "vertical"));

	}
	public int[][] sortMatrix(int[][] mat,String direct){
		//if(direct.equals("vertical")) {
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				for(int k=j+1;k<mat.length-1;k++) {
					if(mat[k][j]>mat[k+1][j]) {
						int temp=mat[k+1][j];
						mat[k+1][j]=mat[k][j];
						mat[k][j]=temp;					}
				}
			}  
		}
		//}else if(direct.equals("horizontal")) {
			//int[] arr=new int[mat[0].length];
//			for(int i=0;i<mat.length;i++) {
//				for(int j=0;j<mat[0].length;j++) {
//					for(int k=j+1;k<mat[0].length;k++) {
//						if(mat[i][j]>mat[i][k]) {
//							int temp=mat[i][j];
//							mat[i][j]=mat[i][k];
//							mat[i][k]=temp;					}
//					}
//				}
//			}
//		}
		return mat;
	}
	void print(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] != 0)
					System.out.printf("%3d",mat[i][j]);
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	}

