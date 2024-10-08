package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertionsTest {

//	@Test
	void hard_assertions() {
//		Assert.assertEquals("xyz", "xyz1"); // failed
//		Assert.assertEquals(123, 345); // failed
//		Assert.assertEquals(123, "123"); // failed

//		Assert.assertNotEquals(123, 345); // passed

		Assert.assertTrue(true); // passed
		Assert.assertTrue(false); // failed

		Assert.assertTrue(1 == 2); // failed

		Assert.fail();
		System.out.println("testing..");
	}

	@Test
	void soft_assertions() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("testing..");

		sa.assertAll(); // mandatory
	}

}
