package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.Scanner;

public class GetTrigger {

	public static void main(String[] args) {
		GetTrigger obj = new GetTrigger();
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] matrix = new char[row][col];

		System.out.print(" Position of Adventurer : ");
		int[] adv = new int[2];
		adv[0] = scan.nextInt() - 1;
		adv[1] = scan.nextInt() - 1;
		matrix[adv[0]][adv[1]] = 'A';
		System.out.print(" Position of Monster : ");
		int[] mon = new int[2];
		mon[0] = scan.nextInt() - 1;
		mon[1] = scan.nextInt() - 1;
		matrix[mon[0]][mon[1]] = 'M';
		System.out.print(" Position of Trigger : ");
		int[] trig = new int[2];
		trig[0] = scan.nextInt() - 1;
		trig[1] = scan.nextInt() - 1;
		matrix[trig[0]][trig[1]] = 'T';
		System.out.print(" Position of Gold : ");
		int[] gol = new int[2];
		gol[0] = scan.nextInt() - 1;
		gol[1] = scan.nextInt() - 1;
		matrix[gol[0]][gol[1]] = 'G';

		obj.findShortestPath(adv, mon, gol, trig);
	}

	private void findShortestPath(int[] adv, int[] mon, int[] gol, int[] trig) {
		if (steps(mon, gol) >= steps(adv, gol)) {
			System.out.println("Minimum Number of Steps : " + steps(adv, gol));
		} else {
			if(exactPath(adv,trig,mon)) {
			System.out.print("Minimum Number of Steps : " + (steps(adv, trig) + steps(trig, gol)));
			}else {
				System.out.println("Not Possible ");
			}
		}

	}

	public int steps(int[] start, int[] end) {
		return Math.abs(start[0] - end[0]) + Math.abs(start[1] - end[1]);
	}
	private boolean exactPath(int[] adv, int[] trig,int[] mon) {
		int advX=adv[0],advY=adv[1];
		int goX=trig[0],goY=trig[1];
		while(advY!=goY) {
			if(advX==mon[0]&&advY==mon[1]) {
				return false;
			}
			if(adv[1]>trig[1]) {
				advY--;
			}else {
				advY++;
			}
		}
		while(advX!=goX) {
			if(advX==mon[0]&&advY==mon[1]) {
				return false;
			}
			System.out.print("["+advX+","+advY+"] -->");
			if(adv[0]>trig[0]) {
				advX--;
			}else {
				advX++;
			}
		}
		System.out.println("["+trig[0]+","+trig[1]+"]");
		return true;
		
	}

}
