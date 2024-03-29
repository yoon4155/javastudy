package chapter9.abstractex;

// 추상클래스는 abstract 키워드를 사용해야 한다.
// 특징? 1) 객체생성 불가능(new 생성자()), 2) 상속을 목적, 3) 상속을 받는 자식클래스는 강제적 구현해야한다.
// 몸체가 없는 메서드(추상메서드) : 메서드의 기능을 정의 할 필요가 없다고 결정했을 때
// 그 때 추상클래스로 구성하라.
public abstract class Animal {

	// 필드
	String eyeColor;
	String speed;
	
<<<<<<< HEAD
	
=======
	// 메서드 : head + body 의 구조. head : prototype(프로토타입)
>>>>>>> 5ffbb2cb534d38b74c8f14b76733fd2f63d4265e
	// 추상메서드 : 몸체(body) 없는 메서드
	abstract void run();
	
	abstract void cry();
	
}
