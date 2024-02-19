/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighbouring. The same letter cell may not be used more than once.
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true*/
package com.natarajanthangaraj.problemsolving.assessment.dharanishbro;

public class WordSearch {
	public static void main(String[] args) {
		String[][] grid = { { "A", "B", "C", "E" }, { "S", "F", "C", "S" }, { "A", "D", "E", "E" } };
		String word = "SECE";
		System.out.println(isFound(grid, word));
	}

	private static boolean isFound(String[][] grid, String word) {
		int row, col, index = 0;
		boolean flag = false;
		outer: for (row = 0; row < grid.length; row++) {
			for (col = 0; col < grid[0].length; col++) {
				if (grid[row][col].equals(word.charAt(index) + ""))
					flag = depthFirstSearch(row, col, grid, word, index);
				if (flag) {
					break outer;
				}
			}
		}

		return flag;
	}

	private static boolean depthFirstSearch(int row, int col, String[][] grid, String word, int index) {
		if (index == word.length()) {
			return true;
		}
		if (row < 0 || row == grid.length || col < 0 || col == grid[0].length
				|| !grid[row][col].equals(word.charAt(index) + "") || grid[row][col].equals("_")) {
			return false;
		}

		String str = grid[row][col];
		grid[row][col] = "_";
		boolean top = depthFirstSearch(row - 1, col, grid, word, index + 1);
		boolean bottom = depthFirstSearch(row + 1, col, grid, word, index + 1);
		boolean right = depthFirstSearch(row, col + 1, grid, word, index + 1);
		boolean left = depthFirstSearch(row, col - 1, grid, word, index + 1);
		grid[row][col] = str;
		return left || right || top || bottom;

	}
}