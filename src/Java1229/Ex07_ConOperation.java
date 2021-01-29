/*
 *Date : 2020.12.29
 *Author: inchoriya
 *Description: 조건연산자(ConditionalOperation)
 *Version: 1.0
 */
package Java1229;

public class Ex07_ConOperation {

	public static void main(String[] args) {
		// 상항연산자, 조건연산자
		//(조건식) ? '참'일때 값 : '거짓'일때 값
		
		int inchoriyaAge =20;
		int sanggilTAge = 30;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		resultChar = (inchoriyaAge > sanggilTAge) ? 'T' : 'F';
		System.out.println("resultChar : " + resultChar);
		
		resultInt = (inchoriyaAge < sanggilTAge) ? 86 : 20;
		System.out.println("resultChar : " + resultInt);
		
		resultStr = (inchoriyaAge == sanggilTAge) ? "참일때" : "거짓일때";
		System.out.println("resultChar : " + resultStr);
		
		//Q. 조건연산자를 사용하여 10이 짝수인 경우에는 true, 홀수인 경우 false를 출력해라
		
		int num = 10;
		boolean isEven;
		
		isEven = (num%2==0) ? true : false;
		
		//(num%2==0) 홀수
		System.out.println(isEven);// =>짝수면 true / 홀수면 false
		
		

	}

}
