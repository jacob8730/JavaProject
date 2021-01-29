/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: 중첩if문(NestedIf)
 *Version: 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex04_NestedIf {

	public static void main(String[] args) {
		// 중첩if문 : if문안에 if문을 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("시험점수 입력>>");
		int score = sc.nextInt();
		String grade = "";

		if (score <= 100) {
			if (score <= 90) {
				if (score <= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			}
			System.out.println("당신의 점수는 " + score + "점 이고," + "당신의 학점은 " + grade + "입니다");
		} else {
			System.out.println("입력범위 초과");
		}

	}

}
