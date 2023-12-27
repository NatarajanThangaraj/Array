package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class AdventureandGold {
	 public static void main(String[] args) {
		AdventureandGold obj = new AdventureandGold();
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] matrix = new char[row][col];
		System.out.print(" Position of Adventurer : ");
		int advx = scan.nextInt()-1;
		int advy = scan.nextInt()-1;
		System.out.print(" Position of Gold : ");
		int goldx = scan.nextInt()-1;
		int goldy = scan.nextInt()-1;
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
