package day42;

import org.testng.annotations.Test;

//1. Open app
//2. Login
//3. Logout

public class TestNG_FirstTestCase {

	@Test(priority = 1)
	void openApp() {
		System.out.println("Opening application..");
	}

	@Test(priority = 2)
	void login() {
		System.out.println("Login to application..");
	}

	@Test(priority = 3)
	void logout() {
		System.out.println("Logout from application..");
	}

	// By defaqult, TestNG executes test methods in alphabetical order, Output -
	// Login to application..
	// Logout from application..
	// Opening application..

	// After using (priority=1), Output -
	// Opening application..
	// Login to application..
	// Logout from application..

	// If you don't specify any priority, by default it is 0
}
