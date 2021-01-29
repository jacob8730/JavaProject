package Java0107;

import Java0106.SmartPhone;

public class Ex02_Phone2main {

	public static void main(String[] args) {
		
		Ex01_Phone1 phone1 = new Ex01_Phone1();
		
		phone1.company = "Samsung";
		phone1.color = "red";
		phone1.price = 100;
		phone1.size = 6;
		phone1.volume = 5;

		System.out.println("phone 정보 출력");
		System.out.println("phone.company : " + phone1.company);
		System.out.println("phone.color : " + phone1.color);
		System.out.println("phone.price : " + phone1.price);
		System.out.println("phone.size : " + phone1.size);
		System.out.println("phone.volume : " + phone1.volume);
		System.out.println();
		

	}

}
