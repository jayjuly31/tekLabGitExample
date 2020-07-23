package example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");
		System.out.println(" Let's change the world");
		
		System.out.println("--------Change this line and and ****");
		System.out.println("Showing how to commit ");
		System.out.println("clean up code");
		System.out.println(" another code I write");
		System.out.println("wafa white");
		
		
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/jayjuly31/tekLabGitExample.git

		System.out.println("Priscilla 7");
<<<<<<< HEAD

		
=======
>>>>>>> branch 'master' of https://github.com/jayjuly31/tekLabGitExample.git
		System.out.println("Moe");
		System.out.println("Jay Green");
<<<<<<< HEAD
   // branch 'master' of https://github.com/jayjuly31/tekLabGitExample.git
=======
>>>>>>> branch 'master' of https://github.com/jayjuly31/tekLabGitExample.git
		System.out.println("Robert Blue");
<<<<<<< HEAD

			System.out.println(" change in MK logon ");
=======
		System.out.println("another code");
		
		System.out.println("changes in jc loginpage verify");
		System.out.println(" seconnde ");
		
		System.out.println("abcde");

>>>>>>> branch 'master' of https://github.com/jayjuly31/tekLabGitExample.git
	}
	
	@BeforeMethod
	public void setUp() {
		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}

}

