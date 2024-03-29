package chapter11.classex;

public class PersonClassTest {

	public static void main(String[] args) {
		
		Class pClass = Class.forName("chapter11.classex.Person");

		// Person 클래스의 생성자정보 출력
		Constructor[] cons = personClass.getConstructors();
		for(Constructor c :  cons) {
			System.out.println(c);
		}
		System.out.println();
		
		// Person 클래스의 필드 출력
		Field[] fields = personClass.getFields();
		for(field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		
		// Person 클래스의 메서드 출력
		Method[] methods = personClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
