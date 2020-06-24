package CCHotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final BasePage basePage;
    @FindBy(id = "username") private WebElement usernameField;
    @FindBy(id = "password") private WebElement pwField;
    @FindBy(xpath = "//button[text()='Login']") private WebElement loginBtn;
    @FindBy(xpath = "//h3[@class='text-center text-info']") private WebElement pageTitle;
    @FindBy(xpath = "//button[text()='Logout']") private WebElement logoutBtn;

    public LoginPage() {
        this.basePage = BasePage.getInstanceOfBasePage();
        PageFactory.initElements(basePage.getDriver(), this);
    }

    public void login(){
        basePage.getDriver().navigate().to("http://localhost:3000/login/");
        usernameField.sendKeys("admin");
        pwField.sendKeys("password");
        loginBtn.click();
    }
}
