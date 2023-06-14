package AutomationPortfolio.Visualtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	private WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void open() {
		driver.get("http://yourwebsite.com");
	}

	public WebElement getLogoElement() {
		return driver.findElement(By.id("logo"));
	}
}
