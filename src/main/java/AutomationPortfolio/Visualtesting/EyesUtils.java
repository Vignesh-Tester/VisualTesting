package AutomationPortfolio.Visualtesting;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class EyesUtils {
	private static final String APPLITOOLS_API_KEY = "your_applitools_api_key";

	public static WebDriver setupWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh.thangavel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		return new ChromeDriver();
	}

	public static Eyes setupEyes(WebDriver driver) {
		Eyes eyes = new Eyes();
		eyes.setApiKey(APPLITOOLS_API_KEY);
		eyes.setForceFullPageScreenshot(true);
		eyes.setStitchMode(StitchMode.CSS);
		eyes.setBatch(new BatchInfo("Visual Test Batch"));
		eyes.setBranchName("master");
		eyes.setBaselineBranchName("baseline");

		eyes.open(driver, "Your Application Name", "Visual Test");

		return eyes;
	}

	public static void validateWindow(WebDriver driver, Eyes eyes, String tag) {
		eyes.checkWindow(tag);
	}

	public static void closeEyes(Eyes eyes) {
		eyes.close();
		eyes.abortIfNotClosed();
	}
}
