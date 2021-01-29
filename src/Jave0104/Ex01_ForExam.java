/*
 *Date : 2021.01.04
 *Author: jacob
 *Description: For문 에제
 *Version: 1.0
 */
package Jave0104;

import java.util.Scanner;

public class Ex01_ForExam {

	public static void main(String[] args) {
		/*
		 	    * 
		   	   *** 
		 	  ***** 
		 	 ******* 
		 	*********
		 * 
		 * 
		 * 1)피라미드 몇줄로 구성되어 있는가? 
		 * 2)각 줄마다 공백은 어떻게 구성되어 있는가? 양쪽으로 한개씩 줄어든다. 
		 * 3)각 줄마다 *은 어떻게 구성에 구성되어 있는가? 2개씩 증가한다.
		 * 
		 * 라인(i) 1 2 3 4 5 라인 : i 
		 * 공백(j) 4 3 2 1 0 공백 : 5-i 
		 * 별표(k) 1 3 5 7 9 별표 : 2*i-1
		 * 
		 */

		/*
		  int i; 
		  int j; 
		  int k; 
		  int num = 5;
		  
		  for (i = 0; i < num; i++) { for (j = 0; j < num-i; j++) {
		  System.out.print(" "); }
		  
		  for (k = 0; k < i * 2 + 1; k++) { System.out.print("*"); }
		  
		  System.out.println();
		  
		  }
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("심화풀이");
		System.out.println();

		System.out.print("라인 값을 입렫해주세요>>");
		Scanner sc = new Scanner(System.in);

		int line = sc.nextInt();
		int space = line / 2;
		int star = 1;

		for (int i = 1; i < line; i++) {
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
		}
		for (int k = 0; k < star; k++) {
			System.out.print("*");
		}
		for (int j = 0; j < space; j++) {
			System.out.print(" ");
		}

		space -= 1;
		star += 2;

		System.out.println();

	}

}
