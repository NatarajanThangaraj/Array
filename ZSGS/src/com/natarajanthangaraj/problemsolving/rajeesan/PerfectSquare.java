package com.natarajanthangaraj.problemsolving.rajeesan;

public class PerfectSquare {
	static int max = 0;

	public static void main(String[] args) {
		PerfectSquare obj = new PerfectSquare();
		String str = "8314";
		obj.Combinations(str, "", str.length());

	}

	private void Combinations(String str, String temp, int n) {
		if (str.equals("")) {
			if (!temp.equals("") && isPerfectSquare(temp) && max < Integer.parseInt(temp)) {
				System.out.println(temp + " " + (n - temp.length()));
				max =Integer.parseInt(temp);
			}
			return;
		}
		Combinations(str.substring(1), temp + str.charAt(0), n);
		Combinations(str.substring(1), temp, n);
	}

	boolean isPerfectSquare(String str) {
		int num = Integer.parseInt(str);
		int mul = (int) Math.sqrt(num);
		return num % mul == 0;
	}

}
