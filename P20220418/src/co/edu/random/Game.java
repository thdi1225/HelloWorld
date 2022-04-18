package co.edu.random;

public class Game {
	public static void main(String[] args) {
		
		
		int[] intArray = new int[5];
		int randomVal = 0;
		boolean isTrue = true;
		
		for(int i = 0; i < intArray.length; i++) {
			randomVal = (int) (Math.random() * 5 + 1);
			
			for(int j = 0; j < i; j++) {
				if(intArray[j] == randomVal) {
					isTrue = false;
					break;
				}else {
					isTrue = true;
				}
			}
			
			if(isTrue) {
				intArray[i] = randomVal;
			}else {
				i--;
			}	
		}
		
		while (true) {
			for(int i = 0; i < 5; i++) {
				System.out.println("[*]");
			}
			
			
			
		}
	}
}
