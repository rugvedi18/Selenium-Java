package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void tearDown() {

		logger.info("*** Starting TC001_AccountRegistrationTest ***");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickCreateAccount();

			logger.info("licked on Create Account link..");

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			logger.info("Providing customer details..");
			regpage.setFirstName(randomString().toUpperCase()); // randomly generate the first name
			regpage.setLastName(randomString().toUpperCase()); // randomly generate the last name
			regpage.setEmail(randomString() + "@gmail.com"); // randomly generate the email
			regpage.setTelephone(randomNumber()); // randomly generate the number

			String password = randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setConfirmPassword(password);

			regpage.clickContinue();

			// validation
			logger.info("Validating expected msg..");
			String confmsg = regpage.getConfirmationMsg();

			if (confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			} else {
				logger.error("*Test Failed*");
				logger.debug("Debug logs..");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("*** Finished TC001_AccountRegistrationTest ***");
	}
}
