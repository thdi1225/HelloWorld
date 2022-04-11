package co.edu.variable;

public class HomeWork2 {
	public static void main(String[] args) {
		//현금 : 10000원, 물건 : 7500(부가세 : 750원 포함), 잔돈 2500원 
		int cashe = 10000;
		int product = 7500;
		int VAT = (int) (product * 0.1);
		int changes = cashe - (product + VAT);
		System.out.println();
	}
}
