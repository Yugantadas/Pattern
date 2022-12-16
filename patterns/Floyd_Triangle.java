package com.electroverse.patterns;

public class Floyd_Triangle {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			for(int j=i;j>=1;j--) {
				if(j%2==0)System.out.print(0);
				else System.out.print(1);
			}
			System.out.println();
		}
		
	}

}

/*

1
01
101
0101
10101

*/