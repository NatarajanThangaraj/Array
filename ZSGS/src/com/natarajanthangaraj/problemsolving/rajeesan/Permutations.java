package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
1. Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.
Example 1:
Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .*/
public class Permutations {
	static Set<String> set = new TreeSet<>();

	public static void main(String[] args) {
		Permutations obj = new Permutations();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();

		obj.findPermutations(str.toCharArray(), 0);

		System.out.println(set);
	}

	private void findPermutations(char[] str, int i) {
		if (i == str.length - 1) {
			set.add(new String(str));
			return;
		}
		for (int k = i; k < str.length; k++) {
			swap(str, k, i);
			findPermutations(str, i + 1);
			swap(str, k, i);
		}
	}

	private void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;

	}

}
