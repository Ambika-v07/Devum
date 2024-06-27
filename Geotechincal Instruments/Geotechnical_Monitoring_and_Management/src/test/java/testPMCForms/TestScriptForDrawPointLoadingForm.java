package testPMCForms;

import PMC_Forms_POM.DrawPointLoading;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestScriptForDrawPointLoadingForm
{
    DrawPointLoading load;
    public static WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        System.setProperty("WebDriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://192.168.1.102/#/security/internal");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void loginPage() throws InterruptedException {
        load = new DrawPointLoading(driver);
        load.login_Devum();
    }

//    @Test(priority = 2)
//    public void formsDashboard() throws InterruptedException {
//        load=new DrawPointLoading(driver);
//        load.forms();
//    }



}
