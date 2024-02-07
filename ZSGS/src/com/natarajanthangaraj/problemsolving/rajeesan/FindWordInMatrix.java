package com.natarajanthangaraj.problemsolving.rajeesan;

public class FindWordInMatrix {

	public static void main(String[] args) {
		FindWordInMatrix ans = new FindWordInMatrix();
		char[][] matrix = {
				{ 'B', 'B', 'M', 'B', 'B', 'B' },
				{ 'C', 'B', 'A', 'B', 'B', 'B' },
				{ 'I', 'B', 'G', 'B', 'B', 'B' },
				{ 'G', 'B', 'I', 'B', 'B', 'B' },
				{ 'A', 'B', 'C', 'B', 'B', 'B' },
				{ 'M', 'C', 'I', 'G', 'A', 'M' } };
		String word = "MAGIC";
		System.out.println(" OUTPUT :" + ans.findCountOfWord(matrix, word));
	}

	private int findCountOfWord(char[][] matrix, String word) {
		int count = 0;
		int wlen = word.length(), mlen = matrix.length;
		for (int i = 0; i < mlen; i++) {
			for (int j = 0; j < mlen; j++) {
				if (matrix[i][j] == word.charAt(0)) {
					if ((j + (wlen - 1)) < mlen) {
						count += leftToRight(matrix, i, j, word);
					}
					if ((i + (wlen-1)) < mlen) {
						count += topTobottom(matrix, i, j, word);
					}
					if ((j - (wlen-1)) >= 0) {
						count += rightToLeft(matrix, i, j, word);
					}
					if ((i - wlen) >= 0) {
						count += bottomToTop(matrix, i, j, word);
					}
				}
			}
		}
		return count;
	}

	private int bottomToTop(char[][] matrix, int i, int j, String word) {
		String str = "";
		int k = i;
		while (str.length() < word.length()) {
			str += matrix[k][j];
			k--;
		}
		System.out.println(str + " bottom to top");
		if (str.equals(word)) {
			return 1;
		}
		return 0;
	}

	private int leftToRight(char[][] matrix, int i, int j, String word) {
		String str = "";
		int k = j;
		while (str.length() < word.length()) {
			str += matrix[i][k];
			k++;
		}
		System.out.println(str + " left to right");
		if (str.equals(word)) {
			return 1;
		}
		return 0;
	}

	private int topTobottom(char[][] matrix, int i, int j, String word) {
		String str = "";
		int k = i;
		while (str.length() < word.length()) {
			str += matrix[k][j];
			k++;
		}
		System.out.println(str + " top to bottom ");
		if (str.equals(word)) {
			return 1;
		}
		return 0;
	}

	private int rightToLeft(char[][] matrix, int i, int j, String word) {
		String str = "";
		int k = j;
		while (str.length() < word.length()) {
			str += matrix[i][k];
			k--;
		}
		System.out.println(str + " right to left");
		if (str.equals(word)) {
			return 1;
		}
		return 0;
	}

}
