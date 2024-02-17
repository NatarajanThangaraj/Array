package com.natarajanthangaraj.problemsolving.assessment.dharanishbro;
/*)An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.
Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.*/
public class UglyNumber {

	public static void main(String[] args) {
		int n=121;
		boolean isUgly=isUglyNumber(n);
		if(isUgly) {
			System.out.println(n+" is a Ugly Number");
		}else {
			System.out.println(n+" is  Not a Ugly Number");
		}

	}

	private static boolean isUglyNumber(int n) {
		if(n<=0||n==1) return false;
		while(n>1) {
			if(n%2==0) {
				n=n/2;
			}else if(n%3==0) {
				n=n/3;
			}else if(n%5==0) {
				n=n/5;
			}else {
				return false;
			}
		}
		return true;
	}

}
