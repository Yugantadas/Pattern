 package com.electroverse.patterns;

public class Number_Pattern5 {

	public static void main(String[] args) {

		int a = 1,b=10;
		for(int i = 1;i<=5;i++) {
			if(i%2!=0) {
				for(int j= a;j<=a+4;j++) {
					System.out.print(j+" ");
				}
				a+=10;
			}
			
			if(i%2==0) {
				for(int j=b;j>=b-4;j--) {
					System.out.print(j+" ");
				}
				b+=10;
			}
			
			System.out.println();
		}
		
	}

}
//1 2 3 4 5 
//10 9 8 7 6 
//11 12 13 14 15 
//20 19 18 17 16 
//21 22 23 24 25 