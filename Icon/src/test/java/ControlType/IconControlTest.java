package ControlType;

import iconControlPackage.IconControlType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IconControlTest
{
    IconControlType Icon;
    public static WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        System.setProperty("WebDriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testbed.devum.com/#/security/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void loginPage() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.login_Devum();
    }

    @Test(priority = 2)
    public void ValidateAppStudioPage() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.VerifyAppStudioPage();
    }

    @Test(priority = 3)
    public void AddingNewPage() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.AddingNewPage();
    }

    @Test(priority = 4)
    public void AddingIconControl() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.AddingIconControl();
    }

    @Test(priority = 5)
    public void AddingAndVerifyingMargin() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.AddingAndVerifyingMargin();
    }

    @Test(priority = 6)
    public void AddingAndVerifyingPadding() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.AddingAndVerifyingPadding();
    }

    @Test(priority = 7)
    public void UploadingFileToIcon() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.FileUploading();
    }

    @Test(priority = 8)
    public void UpdatingIconSize() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.ChangingIconSize();
    }

    @Test(priority = 9)
    public void DeleteIconControlTypePage() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.Deleting_Page();
    }

    @AfterTest
    public void logout() throws InterruptedException {
        Icon = new IconControlType(driver);
        Icon.log_Out();
        driver.quit();
    }
}
