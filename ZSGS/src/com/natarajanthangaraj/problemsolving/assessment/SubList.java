package com.natarajanthangaraj.problemsolving.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubList {

	public static void main(String[] args) {
		SubList findSublist = new SubList();
		System.out.print("Enter list size : ");
		List<Integer> list1 =findSublist.getInput();
		System.out.print("Enter sublist size : ");
		List<Integer> sublist =findSublist.getInput();
		System.out.println("The answer is : "+findSublist.isSublist(list1, sublist));
	}

	private boolean isSublist(List<Integer> list1, List<Integer> sublist) {
		for (int i = 0; i <= list1.size() - (sublist.size()); i++) {
			if (list1.subList(i, i + sublist.size()).equals(sublist)) {
				return true;
			}
		}
		return false;
	}

	private List<Integer> getInput() {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int eachNumber, n1 = scan.nextInt();
		for (int i = 0; i < n1; i++) {
			System.out.print("Enter list [" + i + "] : ");
			eachNumber = scan.nextInt();
			list.add(eachNumber);
		}
		return list;
	}

}
