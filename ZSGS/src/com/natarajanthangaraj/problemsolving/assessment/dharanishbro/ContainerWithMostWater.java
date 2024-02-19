package com.natarajanthangaraj.problemsolving.assessment.dharanishbro;
/* height = [1,8,6,2,5,4,8,3,7]
Output: 49*/
public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		int[]height = {2,3,4,5,18,17,6};
			System.out.println(" Max Area : "+maxArea(height));
	}

	private static int maxArea(int[] height) {
		int maxArea=0,start=0,end=height.length-1;
		while(start<end) {
			int temp=Math.min(height[start], height[end])*(end-start);
			if(maxArea<temp) {
				maxArea=temp;
			}
			if(height[start]<height[end]) {
				start++;
			}else {
				end--;
			}
		}
		return maxArea;
	}

}
