package chapter10.interfaceex;

public class Tiger implements Animal {

	@Override
	public void run() {
		System.out.println("호랑이가 달린다.");

	}

	@Override
	public void cry() {
		System.out.println("호랑이가 어흥 소리를 짖는다.");

	}

}
