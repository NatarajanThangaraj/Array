import java.util.Scanner;

public class GrandChild {
	public static void main(String[] args) {
		String[][]family=familyDetails();
		String fatherName=fatherName();
		System.out.println("----->"+fatherName+" has "+countGrandChildren(family,fatherName)+ " grandChildren");
	}

	private static String[][] familyDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the No.Of Rows in the Array:");
		  int n = scan.nextInt();
		          scan.nextLine();
		  String[][]family=new String[n][2];
		System.out.println("-----Enter family details-----");
		  for (int i = 0; i < family.length; i++) {
			  System.out.print("Enter Child Name :");
			    family[i][0] = scan.nextLine();
			                   
			  System.out.print("Enter Father Name :");
			    family[i][1] = scan.nextLine();
			     
		} 
		return family;
	}
	private static String fatherName() {
		Scanner scan=new Scanner(System.in);
		String fatherName;
		System.out.print("----->Enter Father Name to find GrandChildren:");
	     fatherName = scan.nextLine();
	      return fatherName;
	      
	}
    
	private static int countGrandChildren(String[][]arr,String father) {
       int grandChilds=0;
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i][1].equals(father)) {
    		   for(int j=0;j<arr.length;j++) {
    			   if(arr[j][1].equals(arr[i][0]))
    				   grandChilds++;
    		   }
    	   }
       }
		return grandChilds;
	}
	

}
