package Java0107;

public class Access1 {

	public static void main(String[] args) {

		Access acc = new Access();

		acc.field1 = 10;
		acc.field2 = 10;
		acc.field3 = 10;
		// acc.field4 = 10;

		acc.method1();
		acc.method2();
		acc.method3();
		// acc.method4();

		// private은 자기 자신클래스에서만 사용가능하다.

	}

}
