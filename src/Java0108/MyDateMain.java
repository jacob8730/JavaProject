package Java0108;

import java.util.Scanner;

public class MyDateMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력하세요.>>");
		int year = sc.nextInt();

		System.out.print("월을 입력하세요.>>");
		int month = sc.nextInt();

		System.out.print("일을 입력하세요.>>");
		int day = sc.nextInt();

		MyDate MD = new MyDate(day, month, year);
		System.out.println(year + "년" + month + "월" + day + "일" + MD.isValid());

	}

}
