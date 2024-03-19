package chapter2;

public class integerVariable {

	public static void main(String[] args) {
		// 정수형 데이터타입 : byte(1), short(2), int(4), long(8)
        // 크기를 이용하여 기억장소를 생성한다.
		// 예로 byte 는 1바이트로 기억장소를 생성한다.
		// byte는 8bit로 ㅣ어있다.
		// bit는 0, 1 2진수값을 저장하도록 설계되어 있다.
		
		short sVal = 10;
		byte bVal = 20;
		
		System.out.println(sVal + bVal);
		
		// long 데이터를 저장할 경우에는 숫자데이터 끝 부분에 알파벳 L or l 을 붙인다. (규칙)
		long lVal = 1234567890L;
	}

}
