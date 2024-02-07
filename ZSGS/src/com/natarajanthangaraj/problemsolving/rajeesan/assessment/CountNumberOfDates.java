package com.natarajanthangaraj.problemsolving.rajeesan.assessment;

public class CountNumberOfDates {

	public static void main(String[] args) {
		String day1 = "25-08-1998";
		String day2 = "27-09-2020";
		CountNumberOfDates day = new CountNumberOfDates();
		System.out.println("Number of Days between " + day1 + " and " + day2 + " is : " + day.countDays(day1, day2));
	}

	private int countDays(String day1, String day2) {
		int totalDays = daysBetweenYears(Integer.valueOf(day1.substring(day1.length() - 4)),
				Integer.valueOf(day2.substring(day2.length() - 4)));
		int removingDays = Integer.valueOf(day1.substring(0, 2))
				+ getDaysFromMonth(Integer.valueOf(day1.substring(3, 5)));
		int addingDays = Integer.valueOf(day2.substring(0, 2))
				+ getDaysFromMonth(Integer.valueOf(day2.substring(3, 5)));
		if (isLeapYear(Integer.valueOf(day2.substring(day2.length() - 4)))
				&& Integer.valueOf(day2.substring(3, 5)) >= 2) {
			addingDays += 1;
		}
		System.out.println(totalDays + "  " + removingDays + "  " + addingDays);
		return totalDays - removingDays + addingDays;
	}

	private int daysBetweenYears(int year1, int year2) {
		int normalYears = 0, leapYears = 0;
		System.out.println(year1 + " " + year2);
		for (int i = year1; i <= year2 - 1; i++) {
			if (isLeapYear(i)) {
				leapYears++;
			} else
				normalYears++;
		}
		System.out.println(normalYears + " " + leapYears);
		return (normalYears * 365 + leapYears * 366);
	}

	private int getDaysFromMonth(int month) {
		int[] dayArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = 0;
		for (int i = 0; i <= month - 2; i++) {
			days += dayArr[i];
		}
		return days;
	}

	private boolean isLeapYear(int year) {
		return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
	}

}
