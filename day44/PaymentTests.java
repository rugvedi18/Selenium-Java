package day44;

import org.testng.annotations.Test;

// functional group (both sanity and regression)
public class PaymentTests {

	@Test(priority = 1, groups = { "sanity", "regression", "functional" })
	void paymentInRupees() {
		System.out.println("Payment in Rs.");
	}

	@Test(priority = 2, groups = { "sanity", "regression", "functional" })
	void paymentInDollars() {
		System.out.println("Payment in $");
	}

}
