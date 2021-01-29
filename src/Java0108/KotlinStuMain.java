package Java0108;

import java.util.Scanner;

public class KotlinStuMain {

	public static void main(String[] args) {
		// 학생수 입력-- hint)stu[]

		Scanner sc = new Scanner(System.in);

		System.out.print("학생의 수를 입력하세요.>>");
		int i = sc.nextInt();

		KotlinStu stu[] = new KotlinStu[i];

		for (i = 0; i < stu.length; i++) {
			System.out.println("학생수" + (i + 1));

			System.out.print("아이디>>");
			String id = sc.next();

			System.out.print("비밀번호>>");
			String password = sc.next();

			System.out.print("이름>>");
			String name = sc.next();

			System.out.print("생년월일>>");
			String birth = sc.next();

			System.out.print("성별>>");
			String sex = sc.next();

			System.out.print("이메일>>");
			String email = sc.next();

			System.out.print("전화번호>>");
			String phone = sc.next();

			stu[i] = new KotlinStu(id, password, name, birth, sex, email, phone);
		}

		for (i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}

		// 입력받은 학생수만큼 정보 입력 (아이디,비밀번호...)
		// 매개변수 생성자를 객체로 만든다.

		// 학생정보를 출력 (3명이면 3개의 학생 정보출력)

	}

}
