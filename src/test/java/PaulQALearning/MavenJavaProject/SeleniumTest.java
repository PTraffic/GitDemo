package PaulQALearning.MavenJavaProject;

import org.testng.annotations.Test;

public class SeleniumTest {

	// testng xml file from Maven
	// how to execute all test cases from test folder - mvn test

	// @Test
	public void BrowserAutomation() {
		System.out.println("Browser Automation");
		System.out.println("Web Automation");
	}

	@Test
	public void elementsFun() {
		System.out.println("fun elements");
	}
	
	@Test
	public void elementsFun2() {
		System.out.println("fun elements2");
	}

}
