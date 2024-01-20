package com.natarajanthangaraj.problemsolving.rajeesan;

import java.util.Arrays;

public class ProductOfAllElement {

	public static void main(String[] args) {
		ProductOfAllElement ans=new ProductOfAllElement();
		int[] arr= {1,2,3,4};
		System.out.println(Arrays.toString(ans.productOfAll(arr)));

	}
	private int[] productOfAll(int[] arr) {
		int sum=1;
		for(int each:arr) {
			sum*=each;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=sum/arr[i];
		}
		return arr;
	}
	

}
