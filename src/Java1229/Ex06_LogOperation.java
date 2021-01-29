/*
 *Date : 2020.12.29
 *Author: inchoriya
 *Description: 논리연산자(LogicOperation)
 *Version: 1.0
 */
package Java1229;

public class Ex06_LogOperation {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * (1)&&(AND)연산자 : 그리고
		 * 		-A && B 일때 A, B 모두 true여야 결과가 true
		 * 		-A, B중에 하나라도 false 가 있다면 결과는 false
		 * 
		 *  					true(A)			false(A)
		 * 		-true(B):		true			false
		 * 		-false(B):		false			false
		 * 
		 * (2)||(OR)연산자 : 또는 
		 * 		- A || B 일때 A,B중 하나라도 true면 결과는 true
		 * 		- A, B 모두 false여야 결과 false
		 * 
		 * 						true(A)			false(A)
		 * 		-true(B):		true			true
		 * 		-false(B):		true			false
		 * 
		 * (3)!(NOT)연산자 : 아니다
		 * 		-boolean 변수 앞에 사용하면 결과 반전
		 */
		
		boolean result;
		
		// AND 연산자
		result = true && true;
		System.out.println("true && true : " + result);
		
		result = true && false;
		System.out.println("true && true : " + result);
		
		result = (5>3) && (3>1);
		System.out.println(" (5>3) && (3>1) : " + result);
		
		//OR 연산자
		result = true || false;
		System.out.println("true || false : " + result);
		
		result = false || false;
		System.out.println("false || false : " + result);
		
		result = (5>3) || (3<1);
		System.out.println("(5>3) || (3>1) : " + result);
		
		//NOT 연산자
		result = true;
		System.out.println("result : " + result);
		System.out.println("!result : " + !result);
		
		result = !result;
		System.out.println("result : " + result);
		System.out.println("!result : " + !result);
		
		
	}

}
