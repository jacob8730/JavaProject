/*
 *Date : 2021.01.04
 *Author: jacob
 *Description: 반복문 do-while 예제
 *Version: 1.0
 */
package Jave0104;

import java.util.Scanner;

public class Ex04_Dowhile {

	public static void main(String[] args) {
		// Up & Down Game

		int ans = (int) (Math.random() * 50) + 1;
		int input = 0;
		int cnt = 0;
		boolean run = true;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("숫자를 입려해주세요.>>");
			input = sc.nextInt();
			cnt++;

			if (ans > input) {
				System.out.println("Up");
			} else if (ans < input) {
				System.out.println("Down");
			} else {
				System.out.println("정답은 " + ans + "입니다.");
				System.out.println("시도 횟수는" + cnt + "번 입니다.");
				run = false;
			}

		} while (run);

		if (cnt <=3) {
			System.out.println("통과입니다.");
		} else {
			System.out.println("벌칙입니다.");
		}

	}

}
