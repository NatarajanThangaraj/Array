package com.natarajanthangaraj.problemsolving.practice;
import java.util.Scanner;
import java.io.File;
public class ShapeDemo{
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("----------ALL SHAPES----------");
		showFiles(getAllClass());
		System.out.print("Enter a Number : ");
		int num=scan.nextInt();
	}
	public static File[] getAllClass() throws Exception{
		File f=new File("ZSGS/src/com/natarajanthangaraj/problemsolving/practice");
		File[] fileArr=f.listFiles();
		return fileArr;
	}
	public static void showFiles(File[] arr) {
		int index=1;
		for(File x:arr) {
			System.out.println((index++)+" -> "+x.getName());
		}
	}

}
