package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextGreaterNode {
	static Node head;
	public static void main(String[] args) {
		 NextGreaterNode  obj=new  NextGreaterNode ();
		 obj.createLinkedList();
		// obj.display();
		 System.out.println(obj.findLargest());
	}
	List<Integer> findLargest() {
		List<Integer>list=new ArrayList<>();
		list.add(0);
		Node temp=head.next;
		int max=head.val;
		while(temp!=null) {
			if(temp.val>max) {
				list.add(0);
				max=temp.val;
			}else {
			max=Math.max(max, temp.val);
			list.add(max);
			}
			temp=temp.next;
		}
		return list;
	}
	void createLinkedList() {
		Scanner scan=new Scanner(System.in);
		System.out.print(" Enter size : ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			int num=scan.nextInt();
			addFirst(num);
		}
	}
	void addFirst(int num) {
		Node newNode=new Node();
		newNode.val=num;
		newNode.next=head;
		head=newNode;
	}
//	void display() {
//		Node temp=head;
//		while(temp!=null) {
//			System.out.print(temp.val+" ");
//			temp=temp.next;
//		}
//	}

}
