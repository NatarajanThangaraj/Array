package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Scanner;

/*3. Give a Singly Linked List, write a program to delete the last element and move K-th last
element to last position. Your solution must be in O(n) time complexity.
Example :
Input: 7 -> 16 -> 100 -> 33 -> 21-> 9 -> 63 -> 11 -> 49 -> 199 -> 59 and K= 5
Output: 7 -> 16 -> 100 -> 33 -> 21 -> 9 -> 11 -> 49 -> 199 -> 63
Element 63 is the 5th element from the last and its moved to last position and 59 is deleted
which was the last element previously.*/
public class RemoveKthElementSinglyLinkedList {
	static Node head;
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		RemoveKthElementSinglyLinkedList obj = new RemoveKthElementSinglyLinkedList();
		obj.createSinglyLinkedList();
		obj.print();
		obj.removeKthElement();
		obj.print();
	}

	private void print() {
		System.out.print(head.val);
		Node temp = head.next;
		while (temp != null) {
			System.out.print(" <- " + temp.val);
			temp = temp.next;
		}
		System.out.println();

	}

	void createSinglyLinkedList() {
		System.out.print("Enter the size : ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + (i + 1) + " : ");
			int num = scan.nextInt();
			addFirst(num);
		}
	}

	void addFirst(int num) {
		Node newNode = new Node();
		newNode.val = num;
		newNode.next = head;
		head = newNode;

	}

	void removeKthElement() {
		System.out.print("Enter the k : ");
		int k = scan.nextInt();
		int index = 1;
		int kthValue = 0;
		Node temp = head;
		while (temp.next != null) {
			if (index == k - 1) {
				kthValue = temp.next.val;
				temp.next = temp.next.next;
				break;
			} else {
				temp = temp.next;
			}
			index++;
		}
		head.val = kthValue;

	}

}

class Node {
	int val;
	Node next;

	Node() {
	};
}
