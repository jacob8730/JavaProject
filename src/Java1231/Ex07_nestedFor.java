/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 중첩for문
 *Version: 1.0
 */
package Java1231;

public class Ex07_nestedFor {

	public static void main(String[] args) {
		// 중첩for문 : for문안에 for문을 사용할 수 있다.

		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {

				System.out.print("i값: " + i);
				System.out.print(", j값: " + j);

			} // 두번째 for문 (내부for문)
		} // 첫번째 for문 (외부for문)

	}

}
