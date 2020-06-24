package CCHotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPage {
    private final BasePage basePage;
    @FindBy(xpath = "//button[@class='sc-AxmLO jpPZLu'][//b[style='Check-in']]") private WebElement checkInBtn;
    @FindBy(xpath = "//button[@class='sc-AxmLO jpPZLu'][//b[style='Check-out']]") private WebElement checkOutBtn;
    @FindBy(xpath = "//div[text()='SEARCH']") private WebElement search;
    @FindBy(xpath = "//button[text()='Confirm']") private WebElement modalConfirm;
    @FindBy(xpath = "//div[@class='react-calendar__month-view__days']") private WebElement calendar;
    @FindBy(xpath = "(//button[text()='BOOK NOW'])[1]") private WebElement bookLuxury;
    @FindBy(xpath = "(//button[text()='BOOK NOW'])[2]") private WebElement bookSuperior;
    @FindBy(xpath = "(//button[text()='BOOK NOW'])[1]") private WebElement bookRockstar;

    public ReservationPage() {
        this.basePage = BasePage.getInstanceOfBasePage();
        PageFactory.initElements(basePage.getDriver(), this);
    }
}
