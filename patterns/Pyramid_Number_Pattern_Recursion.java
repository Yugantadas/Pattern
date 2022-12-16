package com.electroverse.patterns;

public class Pyramid_Number_Pattern_Recursion {
	
	public static void m1(int len, int i) {
		
		System.out.print(i);
		if(len==1) return;
		m1(--len, i+1);
		System.out.print(i);
		
	}

	public static void main(String[] args) {

		int lim=9;
		for(int i=1;i<=lim;i++) {
			for(int j=lim-1;j>=i;j--) {
				System.out.print(" ");
			}
			m1(i,1);
			System.out.println();
			
		}
		
	}

}
/*

    1
   121
  12321
 1234321
123454321

*/