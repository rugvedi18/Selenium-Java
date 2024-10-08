package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemoTest {

	@Test
	void testTitle() {
		String expectedResult = "Opencart";
		String actualResult = "Opencart";

		// Approach 1

		// when we use if() to check the both titles are equal or not,
		// then if condiotion gets failed but testTitle method gets passed

		// if (expectedResult.equals(actualResult)) {
		// System.out.println("Test passed");
		// } else {
		// System.out.println("Test failed");
		// }

		// Approach 2
		Assert.assertEquals(expectedResult, actualResult);

		// Approach 3
		if (expectedResult.equals(actualResult)) {
			System.out.println("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}

	}
}
