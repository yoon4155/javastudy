package chapter10.multinterfaceex;

// 물건을 팔다 : 인터페이스
public interface Buy {

	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}
