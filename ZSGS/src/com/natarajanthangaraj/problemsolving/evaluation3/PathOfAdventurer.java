package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class PathOfAdventurer {

	public static void main(String[] args) {
		PathOfAdventurer obj = new PathOfAdventurer();
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] matrix = new char[row][col];

		System.out.print(" Position of Adventurer : ");
		int[] adv =new int[2];
		adv[0] = scan.nextInt() - 1;
		adv[1] = scan.nextInt() - 1;
		matrix[adv[0]][adv[1]] = 'A';
		System.out.print(" Position of Monster : ");
		int[] mon = new int[2];
		mon[0] = scan.nextInt() - 1;
		mon[1] = scan.nextInt() - 1;
		matrix[mon[0]][mon[1]] = 'M';
		System.out.print(" Position of Gold : ");
		int[] gold = new int[2];
		gold[0] = scan.nextInt() - 1;
		gold[1] = scan.nextInt() - 1;
		matrix[gold[0]][gold[1]] = 'G';

		obj.findShortestPath(adv, mon, gold);

	}

	private void findShortestPath(int[] adv, int[] mon, int[] gold) {
		int pathOfMonster = Math.abs(mon[0] - gold[0]) + Math.abs(mon[1] - gold[1]);
		int pathOfAdventurer = Math.abs(adv[0] - gold[0]) + Math.abs(adv[1] - gold[1]);
		if (pathOfMonster >= pathOfAdventurer) {
			System.out.print("Path :");
			exactPath(adv, gold);
		} else {
			System.out.println(" No Possible Solution ");
		}

	}

	private void exactPath(int[] adv, int[] gold) {
		int advX=adv[0],advY=adv[1];
		int goX=gold[0],goY=gold[1];
		while(advY!=goY) {
			System.out.print("["+advX+","+advY+"] -->");
			if(adv[1]>gold[1]) {
				advY--;
			}else {
				advY++;
			}
		}
		while(advX!=goX) {
			System.out.print("["+advX+","+advY+"] -->");
			if(adv[0]>gold[0]) {
				advX--;
			}else {
				advX++;
			}
		}
		
		System.out.println("["+gold[0]+","+gold[1]+"]");
	}

}
