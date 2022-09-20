package pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		int i,j,no;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter no");
		no=scn.nextInt();
		
	/*	//using for loop method to execute star  pattern
       for(i=1;i<=no;i++) {
    	   for(j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       **/
		
		/*
		//for printing number piramid
		for(i=1;i<=no;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		**/
		/*
		 1
		 1 2
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5
		 * 
		 */
	/*	for(i=1;i<=no;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		**/
		/*
		 2
		 2 3
		 2 3 4
		 2 3 4 5
		 2 3 4 5 6
		 */
		for(i=2;i<=no;i++) {
			for(j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
