package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class MonsterIntro {

	public static void main(String[] args) {
		MonsterIntro obj = new MonsterIntro();
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] matrix = new char[row][col];
		int[] adv =new int[2];
		int[] gold =new int[2];
		int[] mon =new int[2];
		System.out.print(" Position of Adventurer : ");
		adv[0] = scan.nextInt()-1;
		adv[1] = scan.nextInt()-1;
		System.out.print(" Position of Monster : ");
		mon[0]= scan.nextInt()-1;
		mon[1] = scan.nextInt()-1;
		System.out.print(" Position of Gold : ");
		 gold[0] = scan.nextInt()-1;
		 gold[1] = scan.nextInt()-1;
		
		matrix[adv[0]][adv[1]] = 'A';
		matrix[gold[0]][gold[1]] = 'G';
		matrix[mon[0]][mon[1]]='M';
		obj.findShortestPath(adv, mon, gold);

	}

	private void findShortestPath(int[] adv, int[] mon, int[] gold) {
		int pathOfMonster = Math.abs(mon[0] - gold[0]) + Math.abs(mon[1] - gold[1]);
		int pathOfAdventurer = Math.abs(adv[0] - gold[0]) + Math.abs(adv[1] - gold[1]);
		if (pathOfMonster >= pathOfAdventurer) {
			System.out.println("Minimum Number of Steps : " + pathOfAdventurer);
		} else {
			System.out.println(" No Possible Solution ");
		}
	}

}
