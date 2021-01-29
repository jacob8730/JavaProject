/*
 *Date : 2020.12.29
 *Author: inchoriya
 *Description: 증감연산자(IncreaDeOperation)
 *Version: 1.0
 */
package Java1229;

public class Ex03_inDeOperation {

	public static void main(String[] args) {
		/*
		 * 증가(++)연산자
		 * (1) ++num : num이 가지고 있는 값에 1을 증가한 뒤 연산에 사용
		 * (2) num++ : num이 가지고 있는 값을 연산에 사용 후 1을 증가시킴
		 *
		 * 증가(--)연산자
		 * (1) --num : num이 가지고 있는 값에 1을 감소한 뒤 연산에 사용
		 * (2) num-- : num이 가지고 있는 값을 연산에 사용 후 1을 감소시킴
		 */
		
		int inNum = 5;
		// Sysout 입력 후 [Ctrl] + [Space]키
		//(1) inNum 출력
		System.out.println("inNum : " + (inNum));		//5 
		//(2) ++inNum 출력
		System.out.println("++inNum : " + (++inNum));	//6	ex)inNum에 1을 더한후 계산
		//(3) inNum++ 출력
		System.out.println("inNum++ : " + (inNum++));	//6	ex)inNum을 계산 후 1이 증가
		//(4) inNum 출력
		System.out.println("inNum : " + (inNum));		//7
		
		int deNum = 10;
		// Sysout 입력 후 [Ctrl] + [Space]키
		//(1) deNum 출력
		System.out.println("deNum : " + (deNum));		//10
		//(2) --deNum 출력
		System.out.println("--deNum : " + (--deNum));	//9	ex)deNum에 1을 뺀후 계산
		//(3) deNum-- 출력
		System.out.println("deNum-- : " + (deNum--));	//9	ex)deNum에 계산 후 1 감소
		//(4) deNum 출력
		System.out.println("deNum : " + (deNum));		//8
		

		int num2 = 5;
		int num3 = 11;
		int result1, result2, result3;
		
		result1 = (++num2) + (--num3);		
		
		System.out.println(num2);			//예상값 6 : 결과값	6
		System.out.println(num3);			//예상값 10: 결과값	10
		System.out.println(result1);		//예상값 16: 결과값	16
		
		result2 = (num3++) + (num2--);
		
		System.out.println(num2);			//예상값 5 : 결과값	5
		System.out.println(num3);			//예상값 12: 결과값	11
		System.out.println(result2);		//예상값 17: 결과값	16
		
		result3 = (num2++) + (++num3);
		
		System.out.println(num2);			//예상값 6 : 결과값	6
		System.out.println(num3);			//예상값 12: 결과값	12
		System.out.println(result3);		//예상값 18: 결과값	17
		
		//A		현재 출력 값		나중A 출력값
		//A++		A				A+1
		//++A		A+1				A+1
		
		//int A = 10
		//A++		10				11
		//++A		11+1			11+1
		
		
		
	}

}
