package com.natarajanthangaraj.problemsolving.rajeesan.assessment;

public class EquivalentHexaValue {

	public static void main(String[] args) {
		String str="hello world";
		System.out.println("Hexa value of "+str+"  ->  "+findHexaValue(str));
	}

	private static StringBuffer findHexaValue(String str) {
		StringBuffer s=new StringBuffer();
		char[]arr=str.toCharArray();
		int factor,remain;
		for(char x:arr) {
			factor=x/16;
			remain=x%16;
			if(factor<10) {
				s.append(Integer.toString(factor));
			}else  {
				s.append((char)(('A'-10)+factor));
			}
			if(remain<10) {
				s.append(Integer.toString(remain));
			}else {
				s.append((char)(('A'-10)+remain));
			}
		}
		
		return s;
	}

}
