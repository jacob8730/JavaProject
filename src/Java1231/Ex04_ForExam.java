/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 반복문for예제
 *Version: 1.0
 */
package Java1231;

public class Ex04_ForExam {

	public static void main(String[] args) {
		// 1부터 10까지 출력하기
		
		//for(int i=0; i<10; i++)
		//0부터 9까지 출력
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//Q1. 4부터 12까지 반복문을 사용해서 출력
		
//		for(int i=4; i<=12; i++) {
//			System.out.println(i);
//		}
		
		//Q2. 1부터 10까지 합을 구하여라
		//1+2+3+4+5+6+7+8+9+10 = 55
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			
			sum+= i;
			//sum = sum +i; 위 같은 식
			// sum = 0 + 1
			
			System.out.println("i : " + i + "=>>");
			System.out.println("sum : " + sum);
		}
		
		
		
		
		
		

	}

}
