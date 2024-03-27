package chapter9.abstractex;

public class AnimalTest {
	public static void main(String[] args) {
		// Animal 추상클래스를 객체생성 할 수 없도록 설계되어 있다.
		// Animal animal = new Animal(); 에러발생.
		
		AnimalTest aTest = new AnimalTest();
		aTest.callMethodAnimal(new Cat());
		aTest.callMethodAnimal(new Dog());
		aTest.callMethodAnimal(new Lion());
		
		
	}
	
	// 다형성
	public void callMethodAnimal(Animal animal) {
		animal.cry();
		animal.run();
	}
}
