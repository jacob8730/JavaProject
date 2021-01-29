/*
 *Date : 2021.01.04
 *Author: jacob
 *Description: 반복문 do~while
 *Version: 1.0
 */
package Jave0104;

import java.util.Scanner;

public class Ex03_ForExam2 {

	public static void main(String[] args) {
		// 다이아몬드 !!!
		
		/*
		 
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
			
			1) 9줄 다이아몬드
			2) 숫자(줄)를 입력받아서 다이아몬드 만들기
		 */
		
		  
/*		int i; 
		int j; 
		int k; 
		 
		for (i = 0; i < 5; i++) { 
			for (j = 0; j < 5-i; j++) {
				System.out.print(" "); 
				}
			for (k = 0; k < i * 2 + 1; k++) {
				System.out.print("*"); 
				}
				System.out.println();
				}
		
		for (i =5; i >= 0; i--) { 
			for (j = 0; j < 5-i; j++) {
				System.out.print(" "); 
				}
			for (k = 0; k < i * 2 + 1; k++) {
				System.out.print("*"); 
				}
				System.out.println();
				}
*/	
		
		System.out.print("숫자(홀수)를 입력해주세요!>>");
		Scanner sc = new Scanner(System.in);
		/* ex) 숫자 5를 입력했을때 */
		int line/* 5 */ = sc.nextInt();

		if (line/* 6 */ % 2 == 0) {
			System.out.println("입력하신 숫자" + line + "는 짝수 입니다.");
			line += 1;/*7*/
			System.out.println("입력하신 숫자 +1을 한후" + line + "(으)로 진행하겠습니다.");
		}
		// 짝수가 입력이된 경우 +1을 해서 적용해준다.

		int space = line/* 5 */ / 2;
		int star = 1;

		for (int i = 1; i <= line; /* 5 */ i++) {
			// 라인 값 =>>>5
			for (int j = 1; j <= space; /* 2.5 */ j++) {
				System.out.print(" ");
			} // 상단 공백
			for (int k = 1; k <= star; /* 1 */ k++) {
				System.out.print("*");
			} // 별표
			for (int j = 1; j <= space; /* 2.5 */ j++) {
				System.out.print(" ");
			} // 하단 공백

			if (i < (line/* 5 */ / 2) + 1) {// 라인, 상단 공백 ,별표
				space/* 2.5 */ -= 1;
				star/* 1 */ += 2;
			} else {// 라인, 하단 공백 ,별표
				space/* 2.5 */ += 1;
				star/* 1 */ -= 2;
			}

			System.out.println();
		}

	}

}
