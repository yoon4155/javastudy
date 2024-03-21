package chapter4.loopexample;

public class GuGuDan {

	public static void main(String[] args) {

		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(i == 0) {
					System.out.print(j + "단" + "\t");
				}
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}

	}

}
