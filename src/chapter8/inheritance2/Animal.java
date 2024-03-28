package chapter8.inheritance2;

// 일반클래스의 구성요소
public class Animal {

	// 필드 : 기억장소를 사용, 배열포함.
	int age;
	String name;
	
	
	// 메서드 : head + body 의 구조. head : prototype(프로토타입)
	
	// 달린다(움직인다)
	void run() {
		System.out.println("동물이 달린다.");
	}
	
	// 소리짖다(울다)
	void cry() {
		System.out.println("동물이 소리짖다.");
	}
	
}
