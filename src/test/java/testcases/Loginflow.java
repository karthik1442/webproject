package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import projectPages.LoginPageElements;

public class Loginflow {
	
	static LoginPageElements loginpage = new LoginPageElements();
	
	
    //@Test
	public static void loginflow01()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		loginpage.loginbutton();
		loginpage.emailaddress("abc.qa@gmail.com");
		loginpage.password("abcxyz123");
		loginpage.login();
	
		
	}
	
	public static void main(String args[]) {
		loginflow01();
	}

}
