/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: 단어놀이(WordsGame)
 *Version: 1.0
 */
package Java0105;

import java.util.Scanner;

public class Ex09_WordsGame {

	public static void main(String[] args) {
		// string타입의 2차원 배열

		String words[][] = { 
				{ "chair", "의자" }, 
				{ "desk", "책상" }, 
				{ "water", "물" }, 
				{ "pencil", "연필" },
				{ "watch", "시계" }

		};
		
		// words[0][0] = chair
		// words[0][1] = 의자

		// words[1][0] = desk
		// words[1][1] = 책상

		// words[2][0] = water
		// words[2][1] = 물

		// words[3][0] = pencil
		// words[3][1] = 연필

		// words[i][0] = watch
		// words[i][1] = 시계

		int score = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.print("문제" + (i + 1) + ". " + words[i][0] + "의 뜻은?");

			String answer = sc.next();

			if (answer.equals(words[i][1])) {
				System.out.print("정답입니다.");
				score++;
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은" + words[i][1] + "입니다");
			}

		}

		System.out.println();
		System.out.println("총 " + words.length + "개 중에서" + score + "개 맞추셨습니다.");

		double percent = (double) score / words.length * 100;
		System.out.println("정답률은" + percent + "%입니다.");

	}

}
