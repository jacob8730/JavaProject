package Java0108;

public class SetGet {

	// (1) 필드
	// private : 해당 변수나 메소드를 현재 클래스에서만 사용
	private String name;
	private int age;

	// (2) 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "출력결과 [이름 :" + name + ", 나이 :" + age + "]";
	}

	// (3) 생성자
	public SetGet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 기본생성자
	public SetGet() {

	}

	// 매개변수 생성자가 없을 경우 기본생성자를 생략해도 되지만
	// 매개변수 생성자를 만들 경우 기본생성자를 만들어줘야한다.

}
