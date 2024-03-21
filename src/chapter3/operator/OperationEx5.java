package chapter3.operator;

// 비트 이동연산자 : <<, >>, >>>
// https://coding-factory.tistory.com/521
public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B10000101; // 2진수값 8비트로 표현.
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		
		System.out.println(num >>> 2);
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);

	}

}
