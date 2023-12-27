package com.natarajanthangaraj.problemsolving.evaluation3;

public class MonsterAndPits {
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		MonsterAndPits object=new MonsterAndPits();
		char[][] matrix=Utility.getMatrix();
		int[]adv=Utility.findPosition(matrix, 'A');
		int[]mon=Utility.findPosition(matrix, 'M');
		if(object.pathOfMonster(matrix,mon)>=object.pathOfAdventurer(matrix,adv)) {
			System.out.println("Minimum Number of Steps : "+object.pathOfAdventurer(matrix,adv));
		}else {
			System.out.println(" Not possible");
		}
	}

	private  int pathOfAdventurer(char[][] matrix, int[] adv) {
		checkLeftDown(adv[0],adv[1],matrix,0);
		checkRightTop(adv[0],adv[1],matrix,0);
		if(min!=Integer.MAX_VALUE) {
			return min;
		}
		return 0;
	}

	private  int pathOfMonster(char[][] matrix, int[] mon) {
		int[] gold=new int[2];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]=='G') {
					gold[0]=i;
					gold[1]=j;
				}
			}
		}
		return Utility.steps(mon,gold);
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

	
}
