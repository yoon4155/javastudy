package chapter9.abstractex;

public class Dog extends Animal {
		
		@Override
		void run() {
			
			System.out.println("강아지가 달린다.");
		}

		@Override
		void cry() {
			
			System.out.println("강아지가 멍멍 짖는다.");		
		}
}
