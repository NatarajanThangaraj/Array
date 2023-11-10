package com.natarajanthangaraj.problemsolving.evaluation;
import java.util.Scanner;
public class Jumbled {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number :");
		 int num=scan.nextInt();
		  isJumbled(num);

	}

	private static void isJumbled(int num) {
		int x=0,temp=num%10,ans=num;
		num=num/10;
		boolean flag=true;
		while(num>0) {
			x=num%10;
			num=num/10;
			if(Math.abs(temp-x)!=1) {
				flag=false;
				break;
			}
			temp=x;
		}
		if(flag) {
			System.out.println(ans+" is a jumbled number");
		}
		else {
			System.out.println(ans+" is not a jumbled number");
		}
	}

}
