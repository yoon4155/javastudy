package chapter5.hiding;

public class studentTest {

	public static void main(String[] args) {
		// 객체생성작업
		// s1객체(스택영역)에는 new Student() 힙영역의 생덩된 기억장소의 주소가 대입된다.
		Student s1 = new Student();
		s1.address = "노원구";
		s1.studentId = 1;
		s1.grade = 5;
		s1.studentName = "홍길동";
		
		// private score 필드는 접근금지.
//		s1.score = 890;
//		s1.score = -23;		
		s1.setScore(200);
		
		System.out.println(s1.getScore());
		
	}

}
