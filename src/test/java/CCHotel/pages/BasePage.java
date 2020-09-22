package CCHotel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    private static BasePage instanceOfBasePage = null;

    private final WebDriver driver;

    private BasePage(){
        String driverPath = System.getenv("");
        String driverName = System.getenv("DRIVER");
        System.setProperty("webdriver.chrome.driver", "/home/nia/codecool/chromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static BasePage getInstanceOfBasePage(){
        if(instanceOfBasePage == null){
            instanceOfBasePage = new BasePage();
        }
        return instanceOfBasePage;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeDriver(){
        driver.quit();
    }
}


