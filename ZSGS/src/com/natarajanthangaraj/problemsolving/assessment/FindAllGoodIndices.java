package com.natarajanthangaraj.problemsolving.assessment;
import java.util.ArrayList;
import java.util.List;

public class FindAllGoodIndices {

	public static void main(String[] args) {
		FindAllGoodIndices goodIndex=new FindAllGoodIndices();
		int[] arr= {878724,201541,179099,98437,35765,327555,475851,598885,849470,943442};
		int k=4;
		System.out.println(goodIndex.findGoodIndex(arr,k));

	}

	private List<Integer> findGoodIndex(int[] arr, int k) {
		List<Integer>list=new ArrayList<>();
		for(int i=k;i<arr.length;i++) {
			if(isGoodIndex(arr,i,k)) {
				list.add(i);
			}
		}
		return list;
	}

	private boolean isGoodIndex(int[] arr, int index, int k) {
		for(int i=index;i<arr.length-k;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		for(int i=index-k;i<index;i++) {
			if(arr[i]<arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
