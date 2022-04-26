package co.micol.prj;

import co.micol.prj.conn.Oracle;

public class MainApp {
	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.getConnection();
		oracle.printCustomer();
	}
}
