package co.micol.prj;

public class MainApp {
	public static void main(String[] args) {
		ListTest list = new ListTest();
		list.listTest();
		
		System.out.println("============================================================================");
		
		list.studentList();
		
		System.out.println("============================================================================");
		
		SetTest set = new SetTest();
		set.setTest();
		
		System.out.println("============================================================================");
		
		MapTest map = new MapTest();
		map.mapTest();
		
		System.out.println("============================================================================");
		
		map.studentMap();
	}
}
