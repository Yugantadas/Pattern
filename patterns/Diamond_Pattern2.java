package com.electroverse.patterns;

public class Diamond_Pattern2 {

	public static void main(String[] args) {
		
		int len=10;
		for(int i=len;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=len;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=len;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=len;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
