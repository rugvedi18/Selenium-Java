package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start - Test execution is started (only once)");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start - Test is started (before every test method)");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success - when test is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure - when test is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped - when test is skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish - Test execution is completed (only once)");
	}

}
