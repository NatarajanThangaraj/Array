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
		int start=0,end=0,len=str.length();
		List<String>list=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		while(end<len) {
		while(end<len&&str.charAt(end)!=' ') {
			end++;
		}
		
		list.add(str.substring(start,end));
		end++;
		start=end;
		
		}
		for(int i=list.size()-1;i>=0;i--) {
			if(i!=0)
			sb.append(list.get(i)+" ");
			else {
				sb.append(list.get(i));
			}
		}
		return sb.toString();
	}

}
