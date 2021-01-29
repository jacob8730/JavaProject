/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: 계산기(Calculator)
 *Version: 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex01_Calculator {

	public static void main(String[] args) {
		// 연산자(Operation)
		// 입력(Scanner)

		// 간단한 계산기 만들기
		// 두개의 정수를 입력 받아서 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		// 입력을 받기 위해 Scanner
		
		int num1;
		int num2;
		// 두개의 정수를 입력받기 위해 num변수 2개 생성


		int result1, result2, result3, result4, result5;
		// 더하기,빼기,곱하기,나누기,나머지 5개의 결과값을 출력 하기 위해
		// result변수 5개 생성

		System.out.print("첫번째 숫자 입력 >>");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 >>");
		num2 = sc.nextInt();

		result1 = num1 + num2;
		result2 = num1 - num2;
		result3 = num1 * num2;
		result4 = num1 / num2;
		result5 = num1 % num2;

		System.out.println("덧셈 결과 : " + result1);
		System.out.println("빼기 결과 : " + result2);
		System.out.println("곱셈 결과  : " + result3);
		System.out.println("나눗셈 결과 : " + result4);
		System.out.println("나머지 결과  : " + result5);

		int result;

		result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);

		result = num1 - num2;
		System.out.println("빼기 결과 : " + result);

		result = num1 * num2;
		System.out.println("곱셈 결과 : " + result);

		result = num1 / num2;
		System.out.println("나눗셈 결과 : " + result);

		result = num1 % num2;
		System.out.println("나머지 결과 : " + result);

	}

}
