package com.electroverse.patterns;

public class Arrow_Pattern {

	public static void main(String[] args) {
		
		int len = 10;
		for(int i=1;i<=len;i++) {
			for(int j=len;j>=i;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=(5*len);i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=1;i<=len;i++){
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=len;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}