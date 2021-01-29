/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: Continue
 *Version: 1.0
 */
package Java1231;

public class Ex06_Continue {

	public static void main(String[] args) {
		// continue문은 반복문과 함께 사용한다
		// 반복문 안에서 continue문을 만나면
		// 이후 문장 수행하지 않고 for문으로 돌아가 증감식을 수행한다.

		// 1부터 10까지 숫자중 홀수를 구하는 방법

		for(int i=1; i<=10; i++) {
		
			if(i%2==0) { //짝수일 경우
				continue;//특정조건이 주어지면 pass,jump
			}
		System.out.println(i);
		}

		// 1부터 100까지 숫자 중 짝수의 합을 구하여라
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum += i;
		}

		System.out.println("짝수의 합 : " + sum);
		// sysout 입력 후 [Ctrl]키 + [Soace]키
		System.out.println();

	}

}
