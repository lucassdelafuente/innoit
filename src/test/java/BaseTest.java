import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.SystemDate;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected SystemDate systemDate;

    @BeforeClass
    public void setUp(){
        //Puedes elegir otro chromedriver, estos se encuentran en la carpeta resources, la versión es  98.0.4758.
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_mac");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.madrid.es/portal/site/munimadrid");
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void systemDate(){
        systemDate = new SystemDate();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
