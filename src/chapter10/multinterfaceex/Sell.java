package chapter10.multinterfaceex;

// 물건을 팔다 : 인터페이스
public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
