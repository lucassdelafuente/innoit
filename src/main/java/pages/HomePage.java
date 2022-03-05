package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.Normalizer;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wt;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "twitter-widget-0")
    private static WebElement iframe;

    @FindBy(how = How.CSS, using="div.timeline-Header.timeline-InformationCircle-widgetParent > h1.timeline-Header-title.u-inlineBlock")
    private static WebElement txtTweetsMadrid;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'DIARIO MADRID')]")
    private static WebElement btnDiarioMadrid;

    @FindBy(how = How.CSS, using="div[class='calendar-day-today'] > p[class='today']")
    private static WebElement txtDayToday;

    @FindBy(how = How.CSS, using="div[class='calendar-day-today'] > p[class='num-today']")
    private static WebElement txtNumToday;

    @FindBy(how = How.CSS, using="div[class='calendar-day-today'] > p[class='month-today']")
    private static WebElement txtMonthToday;

    public boolean txtTweetsMadridIsDisplayed(){
        wt = new WebDriverWait(driver,10);
        wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("twitter-widget-0"));
        wt.until(ExpectedConditions.visibilityOf(txtTweetsMadrid));
        return txtTweetsMadrid.isDisplayed();
    }

    public String getTxtDayToday(){
        String txtDay = txtDayToday.getText();
        txtDay = Normalizer.normalize(txtDay, Normalizer.Form.NFD);
        return txtDay.replaceAll("[^\\p{ASCII}]", "");
    }

    public int txtNumToday(){
        return Integer.parseInt(txtNumToday.getText());
    }

    public String txtMonthToday(){
        return txtMonthToday.getText();
    }

    public boolean btnDiarioMadridIsClickable(){
        wt = new WebDriverWait(driver,30);

        try {
            wt.until(ExpectedConditions.elementToBeClickable(btnDiarioMadrid));
            return true;
        } catch (
                TimeoutException e){
            return false;
        }

    }



}
