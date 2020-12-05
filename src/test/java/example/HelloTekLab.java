package example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;




public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");
		
		System.out.println("This is Peter's change");
		
		System.out.println("This is my second commit today");	
		
		System.out.println("this is my third commit today");
		
	}

	
	@BeforeMethod
	public void setUp() {
		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}
	
	public void goodMethod() {
		System.out.println("this is a new method");
		
	}
		
	}



