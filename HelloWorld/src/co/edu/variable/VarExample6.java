package co.edu.variable;

public class VarExample6 {
	public static void main(String[] args) {
		String myName = "소진영";
		
		int age = 25;
		double height = 167.4;
		int mathScore, engScore;
		mathScore = 80;
		engScore = 90;
		
		System.out.println(myName + "의 나이는 " + age + "이고 키는 " + height + "이고 영어, 수학의 합은" + (engScore + mathScore) + "입니다.");
		
		char firstChar = myName.charAt(0);
		System.out.println((int) firstChar);
	}
}
