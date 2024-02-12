package com.natarajanthangaraj.problemsolving.rajeesan.assessment.assesement2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FrequencySort {

	public static void main(String[] args) {
		int[]arr= {2,3,2,4,5,12,2,3,3,3,12};
		System.out.println(Arrays.toString(frequencySort(arr)));
	}

	private static int[] frequencySort(int[] arr) {
		Map<Integer,Integer>map=new TreeMap<>();
		List<Map.Entry<Integer,Integer>>list=new ArrayList<>();
		for(int x:arr) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		//System.out.println(map);
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			list.add(entry);
		}
		Collections.sort(list,(a ,b) -> b.getValue()-a.getValue());
		int[] ans=new int[arr.length];
		int n=0;
		for(Entry<Integer,Integer> entry:list) {
			for(int i=0;i<entry.getValue();i++) {
				ans[n++]=entry.getKey();
			}
		}
		return ans;
	}

}
