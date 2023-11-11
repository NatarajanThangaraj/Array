package com.natarajanthangaraj.problemsolving.evaluation;
import java.util.Scanner;
public class Spiral {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       makeSpiral(4);
	}
	private static void makeSpiral(int n) {
		int[][]arr=new int[n][n];
		int i=0,j=0,index=1,left=0,bottom=n,top=0,right=n;
       while(true) {
    	   if(j==left||i==top) {
    		 while(i<bottom) {
    			 arr[i][j]=index++;
    			 i++;
    			 j++;
    		     }
    		 
    	      }
    	                             left++;
    	                             bottom-=2;
    	   if(i==right||j==right) {
    		   i--;
    		   j--;
    		   while(i>top) {
    			   i--;
    			  arr[i][j]=index++;
    			  
    		   }
    	   }
    	                             right--;
    	   if(i==top) {
    		   while(j>left) {
    			   j--;
    			   arr[i][j]=index++;
    		   }
    		   System.out.println(i+" "+j);
    	   }
    	   i++;j++;
   	                             top++;
    	   if(left==n-2) {
    		   break;
    	   }
       }
		     
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(arr[i][j]!=0)
		            System.out.print(arr[i][j] + " ");
		        	 else {
		        		 System.out.print("  ");
		        	 }
			}
			System.out.println();
		}
	}

}

