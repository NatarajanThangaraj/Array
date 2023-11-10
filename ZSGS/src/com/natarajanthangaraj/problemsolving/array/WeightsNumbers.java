package com.natarajanthangaraj.problemsolving.array;
import java.util.Arrays;
import java.util.Scanner;

public class WeightsNumbers {

	public static void main(String[] args) {
		for (int[] x : sortByWeight(getNumbers()))
			System.out.print(Arrays.toString(x) + " ");

	}

	public static int[][] getNumbers() {
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the Array Length :");
		  int n = scan.nextInt();
		   int[][] NumbersArray = new int[n][2];
		    for (int i = 0; i < n; i++) {
			 System.out.print("Enter" + (i + 1) + "'s weight :");
			  NumbersArray[i][0] = scan.nextInt();
			   NumbersArray[i][1] = basedOnWeight(NumbersArray[i][0]);
		}
		return NumbersArray;
	}

	public static boolean isPerfectSquare(int number) {
		return (((int) Math.sqrt(number)) * (int) Math.sqrt(number) == number);
	}

	public static boolean isMultiandDivisor(int number) {
		return ((number % 4 == 0) && (number % 6 == 0));
	}

	public static boolean isEvenNumber(int number) {
		return (number % 2 == 0);
	}

	private static int basedOnWeight(int num) {
		int sum = 0;
		if (isPerfectSquare(num))
			sum += 5;
		if (isMultiandDivisor(num))
			sum += 4;
		if (isEvenNumber(num))
			sum += 3;
		return sum;
	}

	private static int[][] sortByWeight(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i][1] < arr[j][1]) {
					int[] temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
