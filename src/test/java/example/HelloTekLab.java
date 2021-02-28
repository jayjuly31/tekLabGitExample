package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {
		System.out.println("Hello TekLab Students");
        System.out.println("created a new feature");
	}

	@BeforeMethod
	public void setUp() {
		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}

	
	@AfterMethod
	public void close() {
		System.out.println("close browser");

	}

}
