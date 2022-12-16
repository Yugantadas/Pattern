package com.electroverse.patterns;

public class Pyramid_Letter_Pattern_Recursion {
	
	public static void m1(int len, int i) {
		
		System.out.print((char)i);
		if(len==1) return;
		m1(--len, i+1);
		System.out.print((char)i);
		
	}

	public static void main(String[] args) {

		int lim=10;
		for(int i=1;i<=lim;i++) {
			for(int j=lim-1;j>=i;j--) {
				System.out.print(" ");
			}
			m1(i,'A');
			System.out.println();
			
		}
		
	}

}
/*

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/