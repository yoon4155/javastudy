package chapter5.hiding2;

import chapter5.hiding.MyDate;

// default 필드는 다른 패키지에서는 접근이 안된다.
public class MyDateTest {
		// import 구문때문에 chapter5.hiding 패키지를 생략가능할 수 있다.
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		MyDate date3 = new MyDate();
		MyDate date4 = new MyDate();
		MyDate date5 = new MyDate();
		
		date1.day = 1; // public
		// date1.day month = 10; // default
	}

}
