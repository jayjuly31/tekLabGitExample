package example;


import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");
		System.out.println("This is my third commit today");
		System.out.println("Bop");
	    System.out.println("this is darcey's change");
	    
	
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

