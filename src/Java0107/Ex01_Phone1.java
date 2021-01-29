/*
 *Date : 2021.01.07
 *Author: jacob
 *Description: Q.SmartPhone
 *Version: 1.0
 */
package Java0107;

public class Ex01_Phone1 {

	String company;
	String color;
	int price;
	int size;
	int volume;
	int powre;
	int flash;
	int mute;
	

	void onPower() {
		System.out.println("전원을 켭니다.");
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

	public Ex01_Phone1() {
	}

	public Ex01_Phone1(String pCompany, String pColor, int pPrice,
						int pSize, int pVolume) {
		company = pCompany;
		color = pColor;
		price = pPrice;
		size = pSize;
		volume = pVolume;
		
	}

}
