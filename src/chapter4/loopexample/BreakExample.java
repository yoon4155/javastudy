package chapter4.loopexample;

// 중지.
public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int i=0;
		
		for(i = 0; i<= 10; i++) {
			System.out.println(i);
			// 아래구문이 true 가 되어 break 문이 실행이 되면, for문이 종료된다.
			if(i == 5) {
				break;
			}
		}
		
		

	}

}
