/*
 *Date : 2020.12.29
 *Author: inchoriya
 *Description: 관게연산자(relationalOperation)
 *Version: 1.0
 */
package Java1229;

public class Ex05_RelOperation {

	public static void main(String[] args) {
		// 정수형 변수 2개를 선언
		// >, <, >=, <=, ==, != 연산 수행

		int num1 = 7;
		int num2 = 2;
		boolean result;

		// boolean 논리형 데이터 타입
		// 맛다! 틀리다! 둘중 하나
		// true false

		// num1이 num2보다 크다.
		result = num1 > num2; // 7 > 2 = true
		System.out.println("num1 > num2 : " + result);

		// num1이 num2보다 작다.
		result = num1 < num2; // 7 > 2 = false
		System.out.println("num1 < num2 : " + result);

		// num1이 num2보다 크거나 같다.
		result = num1 >= num2; // 7 >= 2 = true
		System.out.println("num1 >= num2 : " + result);

		// num1이 num2보다 작거나 같다.
		result = num1 <= num2; // 7 <= 2 = false
		System.out.println("num1 <= num2 : " + result);

		// num1이 num2랑 같다.
		result = num1 == num2; // 7 == 2 = false
		System.out.println("num1 == num2 : " + result);

		// num1이 num2랑 다르다다.
		result = num1 != num2; // 7 != 2 = true
		System.out.println("num1 != num2 : " + result);

		// 문자형 관계비교
		String str1 = "ICIA";
		String str2 = "ICIB";
		// result = str1 == str2;
		// System.out.println("str1==str2 : " + result);

		result = str1.equals(str2);
		// 기준무자_변수명.equals(비교문자_변수명);
		System.out.println("문자형비교 : " + result);

	}

}
