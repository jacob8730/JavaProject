/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 반복문 while
 *Version: 1.0
 */
package Java1231;

public class Ex12_WhileEx {

	public static void main(String[] args) {

		// 주사위를 굴려서 숫자 5가 나오면 멈추는 프로그램

		boolean run = true;
		System.out.println("주사위 값이 5가 나오면 종료합니다.");

		while (run) {
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println("주사위 값 : " + dice);

			if (dice == 5) {
				run = false;
				// 또는 break;
			}
		} // end while
		System.out.println("종료됐습니다.");

	}

}
