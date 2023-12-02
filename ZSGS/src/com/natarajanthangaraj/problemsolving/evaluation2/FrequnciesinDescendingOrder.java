package com.natarajanthangaraj.problemsolving.evaluation2;

import java.util.Scanner;

public class FrequnciesinDescendingOrder {

	public static void main(String[] args) {
		FrequnciesinDescendingOrder obj = new FrequnciesinDescendingOrder();
		String str = obj.getSentence();
		obj.findFreq(str);
	}

	private String getSentence() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str = scan.nextLine();
		return str;
	}

	private void findFreq(String str) {
		String[] arr = spliter(str);
		for (String s : arr) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (s.equals(arr[i])) {
					arr[i] = "";
					count++;
				}
			}
			if (!s.equals(""))
				System.out.print(s + "-" + count + " ");
		}
	}

	private String[] spliter(String str) {
		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				length++;
			}
		}
		String[] strArr = new String[length + 1];
		int start = 0;
		int index = 0;
		for (int i = 0; i <= str.length(); i++) {
			if ( i==str.length()||(str.charAt(i) == ' '||str.charAt(i)=='.')) {
				strArr[index] = str.substring(start, i);
				start = i + 1;
				index++;
			}
		}
		return strArr;
	}
}
