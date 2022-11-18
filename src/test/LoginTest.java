package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public ChromeDriver driver;

    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\btech\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.target.com");
    }

    @Test
    public void validLoginTest(){

    }

    @Test
    public void invalidLoginWithInvalidEmailTest(){

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

}
