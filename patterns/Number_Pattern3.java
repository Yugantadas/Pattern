package com.electroverse.patterns;

import java.util.Scanner;

public class Number_Pattern3 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of rows");
			int lim=sc.nextInt();
			int n=1;
			for(int i=1;i<=lim;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(n++ + " ");
				}
				System.out.println();
			}
		}
		
	}

}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 
*/