package com.electroverse.patterns;

public class Pussy_Pattern {

	public static void main(String[] args) {

		int a=5,b=5;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(j==a||j==b) {
					System.out.print("* ");
					a--;
					b++;
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}