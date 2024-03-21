package chapter2;

// 형변환(Casting) : 데이터타입 변환
// 명시적 형변환
public class ExplicitConversion {

	public static void main(String[] args) {
		
		// 큰 데이터타입 = 작은데이터 타입 (가능) 묵시적형변환
		
		// 명시적형변환
		// 작은데이터 타입 = 큰 데이터 타입 (불가능:에러) -> 작은데이터 타입 = (좌측데이터 타입) 큰데이터 타입(가능)
		
		double dNum1 = 1.2; // 해석 : double dNum1 = 1.2d;
		float fNum2 = 0.9f;
		
		// 실수값이 정수값으로 변환시 소수부분은 버려진다. (반올림 없다.) 예
		int iNum3 = (int) dNum1 + (int)fNum2;
		int iNum4 = (int) (dNum1 + fNum2);
		
		System.out.println(iNum3); // 1
		System.out.println(iNum4); // 2

	}

}
