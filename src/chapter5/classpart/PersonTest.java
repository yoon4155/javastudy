package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		// Person 클래스 사용 - 기억장소가 생성된 의미.
		Person ps1 = new Person();
		
		// ps1 객체가 가리키는 기억장소 표현
		ps1.name = "홍길동";
		ps1.height = 100;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;
		
		ps1.getPersonInfo();
		
/*	이렇게 사용 안함
 		System.out.println("이름:" + ps1.name);
		System.out.println("신장(키) " + ps1.height);
		System.out.println("이름:" + ps1.weight);
		System.out.println("이름:" + ps1.gender);
		System.out.println("이름:" + ps1.married);
*/
		
		Person ps2 = new Person();
		ps2.name = "손흥민";
		ps2.height = 110;
		ps2.weight = 80;
		ps2.gender = 'M';
		ps2.married = false;
		
		ps2.getPersonInfo();
		
		Person ps3 = new Person();
		ps3.name = "이강인";
		ps3.height = 120;
		ps3.weight = 85;
		ps3.gender = 'M';
		ps3.married = false;
		
		Person ps4 = new Person();
		ps4.name = "김민재";
		ps4.height = 115;
		ps4.weight = 90;
		ps4.gender = 'W';
		ps4.married = true;
		
		Person ps5 = new Person();
		ps5.name = "황희찬";
		ps5.height = 125;
		ps5.weight = 95;
		ps5.gender = 'M';
		ps5.married = false;

	}

}
