/*
 *Date : 2021.01.06
 *Author: jacob
 *Description: SmartPhone
 *Version: 1.0
 */
package Java0106;

public class SmartPhone { // 클래스 이름을 정의

	// public static void main(String[] args){
	// 메인메소드, 메인함수 : 신제로 프로그램이 실행되는 부분
	// }

	// public : 접근제한자
	// static : 정적
	// void : 리턴값이 없을 때
	// main : 메소드 이름
	// (String[] args) : String타입의 args배열이 매개변수로 선언

	// 클래스의 3가지 요소

	// (1)필드 : 득성, 상태, 속성
	// 변수선언

	String company;
	String color;
	int price;
	int size;
	int volume;

	// (2)메소드 :기능 , 동작, 행동,
	// 데이터타입 메소드이름(){}
	// 데이터탑입 int 지정 >> int numMethod(){ return num; }
	// void : return값을 생략할 수 있다.

	void onPower() {
		System.out.println("전원을 킵니다.");
	}

	void offPower() {
		System.out.println("전원을 끕니다.");
	}

	int upVolume() {
		volume++;
		return volume;
	}

	int downVolume() {
		volume--;
		return volume;
	}

	// (3)생성자: 메소드 안에 포함한 클래스이름과 같아야 한다.

	// 기본생성자
	public SmartPhone() {
		// 다른 메서드와의차이
		// 이름이 클래스명과 동일한 것 외에 값을 변환하지않는다.
		// 리턴(데이터)타입을 쓰지않는다.
		// 암묵적으로 Java 컴파일러가 생성자 메소드가없으면
		// 기본생성자를 자동으로 만든다.
	}

	// 매개변수(파라미터)를 이용한생성자
	public SmartPhone(String pCompany, String pColor, int pPrice, int pSize, int pVolume) {
		company = pCompany;
		color = pColor;
		price = pPrice;
		size = pSize;
		volume = pVolume;
	}

	@Override
	public String toString() {
		return "company=" + company + "\ncolor=" + color + " \nprice=" + price + " \nsize=" + size + " \nvolume="
				+ volume;
	}

}
