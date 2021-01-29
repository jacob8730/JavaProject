/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: SwitchCaseExample
 *Version: 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex10_SwitchExam {

	public static void main(String[] args) {

		// 매월 월별로 날짜 게산하기
		int month; // 월
		int day; // 일

		// 숫자(월)을 입력받아서 그 달의 날짜를 계산하시오.
		// 윤년은 생략하고 2월은 28일까지

		Scanner sc = new Scanner(System.in);

		month = sc.nextInt();
		day = sc.nextInt();

		System.out.print("월 입력");
		System.out.print("일 입력");

		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
			
		case 2:
			day = 28;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		
		default:
			day = 0;
			System.out.println("잘못된 월을 입력 하셧습니다.");
			break;

		}
		if(month>0 && month<13) {
		System.out.println("입력하신" + month + "월은" + day + "일까지 있습니다.");
		}

	}

}
