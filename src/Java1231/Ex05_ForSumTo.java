/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 총합 출력하기
 *Version: 1.0
 */
package Java1231;

import java.util.Scanner;

public class Ex05_ForSumTo {

	public static void main(String[] args) {
		// 두개의 숫자(시작값, 끝나는값)를 입력받아서
		// 총합을 구하는 프로그램을 작성하시오.

		// (1) 입력Scanner
		// (2) 합을 구하는 변수 sum
		// (3) 시작값 변수 sNum
		// (4) 끝나는 값 변수 lNum

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sNum = 0;
		int lNum = 0;

		System.out.print("시작값 입력>>");
		sNum = sc.nextInt();
		System.out.print("끝나는값 입력>>");
		lNum = sc.nextInt();

		for (int i = sNum; i <= lNum; i++) {
			sum += i;

			System.out.println(i);
			
			if(i<lNum) {
				System.out.print("+");
				}else {
					System.out.print(" = " + sum);
				}
		}
		System.out.println();
		System.out.println(sNum + "부터" + lNum + "까지 합은" + sum + "입니다");

	}

}
