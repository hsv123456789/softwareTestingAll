import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumTest {
     private WebDriver driver;

    @Before
    public void setUp() {
        // Automatically setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().browserVersion("130.0.6723.117").setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Verify that the title contains "Google"
        String title = driver.getTitle();
        assert title.contains("Google") : "Title should contain 'Google'";
    }

    @After
    public void tearDown() {
        // Close the browser after test
        if (driver != null) {

        }
    }
}
