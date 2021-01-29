/*
 *Date : 2020.12.29
 *Author: inchoriya
 *Description: 산술연산자(arithmeticOperation)
 *Version: 1.0
 */
package Java1229;

public class Ex04_ariOperation {

	public static void main(String[] args) {
		// 정수형 변수 2개 선언 (a,b)
		//+,-,*,/,%연산 수행
		
		int a = 7;
		int b = 2;
		int result = 0;
		
		// +연산(더하기)
		result = a + b;
		System.out.println("+ 결과 : " + result); // 7+2=9
		
		// -연산(빼기)
		result = a - b;
		System.out.println("- 결과 : " + result);	//	7-2=5
		
		// *연산(곱하기)
		result = a * b;
		System.out.println("* 결과 : " + result);	//	7*2=14
		
		// /연산(나누기)
		result = a / b;
		System.out.println("/ 결과 : " + result);	//	7/2=3
		
		// %연산(나머지)
		result = a % b;
		System.out.println("% 결과 : " + result);	//	7%2=1
		
		//Q.7나누기 2의 결과가 3.5가 나오게 작성하시오!
		double a1 = 7;
		double b1 = 2;
		double result1 = 0;
		
		result1 = a1 / b1;
		System.out.println("/ 결과 : " + result1);
		
		double result2 = (double)a1 / b1; 
		System.out.println("/ 결과 : " + result2);
		
		
	}

}
