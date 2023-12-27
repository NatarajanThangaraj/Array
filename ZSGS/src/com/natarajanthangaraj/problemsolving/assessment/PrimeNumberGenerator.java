package com.natarajanthangaraj.problemsolving.assessment;

import java.util.Scanner;

public class PrimeNumberGenerator {

	public static void main(String[] args) {
		PrimeNumberGenerator prime = new PrimeNumberGenerator();
		int num = prime.getNumber();
		prime.getAllPrimeNumbers(num);
	}

	private void getAllPrimeNumbers(int limit) {
		boolean[] arr = new boolean[limit];
		arr[0] = true;
		arr[1] = true;

		for (int i = 2; i < 10; i++) {
			int temp = i * i;
			while (temp < limit) {
				arr[temp] = true;
				temp += i;
			}
		}
		System.out.println("The all prime numbers are within "+limit+":");
		for (int i = 0; i < limit; i++) {
			if (!arr[i]) {
				System.out.print(i + " , ");
			}
		}
	}

	private int getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		return n;
	}

}
