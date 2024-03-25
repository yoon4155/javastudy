package chapter5.classpart;

// 메서드 정의하기.
// 메서드 : 기능을 구현하는 코드로 구성된 것.
public class FunctionTest {

	// main()메서드 : 자바에서 프로그램을 실행하기 위한 목적으로 만들어 준
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int sum = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum + "입니다.");

	}
	// 메서드 기본구조
	/*
	 리턴타입 메서드 이름(매개변수 선언) {
	 ㅇㅇㅇ
	 ㅇㅇㅇ
	 ㅇㅇㅇ
	 return 사용유무;
	 }
	 */
	// 정수형 숫자 2개의 값을 매개변수로 제공받아 더한 값을 리턴하는 메서드.
	// 예> 10 + 20 = 30
	public static int add(int num1, int num2) {
		
		//2개의 값을 더하는 코드작성.
		int result = num1 + num2;
		
/*		int sum = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum + "입니다.");
		
		int sub = substaract(n1, n2);
		System.out.println(n1, + " - " + n2 + " = " + sub + "입니다.");
		
		int mul = multiply(n1, n2);
		System.out.println(n1, + " * " + n2 + " = " + mul + "입니다.");
		
		double div = divide(n1, n2);
		System.out.println(n1 + " / " + n2 + " = " + div + "입니다.");
		
		// ↓ 이렇게 하면 따로 적을필요x
		System.out.println(n1 + " / " + n2 + " = " + divide(n1, n2) + "입니다.");
*/
		return result;
	}
	
	//뺄셈
	public static int substract(int num1, int num2) {
		
		int result = num1 - num2;

		return result;
	}
	
	// 곱셈
	public static int multiply(int num1, int num2) {
		int result = num1 * num2;

		return result;
	}
	
	//나눗셈
	public static double divide(int num1, int num2) {
		// 정수끼리 연산하면 결과는 정수 예> 정수 + 정수 = 정수
		// 정수와 실수끼리 연산하면 결과는 실수 예> 정수 + 실수 = 실수.  해석 : (실수데이터타입)정수 + 실수 = 실수.
		// 실수끼리 연산하면 결과는 실수 예 > 실수 + 실수 = 실수
	double result = (num1 + num2) / 2;
	return result;
	}
}