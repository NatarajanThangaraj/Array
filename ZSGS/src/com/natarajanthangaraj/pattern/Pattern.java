package com.natarajanthangaraj.pattern;
public class Pattern {
	
	public static void starPattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++) {
				if (i == n || (k == 1 || i == k))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void starPattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			for (int k = i; k <= n; k++) {
				if (i == 1 || (k == i || k == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();

		}

	}

	public static void starPattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (i == 1 || (i == j || j == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void starPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++)
				System.out.print("  ");
			for (int k = i; k <= n; k++) {
				if (i == 1 || (i == k || k == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void starPattern6(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (k = i; k <= n; k++)
				System.out.print(" ");
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n)
					System.out.print("*");
				else if (j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void starPattern5(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++)
				System.out.print(" ");
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n)
					System.out.print("*");
				else if (j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void starPattern10(int n) {
		int i, j, k, l;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++)
				System.out.print("*");
			for (k = 1; k < i; k++)
				System.out.print("  ");
			for (l = i; l <= n; l++)
				System.out.print("*");

			System.out.println();
		}
		for (i = 2; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			for (k = i; k < n; k++)
				System.out.print("  ");
			for (l = 1; l <= i; l++)
				System.out.print("*");
			System.out.println();
		}

	}

	public static void starPattern13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			for (int k = i; k <= n; k++) {
				if (i == 1 || (k == i || k == n))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = i; j <= n; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++) {
				if (i == n || (k == 1 || i == k))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void starPattern14(int n) {
		int i, j, index = 2 * n - 1;
		for (i = 1; i <= index; i++) {
			for (j = 1; j <= index; j++) {
				if (j == 1 || j == index)
					System.out.print("* ");
				else if (i <= n && (j < i || j >= (index + 1) - i))
					System.out.print("* ");
				else if (i > n && (j < (index + 1) - i || j >= i + 1))
					System.out.print("* ");
				else if (i == j || j == (index + 1) - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void starPattern12(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if ((i == 1 || i == n) || (j == 1 || j == n))
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

	}

	public static void starPattern11(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++)
				System.out.print("* ");
			System.out.println();
		}

	}

	public static void starPattern9(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++)
				System.out.print(" ");
			for (k = 1; k <= i; k++) {
				if (k == 1 || k == i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (i = 1; i < n; i++) {
			for (j = 0; j <= i; j++)
				System.out.print(" ");
			for (k = i; k < n; k++) {
				if (k == i || k == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void starPattern8(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++)
				System.out.print("  ");
			for (k = 1; k <= i; k++) {
				if (k == 1 || k == i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (i = 1; i < n; i++) {
			for (j = 0; j <= i; j++)
				System.out.print("  ");
			for (k = i; k < n; k++) {
				if (k == i || k == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void starPattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (j == i || j == n - 1)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
	public static void numbersTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>=0;j--) {
				if(i>=j)
				System.out.print((i+1)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
	public static void downNumberTriangle(int n) {
		int num=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=n;k++)
				System.out.print(" "+num);
			System.out.println();
			num--;
		}
	}
	public static void numberPyramid(int n) {
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++) 
				System.out.print((num++)+" ");
			num-=2;
			for(int l=0;l<i;l++)
				System.out.print(num--+" ");
			System.out.println();
			num=1;
		}
		
	}
	public static void downNumberPyramid(int n) {
		int temp=n,num=n;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++) 
				System.out.print((num++)+" ");
			num-=1;
			for(int l=0;l<i;l++)
				System.out.print((--num)+" ");
			System.out.println();
			num=--temp;
		}
		
	}
//	public static void downNumberTriangle(int n) {
//		for(int i=0;i<n;i++) {
//			int num=1;
//			for(int j=n;j>=0;j--) {
//				if(i>=j)
//				System.out.print((num++)+" ");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}	
//	}

}
