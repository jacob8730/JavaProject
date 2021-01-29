package Java0107;

public class Access {
	
	// (1) 필드
	public 		int field1;
	protected 	int field2;
				int field3;
	private		int field4;
	
	/*
	 	접근제한자(Access Modifier)
	 	1. public (모두)<폭넓게사용가능>
	 		- 적용대상 : 클래스, 필드, 생성자, 메소드
	 		- 모든 클래스에 접근 가능
	 	2.protected(패키지)
	 		- 적용대상 : 필드, 생성자, 메소드
	 		- 자식클래스가 아닌 다른 패키지에 소속되어 잇으면 접근 불가능
	 	3. (default:생략) (상속클래스)
	 		- 같은 패키지에서만 사용가능
	 		- 적용대상 : 클래스, 필드, 생성자, 메소드
	 		- 다른 패키지에 소속된 클래스에서는 접근 불가능
	 	4. private(본인 클래스)
	 		- 같은 클래스에서만 사용 가능
	 		- 적용대상 : 필드, 생성자, 메소드
	 		- 자신이 아닌 다른 클래스에서는 접근 불가능
	 */

	// (2) 메소드
	public 		void method1() {}
	protected 	void method2() {}
				void method3() {}
	private		void method4() {}
	

	public static void main(String[] args) {
		
		Access acc = new Access();
		
		acc.field1 = 10;
		acc.field1 = 10;
		acc.field1 = 10;
		acc.field1 = 10;
		
		acc.method1();
		acc.method2();
		acc.method3();
		acc.method4();
		
	}

}
