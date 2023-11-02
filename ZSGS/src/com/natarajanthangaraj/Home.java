package com.natarajanthangaraj;

import java.io.*;
import java.lang.reflect.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Home {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ArrayList<File> packages = new ArrayList<>();
		setPackages(packages);
		int gate = 1;
		do {
			showPackages(packages);
			System.out.print("Enter Package Number [ '0' to Exit ] : ");
			int select = scan.nextInt();
			if (select == 0) {
				break;
			}
			File selectedPackage;
			if (select <= packages.size()) {
				selectedPackage = packages.get(select - 1);
			} else {
				System.out.println("<-<-<-<-<- Invalid Number ->->->->->");
				continue;
			}
			File[] classes = selectedPackage.listFiles();
			showClasses(classes);
			System.out.print("Select any Pattern [ '0' to Exit ] : ");
			int clazz=scan.nextInt();
			if (clazz <= classes.length) {
				excuteMethod(classes[clazz-1]);
			} else {
				System.out.println("<-<-<-<-<- Invalid Number ->->->->->");
				continue;
			}
			
		} while (gate != 0);
	}

	private static void setPackages(ArrayList<File> filesList) {
		File file = new File("src/com/natarajanthangaraj");
		File[] files = file.listFiles();
		for (File eachFile : files) {
			if (eachFile.isDirectory())
				filesList.add(eachFile);
		}
	}

	private static void showPackages(ArrayList<File> filesList) {
		int index = 1;
		System.out.println("-----All Packages-----");
		for (File pack : filesList) {
			System.out.println((index++) + " . " + pack.getName());
		}
	}
	 private static void showClasses(File[] classes) {
		 System.out.println("----------My Pattern---------");
		 int index=1;
		 for(File eachClass:classes) {
				System.out.println((index++)+" "+eachClass.getName());
	 }
	 }
	 private static void excuteMethod(File selClass) throws Exception {
		 String path=selClass.getPath().replaceAll("\\\\",".");
		 String exactPath=path.substring(4,path.length()-5);
		 Class<?> c=Class.forName(exactPath); 
		 Method m=c.getDeclaredMethod("main", String[].class);
		 m.invoke(m, (Object)null);
		 System.out.println();
		 
	 }

}
