import java.util.Scanner;
public class Xpattern {
	public static void main(String[] args) {
      String str=getString();
        if(str.length()%2==0)
           isEven();
         else
           isOdd(str);
	}
	private static String getString() {
		Scanner scan=new Scanner(System.in);
		 System.out.print("Enter the String : ");
		  String str=scan.nextLine();
		   scan.close();
		   return str;
		   
	}
	private static void isEven() {
		System.out.println(0);
		
	}
	
	private static void isOdd(String str) {
		int n=str.length();
		for(int i=0;i<n;i++) {
		   for(int j=0;j<n;j++) {
				 if(i==j||i+j==(n-1))
					System.out.print(str.charAt(j)+" ");
				else
					System.out.print("  ");
		}
		            System.out.println();
	}

}
}
