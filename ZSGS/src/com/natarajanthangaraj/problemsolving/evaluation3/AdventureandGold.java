package com.natarajanthangaraj.problemsolving.evaluation3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdventureandGold {
	int  moveCount = 0, nodesLeftInLayer = 1, nodesInNextLayer = 0, row, col;
	boolean reachedGold = false;
	Queue<Integer> rowQueue = new LinkedList<>();
	Queue<Integer> colQueue = new LinkedList<>();
	int[] dr = { -1, 1, 0, 0 };
	int[] dc = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		AdventureandGold obj = new AdventureandGold();
		Scanner scan = new Scanner(System.in);
		System.out.print("Dimension of Dungeon ( Row & Column ) : ");
		int r = scan.nextInt();
		int c = scan.nextInt();
		char[][] matrix = new char[r][c];
		boolean[][] visited=new boolean[r][c];
		System.out.print(" Position of Adventurer : ");
		int advx = scan.nextInt();
		int advy = scan.nextInt();
		System.out.print(" Position of Gold : ");
		int goldx = scan.nextInt();
		int goldy = scan.nextInt();
		int[] adv ={ advx, advy };
		matrix[advx][advy] = 'A';
		matrix[goldx][goldy] = 'G';
		System.out.println("Minimum Number of Steps : " + obj.findShortestPath(adv, matrix,visited));
	}

	private int findShortestPath(int[] adv, char[][] matrix,boolean[][] visited) {
		rowQueue.add(adv[0]);
		colQueue.add(adv[1]);
		visited[adv[0]][adv[1]] = true;
		while (rowQueue.size() > 0) {
			row = rowQueue.remove();
			col = colQueue.remove();
			if (matrix[row][col] == 'G') {
				reachedGold = true;
				break;
			}
			getAdjecentNodes(row, col,matrix,visited);
			nodesLeftInLayer--;
			if (nodesLeftInLayer == 0) {
				nodesLeftInLayer = nodesInNextLayer;
				nodesInNextLayer = 0;
				moveCount++;
			}
		}
		if (reachedGold)
			return moveCount;
		return -1;
	}

	private void getAdjecentNodes(int row, int col,char[][] mat,boolean[][] visited) {
		int adjRow, adjCol;
		for (int i = 0; i < 4; i++) {
			adjRow = row + dr[i];
			adjCol = col + dc[i];
			if (adjRow < 0 || adjCol < 0)
				continue;
			if (adjRow >=mat.length  || adjCol >= mat[0].length)
				continue;
			rowQueue.add(adjRow);
			colQueue.add(adjCol);
			visited[adjRow][adjCol] = true;
			nodesInNextLayer++;
		}

	}

}
