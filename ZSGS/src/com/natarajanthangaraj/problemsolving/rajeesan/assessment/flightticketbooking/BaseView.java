package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseView {
	Scanner scan = new Scanner(System.in);

	protected int getInt() {
		int n;
		while (true) {
			try {
				n = scan.nextInt();
				scan.nextLine();
				return n;
			} catch (InputMismatchException e) {
				System.out.print(" Enter valid Input : ");
			}
		}
	}
	protected String getString() {
		return scan.nextLine();
	}
}
