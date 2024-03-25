package chapter5.hiding;

// 정보은닉(캡슐화) : 접근자 문법
public class Student {

	// 필드
	int studentId;
	String studentName;
	int grade;
	String address;
	private int score;
	
	// 생성자 : 기본생성자는 자동생성
		
	
	// 메서드.
	// setter, getter 메서드는 이름을 반드시 다음과 같은 규칙으로 만들어야 한다.
	// setScore(), getScore()
	// score 필드에 값을 저장. setter 메서드
	public void setScore(int score) {
		
		if(score < 0 || score >= 100) {
			score = 0;
			return;
		}
		this.score = score;
	}
	
	// score 필드에 값을 읽기. getter 메서드
	public int getScore() {
		return score;
	}
}
