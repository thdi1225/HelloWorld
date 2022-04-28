package co.micol.prj;

import co.micol.prj.controller.UserController;

public class MainApp {
	public static void main(String[] args) {
		UserController controller = new UserController();
		controller.run();
	}
}
