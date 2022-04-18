package co.edu;

public class InheritExample {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.field1 = "";
		c1.field2 = "";
		
		c1.method1();
		c1.method2();
		
		Child2 c2 = new Child2();
		c2.field1 = "";
		c2.field3 = "";
		
		c2.method1();
		c2.method3();
		
		//부모의 참조벼수에 자식 인스턴스를 할당.
		Parent p1 = new Parent();
		p1 = new Child1();
		p1 = new Child2();
		
		p1.field1 = ""; // 부모가 가진 필드, 메소드
		p1.method1(); // 부모가 가진 필드, 메소드
		
		c1 = (Child1) p1; // 강제 형변환.
		c2 = (Child2) p1;
		c2.field1 = "";
		c2.field3 = "";
	}
}
