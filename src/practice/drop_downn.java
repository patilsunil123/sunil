package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_downn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium All Softwares\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		List<WebElement>optins=driver.findElements(By.xpath("//select[@name='birthday_year']/option"));
		for(WebElement ele:optins) {
	System.out.println(ele.getText());	
		}
		
		/*
		 * WebElement
		 * year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * Select sel = new Select(year); sel.selectByVisibleText("2014");
		 */
		/*
		 * List <WebElement> options = sel.getOptions();
		 * System.out.println(options.size()); for(int i=0;i<options.size();i++) {
		 * if(options.get(i).getText().equalsIgnoreCase("2004"));
		 * options.get(i).click(); break; }
		 */
//		System.out.println("selected");
		

}
}
