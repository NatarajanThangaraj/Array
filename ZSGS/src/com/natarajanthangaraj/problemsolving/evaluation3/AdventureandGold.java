package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class AdventureandGold {
	 public static void main(String[] args) {
		AdventureandGold obj = new AdventureandGold();
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int row = scan.nextInt()+1;
		int col = scan.nextInt()+1;
		char[][] matrix = new char[row][col];
		System.out.print(" Position of Adventurer : ");
		int advx = scan.nextInt();
		int advy = scan.nextInt();
		System.out.print(" Position of Gold : ");
		int goldx = scan.nextInt();
		int goldy = scan.nextInt();
		int[] adv = { advx, advy };
		int[] gold = { goldx, goldy };
		matrix[advx][advy] = 'A';
		matrix[goldx][goldy] = 'G';
		System.out.println("Minimum Number of Steps : " + obj.findShortestPath( adv, gold));
	}

	private int findShortestPath(int[] adv, int[] gold) {
		int length = Math.abs(adv[0] - gold[0]) + Math.abs(adv[1] - gold[1]);
		return length;
	}

}
