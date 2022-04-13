package co.edu.dimension;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] intArray = new int[4][3];
		
		intArray[0][0] = 10;
		intArray[1][0] = 20;
		intArray[3][2] = 100;
		
		for(int j = 0; j < intArray.length; j++) {
			for(int i = 0; i < intArray[j].length; i++) {
				System.out.println(intArray[j][i]);
			}
		}

		System.out.println("\n---------------------------------------------------------------------------\n");
		
		intArray = new int[5][5];
		int cnt = 1;
		for(int j = 0; j < intArray.length; j++) {
			for(int i = 0; i < intArray[j].length; i++) {
				intArray[i][j] += cnt;
				cnt++;
				System.out.printf("%4d" ,intArray[i][j]);
//				System.out.println("["+ i +"][" + j + "]"+intArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n---------------------------------------------------------------------------\n");
		
		for(int j = 0; j < intArray.length; j++) {
			for(int i = 0; i < intArray[j].length; i++) {
				System.out.printf("%4d" ,intArray[j][i]);
			}
			System.out.println();
		}

		System.out.println("\n---------------------------------------------------------------------------\n");
		
		for(int j = intArray.length-1; j >= 0; j--) {
			for(int i = intArray[j].length-1; i >= 0; i--) {
				System.out.printf("%4d" ,intArray[j][i]);
			}
			System.out.println();
		}
	}
}
