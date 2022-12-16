package com.electroverse.patterns;

public class Number_Pattern4 {

	public static void main(String[] args) {

		int a=1;
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		
	}

}

/*

   1 
  2 3 
 4 5 6 
7 8 9 10 

*/