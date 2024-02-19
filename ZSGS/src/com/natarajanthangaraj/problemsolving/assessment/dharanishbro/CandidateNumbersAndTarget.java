package com.natarajanthangaraj.problemsolving.assessment.dharanishbro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*nput: candidates = [10,1,2,7,6,1,5], target = 8
Output:
 [ [1,1,6],
[1,2,5],
[1,7],
[2,6 ] ]
*/
public class CandidateNumbersAndTarget {

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		int target=11;
		Arrays.sort(candidates);
		List<List<Integer>>list=new ArrayList<>();
		combinations(0,candidates,list,new ArrayList<Integer>(),target);
		
		System.out.println(list);
	}

	private static void combinations(int index,int[] candidates, List<List<Integer>> list, ArrayList<Integer> arrayList,
			int target) {
		if(index==candidates.length) {
			if(target==0) {
				if(!list.contains(arrayList))
				list.add(new ArrayList<>(arrayList));
				return;
			}
			return ;
		}
		int num=candidates[index];
		if(num<=target) {
			arrayList.add(num);
			combinations(index+1,candidates,list,arrayList,target-num);
			arrayList.remove(arrayList.size()-1);
		}
		combinations(index+1,candidates,list,arrayList,target);
	}

}
