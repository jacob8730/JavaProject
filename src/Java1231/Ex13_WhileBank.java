/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: while문 에제
 *Version: 1.0
 */
package Java1231;

import java.util.Scanner;

public class Ex13_WhileBank {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;

		Scanner sc = new Scanner(System.in);

		// 입금,출금,잔액조회

		while (run) {
			System.out.println("=======================================");
			System.out.println("1.예금\t 2.출금\t 3.잔액조회 \t 4.종료");
			System.out.println("=======================================");
			System.out.print("메뉴 선택>>>>>>");

			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.print("예금액");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액");
				balance += sc.nextInt();
				break;
			case 3:
				System.out.print("잔액조회");
				System.out.println("원");
				balance += sc.nextInt();
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.print("다시 입력해주세요");
				break;
			} // end switch
			System.out.println();
		} // end while

		System.out.println("프로그램 종료");

	}

}
