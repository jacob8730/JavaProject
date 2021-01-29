/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: 조건문(ElseIf)
 *Version: 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex03_Elseif {

	public static void main(String[] args) {
		/*
		 * else-if : 여러개의 조건문을 비교할 때 사용
		 * 
		 * if(조건식1){ 
		 * 	조건식1이 참(true)일 경우 실행 
		 * }else if(조건식2){ 
		 * 	조건식2가 참(true)일 경우 실행
		 * }else{ 
		 * 	모든 조건식이 거짓(false)일 경우
		 * }
		 * 
		 */

		int num1 = 5;
		int num2 = 5;

		if (num1 > num2) {
			System.out.println("num1이 크다.");
		} else if (num1 < num2) {
			System.out.println("num2가 크다.");
		} else {
			System.out.println("num1과 num2는이 크다.");
		}

		// Q. 시험점수를 입력받아서
		// 90점 이상은 A학점
		// 80점 이상은 B학점
		// 그외에는 C학점이 출력되도록 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);

		System.out.print("시험점수입력");
		int score = sc.nextInt();

		System.out.print("기말고사 학점은");
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.print("입니다.");

	}

}
