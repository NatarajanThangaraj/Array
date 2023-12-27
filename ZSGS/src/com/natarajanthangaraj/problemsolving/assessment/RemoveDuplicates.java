package com.natarajanthangaraj.problemsolving.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates remDub=new RemoveDuplicates();
		System.out.println(remDub.removeDubs(remDub.getList()));
		
		
	}
	private List<Integer> removeDubs(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(i!=j&&list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
		return list;	
	}
	private List<Integer> getList(){
		Scanner scan=new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
		System.out.print("Enter List Size : ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		return list;
	}

}
