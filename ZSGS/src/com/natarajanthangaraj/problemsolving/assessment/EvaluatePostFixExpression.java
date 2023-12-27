package com.natarajanthangaraj.problemsolving.assessment;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostFixExpression {
//"42*31-/5+"
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EvaluatePostFixExpression epf = new EvaluatePostFixExpression();
		System.out.print("Enter the String : ");
		String str = scan.next();
		System.out.println("The answer is : " + epf.Evaluate(str));
	}

	private int Evaluate(String str) {
		Stack<Integer> stack = new Stack<>();
		int front = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-') {
				if (!(str.charAt(i - 1) >= '0' && str.charAt(i - 1) <= '9')) {
					stack.push(0 - Character.getNumericValue(str.charAt(i + 1)));
					i++;

				}
			} else {
				switch (str.charAt(i)) {
				case '+' -> {
					front = stack.pop();
					stack.push(stack.pop() + front);
				}
				case '-' -> {
					front = stack.pop();
					stack.push(stack.pop() - front);
				}
				case '/' -> {
					front = stack.pop();
					try {
						stack.push(stack.pop() / front);

					} catch (Exception e) {
						System.out.println("Invalid test case");
					}
				}
				case '*' -> {
					front = stack.pop();
					stack.push(stack.pop() * front);
				}
				default -> {
					stack.push(Character.getNumericValue(str.charAt(i)));
				}
				}
			}
		}
		return stack.peek();
	}

}
