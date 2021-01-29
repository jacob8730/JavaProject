package Java0106;

import java.util.Scanner;

public class SmartPhoneMain2 {

	public static void main(String[] args) {

		SmartPhone phone1;
		SmartPhone phone2;

		// (1)기본생성자를 이용
		phone1 = new SmartPhone();

		// phone1의 필드값 선언
		phone1.company = "Samaung";
		phone1.color = "black";
		phone1.price = 100;
		phone1.size = 6;
		phone1.volume = 10;

		// (2)매개변수(파라미터) 생성자를 이용
		phone2 = new SmartPhone("Apple", "white", 200, 5, 15);

		// 객체 생성과 동시에 필드값 선언

		System.out.println("phone1의 정보");
		System.out.println(phone1);

		System.out.println();

		System.out.println("phone2의 정보");
		System.out.println(phone2);

		// Q. upVolume() 메소드를 사용해서 phone1의 볼륨을 100까지 올려라
		int ctn = 0;

		for (int i = phone1.volume; i < 100; i++) {
			phone1.upVolume();
			ctn++;
		}

		System.out.println("볼륨버튼을" + ctn + "번 눌렀습니다.");
		System.out.println();

		// Q. phone1의 현재 volume을 입력받아서
		// volume이 10보다 크면 15로, 10보다 작으면 5로,10이면 10으로 설정한다.

		// if, else if, else

		Scanner sc = new Scanner(System.in);

		System.out.print("현재 볼륨 값을 넣어주세요.");
		phone1.volume = sc.nextInt();

		int dvBtn = 0;
		int uvBtn = 0;

		if (phone1.volume > 10) {

			if (phone1.volume > 15) {

				for (int i = phone1.volume; i > 15; i--) {
					phone1.downVolume();
					dvBtn++;
				}
				System.out.println("voulme down버튼을 " + dvBtn + "번 누름!");

			} else if (phone1.volume < 15) {
				for (int i = phone1.volume; i < 15; i++) {
					phone1.upVolume();
					uvBtn++;
				}
				System.out.println("voulme up버튼을 " + uvBtn + "번 누름!");
			} else {
				System.out.println("no touch!");
			}

		} else if (phone1.volume < 10) {

			if (phone1.volume > 5) {

				for (int i = phone1.volume; i > 5; i--) {
					phone1.downVolume();
					dvBtn++;
				}
				System.out.println("voulme down버튼을 " + dvBtn + "번 누름!");

			} else if (phone1.volume < 5) {
				for (int i = phone1.volume; i < 5; i++) {
					phone1.upVolume();
					uvBtn++;
				}
				System.out.println("voulme up버튼을 " + uvBtn + "번 누름!");
			} else {
				System.out.println("no touch!");
			}

		} else {

		}

		System.out.println("현재 volume은 " + phone1.volume + "입니다!");

	}
}
