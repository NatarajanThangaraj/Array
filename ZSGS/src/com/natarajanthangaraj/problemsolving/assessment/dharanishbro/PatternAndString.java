package com.natarajanthangaraj.problemsolving.assessment.dharanishbro;

import java.util.HashMap;
import java.util.Map;

/*1) Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Input: pattern = "abba", s = "dog cat cat fish"
Output: false*/
public class PatternAndString {

	public static void main(String[] args) {
		String pattern = "abc", s = "dog cat cat";
		System.out.println(isFullMatch(pattern, s));

	}

	private static boolean isFullMatch(String pattern, String s) {
		Map<Character, String> map = new HashMap<>();
		String[] arr = s.split(" ");
		if (arr.length != pattern.length()) {
			return false;
		}

		char eachChar;
		for (int i = 0; i < pattern.length(); i++) {
			eachChar = pattern.charAt(i);
			if (map.containsKey(eachChar)) {
				if (!map.get(eachChar).equals(arr[i].trim())) {
					return false;
				}
			}
			map.put(pattern.charAt(i), arr[i].trim());
		}

		return true;
	}

}
