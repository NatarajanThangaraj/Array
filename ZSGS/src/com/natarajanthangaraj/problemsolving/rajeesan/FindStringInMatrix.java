package com.natarajanthangaraj.problemsolving.rajeesan;

/*Given a 2D grid of characters, you have to search for all the words in a dictionary by
moving only along two directions, either right or down. Print the word if it occurs.
Sample :
a z o l
n x h o
v y i v
o r s e
Dictionary = {van, zoho, love, are, is}
Output:
zoho
love
Is*/
public class FindStringInMatrix {

	public static void main(String[] args) {
		FindStringInMatrix obj = new FindStringInMatrix();
		char[][] matrix = { { 'a', 'z', 'o', 'l' }, { 'n', 'x', 'h', 'o' }, { 'v', 'y', 'i', 'v' },
				{ 'o', 'r', 's', 'e' } };
		String[] arr = { "zoho", "van", "love", "are", "is" };
		for (int i = 0; i < arr.length; i++) {
			obj.findOccurence(matrix, arr[i]);
		}
	}

	private void findOccurence(char[][] mat, String str) {
		// boolean flag=false;
	for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == str.charAt(0)) {
					if(check(mat,i,j,str)) {
						System.out.println(str);
						return;
					}
				}
			}
		}

	}
	public boolean check(char[][]mat,int x,int y,String str) {
		int index = 0;
		boolean flag;
		while (index < str.length()) {
			flag=false;
			index++;
			if (y < mat[0].length && mat[x][y + 1] == str.charAt(index)) {
				y = y + 1;
				flag=true;
			} else if (x < mat.length && mat[x + 1][y] == str.charAt(index)) {
				x = x + 1;
				flag=true;
			}
			if (index == str.length()) {
				return true;
			}
			if(!flag) {
				return false;
			}
		}
		return false;
	}

}
//private int findCountOfWord(char[][] matrix, String word) {
//	int count=0;
//	int wlen=word.length(),mlen=matrix.length;
//	for(int i=0;i<mlen;i++) {
//		for(int j=0;j<mlen;j++) {
//			if(matrix[i][j]==word.charAt(0)) {
//				if((j+wlen-1)<mlen) {
//					count+=leftToRight(matrix,i,j,word);
//				}
//			    if((i+wlen)<mlen) {
//					count+=topTobottom(matrix,i,j,word);
//				}
//				 if((j-wlen-1)>=0) {
//					count+=rightToLeft(matrix,i,j,word);
//				}
//				else {
//					count+=bottomToTop(matrix,i,j,word);
//				}
//			}
//		}
//	}
//	return count;
//}
//
//private int bottomToTop(char[][] matrix, int i, int j, String word) {
//	String str="";
//	int k=i;
//	System.out.println(i+" "+j);
//	while(str.length()<word.length()) {
//		str+=matrix[k][j];
//		k--;
//	}
//	System.out.println(str+"bt");
//	if(str.equals(word)) {
//		return 1;
//	}
//	return 0;
//}
//
//private int leftToRight(char[][] matrix, int i, int j, String word) {
//	String str="";
//	int k=j;
//	while(str.length()<word.length()) {
//		str+=matrix[i][k];
//		k++;
//	}
//	System.out.println(str);
//	if(str.equals(word)) {
//		return 1;
//	}
//	return 0;
//}
//
//private int topTobottom(char[][] matrix, int i, int j, String word) {
//	String str="";
//	int k=i;
//	while(str.length()<word.length()) {
//		str+=matrix[k][j];
//		k++;
//	}
//	System.out.println(str);
//	if(str.equals(word)) {
//		return 1;
//	}
//	return 0;
//}
//
//private int rightToLeft(char[][] matrix, int i, int j, String word) {
//	String str="";
//	int k=j;
//	while(str.length()<word.length()) {
//		str+=matrix[i][k];
//		k--;
//	}
//	System.out.println(str+"rl");
//	if(str.equals(word)) {
//		return 1;
//	}
//	return 0;
//}
