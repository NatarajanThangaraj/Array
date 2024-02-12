package com.natarajanthangaraj.problemsolving.rajeesan.assessment.assesement2;

public class ConsecutiveOccurences {

	public static void main(String[] args) {
		String str="xyyyyzzzabb";
		System.out.println(findAllOccurence(str));
	}

	private static StringBuffer findAllOccurence(String str) {
		StringBuffer ans=new StringBuffer();
		char ini=str.charAt(0);
		int count=0;
		int index=0;
		char[]arr=str.toCharArray();
		while(index<arr.length) {
			ini=arr[index];
		while(arr[index]==ini) {
			//System.out.println(index+" "+ini);
			
			index++;
			count++;
			if(index==arr.length) {
				break;
			}
			
			
		}
		if(count==1) {
			ans.append(ini);
		}else {
			ans.append(ini+""+count);
		}
		
		count=0;
		
		//index++;
		}
		return ans;
	}

}
