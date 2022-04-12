package co.edu.condition;

public class IfExample4 {
	public static void main(String[] args) {
		int randomVal = (int) (Math.random() * 100) + 1;
		
		if(randomVal <= 51) {
			System.out.println(randomVal + "은 생성된 값은 1 ~ 50까지 범위 값.");
		}else if(randomVal <= 60) {
			System.out.println(randomVal + "은 생성된 값은 51 ~ 60까지 범위 값.");
		}else if(randomVal <= 70) {
			System.out.println(randomVal + "은 생성된 값은 61 ~ 70까지 범위 값.");
		}else if(randomVal <= 80) {
			System.out.println(randomVal + "은 생성된 값은 71 ~ 80까지 범위 값.");
		}else if(randomVal <= 90) {
			System.out.println(randomVal + "은 생성된 값은 81 ~ 90까지 범위 값.");
		}else if(randomVal <= 100) {
			System.out.println(randomVal + "은 생성된 값은 91 ~ 100까지 범위 값.");
		}
	}
}
