package Java0108;

public class SetGetmain {

	public static void main(String[] args) {
		
		// 1. SetGet클래스의 정보를 담는 객체 sg생성
		SetGet sg = new SetGet();
		
		// 2. 이름과 나이에 정보 입력
		//sg.name = "jacob";
		//sg.age = 27;
		// (1) SetGet클래스에 있는 private String name에서
		//		private을 제거하고 String name으로 선언한다.
		// (2) sg객체에서 set메소드를 사용해 입력한다.
		sg.setName("jacob");
		sg.setAge(27);
		
		// 3. 입력한 이름과 나이 출력
		// System.out.println("이름 : " + sg.name);
		//System.out.println("나이 : " + sg.age);
		
		System.out.println("신상정보");
		System.out.println("이름 : " + sg.getName());
		System.out.println("나이 : " + sg.getAge());
		
		// (1) sg.name을 sg.getName()으로 바꿔라
		//		sg.age를 sg.getAge()로 바꿔라.
		
		// set으로 이렵, get으로 출력
		System.out.println(sg);
	}

}
