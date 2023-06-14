package AutomationPortfolio.Visualtesting;


import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VisualTest {
    private WebDriver driver;
    private Eyes eyes;

    @BeforeClass
    public void setUp() {
        driver = EyesUtils.setupWebDriver();
        eyes = EyesUtils.setupEyes(driver);
    }

    @Test
    public void testVisualValidation() {
        Homepage homePage = new Homepage(driver);
        homePage.open();

        EyesUtils.validateWindow(driver, eyes, "Home Page");
    }

    @AfterClass
    public void tearDown() {
        EyesUtils.closeEyes(eyes);

        if (driver != null) {
            driver.quit();
        }
    }
}