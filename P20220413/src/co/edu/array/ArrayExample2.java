package co.edu.array;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("\n-----------------------------------------------------------------\n");
				
		for(int val : intArray) {
			System.out.println(val);
		}
		
		System.out.println("\n-----------------------------------------------------------------\n");
		
		int sum = 0;
		int maxValue = 0;
		for(int i = 0; i < 5; i++) {
			if(maxValue < intArray[i]) {
				maxValue = intArray[i];
			}
			sum += intArray[i];
		}
		System.out.println(maxValue);
		System.out.println(sum);
		
	}
}
