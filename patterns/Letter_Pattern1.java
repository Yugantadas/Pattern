package com.electroverse.patterns;

import java.util.Scanner;

public class Letter_Pattern1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the range");
			char ch=sc.next().charAt(0);
			for(char i='a';i<=ch;i++) {
				for(char j='a';j<=i;j++) System.out.print(j);
				System.out.println();
			}
		}
		
	}

}
/*
a
ab
abc
abcd
abcde
abcdef
abcdefg
*/