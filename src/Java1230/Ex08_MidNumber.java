/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: 최댓값, 중간값, 최소값 구하기(MaxMidMinEx)
 *Version: 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex08_MidNumber {

	public static void main(String[] args) {
		// 응용. 숫자 3개를 입력받아서 최대값, 최소값, 중간값

		int num1, num2, num3;
		int max, mid, min;

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력>>");
		num1 = sc.nextInt();

		System.out.print("두번째 숫자 입력>>");
		num2 = sc.nextInt();

		System.out.print("세번째 숫자 입력>>");
		num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			// num2더큼
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.print("최대값 : " + max);

		if (num1 >= num2) {
			if (num1 >= num3) {
				mid = num1;
			} else {
				mid = num3;
			}
		} else {
			// num2더큼
			if (num2 >= num3) {
				mid = num2;
			} else {
				mid = num3;
			}
		}
		System.out.print("중간값 : " + mid);

		if (num1 < num2) {
			if (num1 < num3) {
				min = num1;
			} else {
				min = num3;
			}
		} else {
			// num2더큼
			if (num2 < num3) {
				min = num2;
			} else {
				min = num3;
			}
		}
		System.out.print("최소값 : " + min);

		if (num1 > num2) {
			// num1이 num2보다 크다

			if (num1 > num3) {
				// num1이 num3보다 크다
				max = num1;
				if (num2 > num3) {
					// num2가 num3보다 크다
					mid = num2;
					min = num3;
				} else {
					// num3이 num2보다 크다
					mid = num3;
					min = num2;
				}
			} else {
				// num3이 num1보다 크다(num3이 num2보다 크다)
				max = num3;
				mid = num1;
				min = num2;
			}
		} else {
			// num2가 num1보다 크다
			if (num2 > num3) {
				// num2가 num3보다 크다
				max = num2;
				if (num1 > num3) {
					mid = num1;
					min = num3;
				} else {
					mid = num3;
					min = num1;
				}
			} else {
				// num3이 num2보다 크다
				max = num3;
				mid = num2;
				min = num1;
			}
		}

		// 간단하게 정리
		if (num1 > num2 && num1 > num3) {
			max = num1;
			/////////////////////////
			if (num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
			/////////////////////////
		} else if (num2 > num1 && num2 > num3) {
			max = num2;
			/////////////////////////
			if (num2 > num3) {
				mid = num3;
				min = num1;
			} else {
				mid = num3;
				min = num1;
			}
			/////////////////////////
		} else {// num3이 가장 클때
			max = num3;
			/////////////////////////
			if (num2 > num3) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
			/////////////////////////
		}

		System.out.print("최대값 :" + max);
		System.out.print("최대값 :" + mid);
		System.out.print("최대값 :" + min);

	}

}
