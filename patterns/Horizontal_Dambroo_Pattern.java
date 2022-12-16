package com.electroverse.patterns;

public class Horizontal_Dambroo_Pattern {

	public static void main(String[] args) {
		
		int len=5;
		for(int i=1;i<=len-2;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			for(int j=3;j>=1;j-=2) {
				System.out.print(" ");
			}
//			for(int j=)
//			System.out.println();
		}

	}

}
