package chapter7.array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열생성
		/*
		 - 기본데이터타입으로 생성하는 배열
		 기본데이터타입 [] 배열이름 = new 기본데이터타입[] {값1, 값2, 값3, 값4, 값5, 값6};
		 */

		// int형 배열
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		// 인덱스가 5인 배열요소를 60으로 변경하라.
		number[5] = 60;
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
