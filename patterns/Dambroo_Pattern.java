package com.electroverse.patterns;

public class Dambroo_Pattern {

	public static void main(String[] args) {

		int len=10;
		for(int i=1;i<=len;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=len;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=len-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=len;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
//* * * * * * * 
// * * * * * * 
//  * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 
//* * * * * * * 