package chapter5.hiding;

// MyDate클래스를 사용하는 현재 입장에서 동일한 패키지 일 경우에는 default 이상은 접근이 가능하다.
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.day = 1; // public
		date.month = 10; // default
	//  date.year = 2024; private 접근자로 되어있기 때문에 접근이 안되는 특징이 있다.
	}

}
