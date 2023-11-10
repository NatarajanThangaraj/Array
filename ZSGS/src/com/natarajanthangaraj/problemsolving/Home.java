package com.natarajanthangaraj.problemsolving;
import java.util.Scanner;
import java.lang.reflect.*;
public class Home {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scan=new Scanner(System.in);
		Class<?>clazz=Class.forName("com.natarajanthangaraj.problemsolving.FindArea");
		Method[] methods=clazz.getDeclaredMethods();
		System.out.println("Select any shape : ");
		showMethods(methods);
	}
	public static void showMethods(Method[] arr) {
		int index=1;
		for(Method x:arr) {
			System.out.println((index++)+" -> "+x.getName());
		}
	}

}
