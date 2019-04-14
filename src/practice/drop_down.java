package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium All Softwares\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));

		Select select = new Select(Month);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++)

		{

			if (options.get(i).getText().equalsIgnoreCase("Jan"))

			{

				options.get(i).click();

				break;
				
			}
		}
		System.out.println("drop down is selected");

	}
}
