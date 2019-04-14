package practice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verify_page_title {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium All Softwares\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Facebok – log in or sign up")) {
			System.out.println("title page correct");
		}else {
			System.out.println("title page is not correct");
		}
		
		
	}
}
		
