package co.edu.dimension;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] scores = {
			{59, 63, 72}, 
			{56, 77, 33, 24}, 
			{55, 76}	
		};
		
		System.out.println(scores[0][2]);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		
		System.out.println("\n------------------------------------------------------------\n");
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j]; 
			}
			System.out.println(sum);
			System.out.println((double)sum / scores[i].length);
		}
	}
}
