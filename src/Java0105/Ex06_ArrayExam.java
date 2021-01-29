/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: 배열예제(ArrayExam)
 *Version: 1.0
 */
package Java0105;

import java.util.Scanner;

public class Ex06_ArrayExam {

	public static void main(String[] args) {
		// 1) while문 사용
		// ----------------------------------;
		// 1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료 ;
		// ----------------------------------;

		// 2) 1번 선택시 : 학생수를 입력하고
		// 3) 2번 선택시 : 학생수만큼 점수를 입력

		// 4)3번 선택시 : 학생들의 점수를 출력
		// 5)4번 선택시 : 학생들의 총점 , 평균을 출력
		// 6)5번 선택시 : '프로그램 종료' 출력
		// 7)1-5번 외 다른번호 선택시 '다시 입력해주세요' 출력

		boolean run = true;
		int score[] = null;
		int stuNum = 0;

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("----------------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴를 선택하세요.>>>");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();
				break;
			case 2:
				if (stuNum == 0) {
					System.out.println("학생수를 입력해주세요.");
					break;
				}

				score = new int[stuNum];
				for (int i = 0; i < score.length; i++) {
					System.out.print((i + 1) + "번 학생 점수 입력>>");
					score[i] = sc.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번 핵생 점수 입력 : " + score[i]);
				}
				break;
			case 4:
				int sum = 0;
				double avg = 0;
				int max = 0;

				for (int i = 0; i < score.length; i++) {
					if (score[i] > max) {
						max = score[i];
					}
					sum += score[i];
				}
				System.out.println("총점 :" + sum);
				avg = (double) sum / score.length;
				System.out.println("평균" + avg);
				System.out.println("최고점수" + max);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}

		}

	}

}
