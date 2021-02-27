package example;

import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");


		System.out.println("Peter says hello!");

		System.out.println("JayC");

		System.out.println("Hello");
		System.out.println("HudaS");
		System.out.println("third line");

	}

	@BeforeMethod
	public void setUp() {
		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}

}
