/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 키오스크(Kiosk)
 *Version: 1.0
 */
package Java1231;

import java.util.Scanner;

public class Ex01_Kiosk {

	public static void main(String[] args) {
		// Kiosk : 무인결제 시스템
		// jacob Cafe
		// 아메리카노(4000), 바닐라라떼(4500), 자몽허니블랙티(5000), 바닐라초코칩모카(5500)
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("jacob Cafe에 오신것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니미다.");
		System.out.println();
		System.out.println("1. 아메리카노");
		System.out.println("2. 바닐라라떼");
		System.out.println("3. 자몽허니블랙티");
		System.out.println("4. 바닐라초코칩모카");
		System.out.println();
		
		System.out.println("메뉴를 선택해 주세요>>>");
		// print()와println()의 차이
		// 줄바꿈 유우 => ln은 Line의 약자 
		num = sc.nextInt();
		
		int price = 0;
		String menu = "없음";
		
		switch(num) {
		case 1:
			menu = "아메리카노";
			price = 4000;
			break;
		case 2:
			menu = "바닐라라떼";
			price = 4500;
			break;
		case 3:
			menu = "자몽허니블랙티";
			price = 5000;
			break;
		case 4:
			menu = "바닐라초코칩모카";
			price = 5500;
			break;
		default :
			System.out.println("해당 메뉴는 존재하지 않습니다.");
			break;
		}
		
		System.out.println();
		System.out.println("주문하신 메뉴는" + menu);
		System.out.println("가격은" + price + "원 입니다.");

	}

}
