package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		PostfixExpression obj = new PostfixExpression();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		System.out.println("Answer : "+obj.findAnswer(str));
	}

	private int findAnswer(String str) {
		Stack<Integer> stack = new Stack<>();
		int n = 0;
		for (char x : str.toCharArray()) {
			if (x >= '0' && x <= '9') {
				stack.push(x-'0');
			} else {
				
				switch (x) {
				case '+' -> {
					n = stack.pop();
					stack.push(stack.pop() + n);
				}
				case '-' -> {
					n = stack.pop();
					stack.push(stack.pop() - n);

				}
				case '*' -> {
					n = stack.pop();
					stack.push(stack.pop() * n);
				}
				case '/' -> {
					n = stack.pop();
					if (n != 0)
						stack.push(stack.pop() / n);
				}
				default -> {
					System.out.println(" Invalid input");
				}
				}
			}
		}
		return stack.pop();
	}

}
