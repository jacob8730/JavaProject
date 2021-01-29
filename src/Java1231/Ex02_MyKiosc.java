/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 나만의 키오스크(Kiosk)
 *Version: 1.0
 */
package Java1231;

import java.util.Scanner;

public class Ex02_MyKiosc {

	public static void main(String[] args) {
		// 나마의 키오스크 만들기
		
		Scanner sc = new Scanner(System.in);
		
		// Kiosk : 무인결제 시스템
		//Park chicken
		// 1.후라이드 치킨(12000), 2.양념치킨(13000), 3.간장치킨(14000) 4.치즈치킨(15000)
				
		int chi;
		
		System.out.println("Park Chicken에 오신걸 환영합니다.");
		System.out.println("주문을 도와 드리겠습니다.");
		System.out.println();
		System.out.println("1.후라이드 치킨");
		System.out.println("2.양념치킨");
		System.out.println("3.간장치킨");
		System.out.println("치즈치킨");
		System.out.println();
		
		System.out.println("메뉴를 선택해 주세요.");
		
		chi = sc.nextInt();
		
		int price  = 0;
		String menu = "없음";
		
		switch(chi) {
		case 1: 
			menu = "후라이드치킨";
			price = 12000;
			break;
		case 2: 
			menu = "양념치킨";
			price = 13000;
			break;
		case 3: 
			menu = "간장치킨";
			price = 14000;
			break;
		case 4: 
			menu = "치즈치킨";
			price = 15000;
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
