package CCHotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private BasePage basePage;
    @FindBy(xpath = "//button[@data-id='1']") private WebElement luxuryRoomBtn;
    @FindBy(xpath = "//button[@data-id='12']") private WebElement superiorRoomBtn;
    @FindBy(xpath = "//button[@data-id='23']") private WebElement rockstarRoomBtn;
    @FindBy(linkText = "Reserve") private WebElement reserveBtn;
    @FindBy(xpath = "//a[@href='/login']") private WebElement loginBtn;
    @FindBy(linkText = "Reservations") private WebElement reservationPageBtn;
    @FindBy(xpath = "(//b[@class='gold-text-selection'])[3]") private WebElement categoryCard;
    @FindBy(xpath = "//b[text()='Grand Hotel Codecool']") private WebElement title;
    @FindBy(xpath = "//div[@class='sc-AxiKw cmqkKJ']") private WebElement myName;


    public MainPage() {
        this.basePage = BasePage.getInstanceOfBasePage();
        PageFactory.initElements(basePage.getDriver(),this);
    }

    public void clickCategory(String categoryName){
        WebDriverWait wait = new WebDriverWait(basePage.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(luxuryRoomBtn));
        switch (categoryName){
            case "Luxury Room":
                luxuryRoomBtn.click();
                break;
            case "Superior Street View Room":
                superiorRoomBtn.click();
                break;
            case "Rockstar Suite Room":
                rockstarRoomBtn.click();
                break;
        }
    }

    public String getCardTitle(){
        return categoryCard.getText();
    }

    public String getMyName() {
        return myName.getText();
    }
}
