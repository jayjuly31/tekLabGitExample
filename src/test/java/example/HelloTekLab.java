package example;


import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");
		System.out.println("this is another change");
		System.out.println("this is my change");
		System.out.println("this is gulzar's change");
	}
	
	@BeforeMethod
	public void setUp() {
		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}
public static void goodMethod() {
		System.out.println("hello world");
	}

}

