/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: 랜덤숫자(RandomMethod)
 *Version: 1.0
 */
package Java1230;

public class Ex06_Random {

	public static void main(String[] args) {
		// random 메소드
		// 특정 범위 내에서 숫자 하나를 출력해주는 메소드
		// Math.random() :: 0크거나 같고, 1.0보다 작은 숫자 무작위로 발생
		// 0.0~0.99999999중 숫자 하나

		double ran1 = Math.random();
		// System.out.println(ran1);

		// 1~10사이의 숫자
		// Math.random() * 10 =>> 0.0 ~ 9.99999
		// Math.random() * 10 + 1 =>> 1.0 ~ 9.99999
		// (int)Math.random() * 10 + 1 =>> 1 ~10

		// N부터 S사이의 랜덤숫자 구하기
		// (int)(Math.random() * S) + N

		// 주사위 구하기 프로그램(1~6)
		int dice;

		// 소스 작성 부분

		dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위의 값이" + dice + "가(이) 나왔습니다");

		// 로또번호 만들기
		int p1, p2, p3, p4, p5, p6, b1;

		p1 = (int) (Math.random() * 45) + 1;
		p2 = (int) (Math.random() * 45) + 1;
		p3 = (int) (Math.random() * 45) + 1;
		p4 = (int) (Math.random() * 45) + 1;
		p5 = (int) (Math.random() * 45) + 1;
		p6 = (int) (Math.random() * 45) + 1;
		b1 = (int) (Math.random() * 45) + 1;

		System.out.println("이번주 로또 번호는 [" + p1 + "][" + p2 + "]가(이) 나왔습니다");
		System.out.println(p3 + "][" + p4 + "][" + p5 + "][" + p6 + "]");
		System.out.println("보너스 번호느[" + b1 + "]가(이) 나왔습니다");

	}

}
