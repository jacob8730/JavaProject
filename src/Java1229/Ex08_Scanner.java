/*
 *Date : 2020.12.29
 *Author: jacob
 *Description: 입력(Scanner)
 *Version: 1.0
 */
package Java1229;

import java.util.Scanner;

public class Ex08_Scanner {

	public static void main(String[] args) {
		// Scanner클래스는 java.util 패키지 안에 있는 입력 클래스
		// import java.util.Scanner 추가

		// 스캐너를 사용하기 위해 스캐너 객체(변수)선언
		Scanner sc = new Scanner(System.in);
		// Scanner scan = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);

		// 이름, 나이 , 주소
		String name;
		int age;
		String addr;

		System.out.print("이름을 입력하세요>>");
		name = sc.next();

		System.out.print("나이를 입력하세요>>");
		age = sc.nextInt();
		

		// sc.nextLine(); => 한줄 입력
		// .trim() => 앞뒤 공백 제거

		System.out.print("주소를 입력하세요>>");
		addr = sc.next();

		System.out.println();
		System.out.println("======출력======");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + addr);

	}

}
