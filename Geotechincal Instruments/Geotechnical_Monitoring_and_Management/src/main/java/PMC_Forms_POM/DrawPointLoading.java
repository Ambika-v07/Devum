package PMC_Forms_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawPointLoading
{
    WebDriver driver;
    Actions actions;

    //LOGIN
    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(xpath = "//span[text()='Sign In']")
    private WebElement signIn;

    //FORMS
    ////a//div//mat-icon[text()='keyboard_double_arrow_right ']
    @FindBy(xpath = "(//a[@class='rt-cursor-pointer'])[1]")
    private WebElement DoubleArrowRight;
    @FindBy(xpath = "//a//span[text()='Forms']")
    private WebElement downArrow;
    @FindBy(xpath = "//span[text()=' Draw Point Loading']")
    private WebElement drawPointLoading;

    public DrawPointLoading(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //LOGIN
    public void login_Devum() throws InterruptedException {
        username.sendKeys("selenium");
        password.sendKeys("Selenium@123");
        signIn.click();
        System.out.println("login successfully");
        Thread.sleep(30000);
        DoubleArrowRight.click();
    }

    //Forms
    public void forms() throws InterruptedException {
        System.out.println("hiiiiiiiii");
        Actions action=new Actions(driver);
        Thread.sleep(2000);
        System.out.println("bye");
        action.click(DoubleArrowRight).perform();
       // DoubleArrowRight.click();
       // Thread.sleep(1000);
        System.out.println("seee");
        downArrow.click();
        System.out.println("oyee");
        drawPointLoading.click();

    }
}
