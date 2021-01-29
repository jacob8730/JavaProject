package Java0107;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		// 불러올 파일 이름 >>예칭(별칭) = new 불러올 파일이름 ();

		// Calculator의 메소드 호출(실행)
//		cal.sum(3, 5);
		// 예칭.sum<불러온 파일 속 식>();
//		cal.subtract(7, 2);
		// 예칭.subtract<불러온 파일 속 식>();
//		cal.multiply(5, 9);
		// 예칭.multiply<불러온 파일 속 식>();
//		cal.divide(12, 6);
		// 예칭.divide<불러온 파일 속 식>();

		// while문, switch-case문
		// 메뉴 선택
		// 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료

		// 두개 숫자 입력
		// 결과를 출력

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.덧셈 |2.뺄셈 |3.곱셈 |4.나눗셈 |5.종료");
			System.out.println("----------------------------------");

			System.out.print("항목 선택>>");
			int selectNo = sc.nextInt();
			
			int num1 = 0;
			int num2 = 0;
			
			if(selectNo>=1 && selectNo<=4) {
			System.out.print("첫번째 숫자 입력>>");
			num1 = sc.nextInt();

			System.out.print("두번째 숫자 입력>>");
			num2 = sc.nextInt();
			}
			switch (selectNo) {
			case 1:
				cal.sum(num1, num2);
				break;

			case 2:
				cal.subtract(num1, num2);
				break;

			case 3:
				cal.multiply(num1, num2);
				break;

			case 4:
				cal.divide(num1, num2);
				break;
				
			case 5:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;

			}
			
		}

	}

}
