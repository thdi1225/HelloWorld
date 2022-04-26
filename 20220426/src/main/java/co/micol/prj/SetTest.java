package co.micol.prj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public void setTest() {
		Set<String> name = new HashSet<String>();
		name.add("홍길동");
		name.add("박길동");
		name.add("김길동");
		
		Iterator<String> iterator = name.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
