package chapter5.classpart2;

// Student 클래스에 main() 메서드 사용하기.
public class Student {

	//학생정보
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//메서드
	public String getStudentName() {
		
		return studentName;
	}
	
	// Student 클래스의 멤버가 아니다.
	// 일반적으로는 main() 메서드를 독립적인 파일로 사용한다.
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		
		// "홍길동" 이 저장된 데이터를 출력
		// 실제 작업을 하는 경우에는 필드를 직접접근하지 않고, 메서드를 이용하여, 필드값을 읽어온다.
		System.out.println(stu1.studentName); // 필드사용
		System.out.println(stu1.getStudentName()); // 메서드 사용
	}
}
