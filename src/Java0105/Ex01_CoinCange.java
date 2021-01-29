/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: CoinCange
 *Version: 1.0
 */
package Java0105;

import java.util.Scanner;

public class Ex01_CoinCange {

	public static void main(String[] args) {
		// 동전의 갯수를 구하는 문제
		// 주어진 금액을 입력하게 되면 각 동전이 몇개씩 필요한지 출력하는 문제

		// ex) 2680원
		// 500원 : 5개 
		// 100원 : 1개 
		// 50원 : 1개 
		// 10원 : 3개 

		// 2680 - 2500 (500*5) = 180
		// 180 - 100 (100*1) = 80
		// 80 - 50 ( 50*1) = 30
		// 30 - 30 ( 10*3) = 0

		// 배열과 for문을 사용해서 해결해보자

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해주세요>>");

		int money = sc.nextInt();

		int coin[] = { 500, 100, 50, 10 };
		// coin[0] = 500
		// coin[1] = 100
		// coin[2] = 50
		// coin[3] = 10

		for (int i = 0; i < coin.length; i++) {

			int coinCtn = money / coin[i];
			System.out.println(coin[i] + "원은" + coinCtn + "개");

			money = money - (coin[i] * coinCtn);
			// money -= coin[i] * coinCth
			// money = 2680 - (500 * 5);

			// money = money % coin[i];
			// money = 2680 % 500;
			System.out.println("남은 금액 : " + money);
			System.out.println();
		}

	}

}
