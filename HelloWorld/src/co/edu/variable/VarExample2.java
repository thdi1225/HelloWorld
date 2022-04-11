package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		// 국어 80, 영어 70, 수학 69
		int koreanScore = 85;
		int engScore = 75;
		int mathScore = 60;
		
		double avg = (koreanScore + engScore + mathScore) / 3.0;
		
		System.out.println(koreanScore + "점, " + engScore + "점, " + mathScore + "점의 평균 : " + avg + "점입니다.");
	}
}
