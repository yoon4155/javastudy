package chapter10.interfaceex;

public class Lion implements Animal {

	@Override
	public void run() {
		System.out.println("사자가 달린다.");
		
	}

	@Override
	public void cry() {
		System.out.println("사자가 울부짖는다.");
		
	}

}
