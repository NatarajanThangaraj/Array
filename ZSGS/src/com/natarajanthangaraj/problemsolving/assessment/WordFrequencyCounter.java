package com.natarajanthangaraj.problemsolving.assessment;

import java.util.Scanner;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		WordFrequencyCounter freq = new WordFrequencyCounter();
		String str = freq.getParagraph();
		freq.findFreq(str);
	}

	private String getParagraph() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str = scan.nextLine();
		return str;
	}

	private void findFreq(String paragraph) {
		String[] arr = paragraph.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] != null) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] != null && i != j) {
						if (!Character.isAlphabetic(arr[j].charAt(arr[j].length() - 1))) {
							arr[j] = arr[j].substring(0, arr[j].length() - 1);
						}
						if (arr[i].equals(arr[j])) {
							count++;
							arr[j] = null;
						}
					}
				}
				System.out.println("   " + arr[i] + " -> " + count);
				System.out.println();
			}

		}
	}

}
