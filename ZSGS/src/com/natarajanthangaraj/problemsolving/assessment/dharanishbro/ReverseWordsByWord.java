package com.natarajanthangaraj.problemsolving.assessment.dharanishbro;

import java.util.ArrayList;
import java.util.List;

/*1.Reverse the words by word eg: input : "Zoholics India begins"       
 * output:"begins India Zoholics"*/
public class ReverseWordsByWord {

	public static void main(String[] args) {
		String str= "This is a sentence with numbers 1234567890 and special characters !@#$%^&()_+";
		System.out.println(reverseWords(str));

	}

	private static String reverseWords(String str) {
		int len=str.length();
		int start=len,end=len-1;
		StringBuilder sb=new StringBuilder();
		while(end>=0) {
		while(end>=0&&str.charAt(end)!=' ') {
			end--;
		}
		
		sb.append(str.substring(end+1,start)+" ");
		end--;
		start=end+1;
		
		}
		return sb.toString();
	}

}
