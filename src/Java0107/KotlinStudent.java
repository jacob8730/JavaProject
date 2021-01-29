package Java0107;

public class KotlinStudent {

	public static void main(String[] args) {
		Student hic1 = new Student();
		kotlin hic2 = new kotlin();

		System.out.println("이름 : " + hic2.name);

		hic2.name = "jacob";
		System.out.println("이름 : " + hic2.name);

		System.out.println("소속 : " + hic2.academy);
		// (1) null //(2) ICIA
		hic2.academy = "Google";
		System.out.println("6걔월 후 소속 :" + hic2.academy);

		hic2.age = 10;
		// System.out.println(hic2.addAge1());
		System.out.println(hic2.addAge());
		System.out.println(hic2.age);

		hic1.setName("jacob");
		// hic1.name = "jacob";

	}

}
