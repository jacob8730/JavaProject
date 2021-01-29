/*
int *Date : 2021.01.04
 *Author: jacob
 *Description: 배열(Array) 예제
 *Version: 1.0
 */
package Jave0104;

import java.util.Scanner;

public class Ex06_ArrayExam {

	public static void main(String[] args) {
		// 개강 : 12월 15일
		// 수료 : 6월 4일
		// 교육원 나오는 날짜 계산(월별)

		// 12월 : 12일
		// 1월 : 20일
		// 2월 : 18일
		// 3월 : 22일
		// 4월 : 22일
		// 5월 : 19일
		// 6월 : 4일

		int months[] = new int[7];

		// for문을 이용해서 각 월별 날짜를 입력받고
		// 월별 일 수 , 총 일수를 출력해보자!
		// 12월 달 첫번째 달 months[0]

		// 첫번째달이 12월 두번째달 1월.......

		Scanner sc = new Scanner(System.in);

		int month = 0;
		int sum = 0;

		for (int i = 0; i < months.length; i++) {
			switch (i) {
			case 0:
				month = 12;
				break;

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				month = i;
				break;
			}
			System.out.print(month + "월 날짜를 입력해주세요.");
			months[i] = sc.nextInt();

			sum += months[i];
		}
		System.out.println("\n==================\n");

		for (int i = 0; i < months.length; i++) {
			switch (i) {
			case 0:
				month = 12;
				break;

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				month = i;
				break;
			}
			System.out.println(month + "월 날짜 : " + months[i]);

		}
		System.out.println("교육원에 출석하는 날은 총 " + sum + "일 입니다.");

	}

}
