package Java0107;

import java.util.Date;

public class Student {
	// (1)필드
	// 이름(name), 나이(age), 소속(academy), 연락처(phone), 주소(addr)
	String name;
	int age;
	String academy;
	String phone;
	String addr;

	// (2)메소드
	// setter, getter
	// set메소드 : 필드값을 넣을때
	// get메소드 : 필드값을 불러올 때
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

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void toString1() {
		System.out.println("Student [name=" + name + ", age=" + age + ", academy=" + academy + ", phone=" + phone
				+ ", addr=" + addr + "]");
	}

	// (3) 생성자
	// 매개변수 생성자
	public Student(String name, int age, String academy, String phone, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.academy = academy;
		this.phone = phone;
		this.addr = addr;
	}

	// 기본 생성자
	public Student() {
		super();
	}

}
