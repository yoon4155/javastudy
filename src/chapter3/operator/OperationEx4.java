package chapter3.operator;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch; // 숫자로 사용시 0~65535 범위를 갖는다.
		ch = (fatherAge > motherAge) ? 'T':'F';
		
		System.out.println(ch); //

	}

}
