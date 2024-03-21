package chapter4.ifexample;

// 다중if문 : 조건식이 여러개 일 경우
public class IfExample4 {

	public static void main(String[] args) {

		// 변수선언시 초기값을 주거나 아니면 코드 내에서 변수가 조건에 의하여 값을 가지도록 코딩을 해야한다.
		int age = 9; // 나이
		int charge; // 입장료
		
		// 아래 다중if문에서 조건식이 성립이 안되어 charge 변수가 값을 갖지 못하는 경우는 에러발생.
		
		if(age >= 0 && age < 8) { // 0세 이상이고, 8세 미만
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}else if(age >= 8 && age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age >= 14 && age <20) {
			charge = 25000;
			System.out.println("중,고등학생 입니다.");
		}else if(age >=20) {
			charge = 3000;
			System.out.println("일반인입니다.");
		}else {
			charge = 99;
			System.out.println("나이를 확인해주세요.");
		}
		
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
