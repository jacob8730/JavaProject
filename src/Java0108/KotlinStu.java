package Java0108;

public class KotlinStu {

	// (1)필드
	// 아이디, 비밀번호, 이름 , 생년월일, 성별, 이메일, 휴대전화를
	// private으로 선언한다.

	private String id;
	private String password;
	private String name;
	private String birth;
	private String sex;
	private String email;
	private String phone;

	// 단축키 [Alt] +[Shift] +[s]

	// (2)메소드
	// getter, setter, toString 메소드 생성

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "KotlinStu [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", sex=" + sex
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	// (3)생성자
	// 기본생성자와 모든 필드값을 가진 매개변수 생성자를 생성

	public KotlinStu() {
		super();
	}

	public KotlinStu(String id, String password, String name, String birth, String sex, String email, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
	}

}
