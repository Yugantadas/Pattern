package com.electroverse.patterns;
import java.util.Scanner;

public class Number_Pattern1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("enter the number of columns");
			int c=sc.nextInt();
			System.out.println("enter the number of rows");
			int r=sc.nextInt();
			for(int i=1;i<=r;i++) {
				for(int j=1;j<=c;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
}
/*
123456789
123456789
123456789
123456789
123456789
123456789
123456789
*/