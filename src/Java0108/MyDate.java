package Java0108;

public class MyDate {
	// (1)필드
	//	년(year),월(month),일(day)
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	
	// (2)메소드
	
	// day
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		switch (month) {

		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			if(day>=1 && day<= 31) {
				this.day = day;
			} else {
				isValid = false;
			}
			
			break;
			
		case 2:
			if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
				if(day>=1 && day<= 29) {
					this.day = day;
				} else {
					isValid = false;
				}if(day>=1 && day<= 28) {
					this.day = day;
				} else {
					isValid = false;
				}
			}
			break;
			
		case 4:	case 6:	case 9:	case 11:
			if(day>=1 && day<= 30) {
				this.day = day;
			} else {
				isValid = false;
			}
			break;
		
		default:
			isValid = false;
			break;

		}
		
		//this.day = day;
	}
	
	// month
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		// 1월부터 12월까지면
		this.month = month;
		if(month>=1 && month<=12) {
			this.month = month;
		} else {
			// 그 외에는
			isValid = false;
		}
	}
	
	// year
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		
		if(year < 0) {
			isValid = false;
		} else {
			this.year = year;
		}
		
	}
	
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		} else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	
	
	// (3) 생성자
	// 기본생성자
	public MyDate() {
		
	}
	
	// 매개변수 생성자
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day); //순서 주의
	//[Shift] + [Ctrl] + S
	}

}
