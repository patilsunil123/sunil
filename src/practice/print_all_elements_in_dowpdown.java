package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_elements_in_dowpdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium All Softwares\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement> list=sel.getOptions();
		for(WebElement ele : list) {
			System.out.println(ele.getText());
			
		}

}
}
