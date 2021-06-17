 package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {
		System.out.println("Hello TekLab Students");
		System.out.println("Hi jay c");
		System.out.println("Hello");
		System.out.println("third line");
		
		System.out.println("This is Amanda's practice at 10pm on 05/23/2021, i added something else, too");
		
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
