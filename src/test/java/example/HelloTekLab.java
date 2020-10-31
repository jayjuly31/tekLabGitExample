package example;

import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");
		
		System.out.println("This is Hannah's change");
		
		System.out.println("This is my second commit today");
		

	}
	
	@BeforeMethod
	public void setUp() {
		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}

	public void newMethod() {
		System.out.println("This is a new method");
	}
}


