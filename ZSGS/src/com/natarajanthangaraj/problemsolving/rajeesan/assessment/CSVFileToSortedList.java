package com.natarajanthangaraj.problemsolving.rajeesan.assessment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CSVFileToSortedList {

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer>list=new ArrayList<>();
		int salary=0;
		Scanner scan=new Scanner(new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\ZSGS\\ZSGS\\src\\com\\natarajanthangaraj\\problemsolving\\rajeesan\\StockPrices.csv"));
		scan.next();
		while(scan.hasNext()) {
			salary=scan.nextInt();
			list.add(salary);
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
