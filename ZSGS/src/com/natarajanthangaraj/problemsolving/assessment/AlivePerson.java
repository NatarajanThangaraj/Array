package com.natarajanthangaraj.problemsolving.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlivePerson {

	public static void main(String[] args) {
		AlivePerson alive=new AlivePerson();
		Scanner scan=new Scanner(System.in);
		int[] arr=alive.getMinMaxYear();
		System.out.print("Enter year between "+arr[0]+"  to  "+arr[1]+" :");
		int year = scan.nextInt();
		alive.findPersons(year);
	}
	private void findPersons(int year) {
		for(Person x:getPersonDetails()) {
			if(x.birthYear<year&&x.deathYear>year) {
				System.out.println(x.personName+" was alive in "+year);
			}
		}
		
	}
	public int[] getMinMaxYear() {
		int min=3000,max=0;
		for(Person x:getPersonDetails()) {
			if(x.birthYear<min) {
				min=x.birthYear;
			}
			if(x.deathYear>max) {
				max=x.deathYear;
			}
		}
		return new int[] {min,max};
	}
	public List<Person> getPersonDetails(){
		List<Person>list=new ArrayList<>();
		list.add(new Person("Natarjan",2001,2100));
		list.add(new Person("Elangovan",2020,2200));
		list.add(new Person("Raguvaran",1990,2000));
		list.add(new Person("Sharif",1997,2020));
		list.add(new Person("vijay",2000,2050));
		return list;
	}

}

class Person {
	String personName;
	int birthYear;
	int deathYear;

	Person(String name, int birth, int death) {
		this.personName = name;
		this.birthYear = birth;
		this.deathYear = death;
	}
}
