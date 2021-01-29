package Java0107;

public class Carmain {

	public static void main(String[] args) {

		Car aCar = new Car();

		aCar.company = "테슬라";
		aCar.model = "모델X";
		aCar.color = "black";
		aCar.speed = 200;

		System.out.println("내차 정보");
		System.out.println("제조사 :" + aCar.company);
		System.out.println("모델명 : " + aCar.model);
		System.out.println("색상 : " + aCar.color);
		System.out.println("최고속도 : " + aCar.speed);

		Car bCar = new Car();

		bCar.company = "기아";
		bCar.model = "k7";
		bCar.color = "black";
		bCar.speed = 180;

		System.out.println("내차 정보");
		System.out.println("제조사 :" + bCar.company);
		System.out.println("모델명 : " + bCar.model);
		System.out.println("색상 : " + bCar.color);
		System.out.println("최고속도 : " + bCar.speed);

		// 메소드1. setGas
		bCar.setGas(10);
		System.out.println("bCar.gas : " + bCar.gas);
		// 메소드2. isLeftGas
		boolean gasState = bCar.isLeftGas();
		System.out.println("gasState : " + gasState);
		// isLeftGas()는 메소드지만 true나false 값을 가진다.

		// 메소드3. run()
		if (gasState) {
			bCar.run();
		}

		// Scanner sc = new Scanner(System.in)
		// int a = sc.nextInt();

		// Scanner : 클래스
		// sc : 객체
		// nextInt : 메소드

	}

}
