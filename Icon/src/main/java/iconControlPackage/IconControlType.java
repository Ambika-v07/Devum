package iconControlPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IconControlType {
    WebDriver driver;
    Actions actions;

    //LOGIN
    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(xpath = "//span[text()='Sign In']")
    private WebElement signIn;

    //PAGE CREATION
    @FindBy(xpath = "//mat-icon[text()=\" keyboard_double_arrow_right\"]")
    private WebElement doubleArrow;
    @FindBy(xpath = "//span[text()='App Studio']")
    private WebElement appStudio;
    @FindBy(xpath = "//span[text()='App Studio']")
    private WebElement appStudioName;
    @FindBy(xpath = "//span[text()='New Page']")
    private WebElement newpage;
    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement pageName;
    @FindBy(xpath = "//*[@id=\"mat-select-value-3\"]/span")
    private WebElement dropDwon;
    @FindBy(xpath = "//*[@id=\"mat-option-5\"]/span")
    private WebElement selectMasterpage;
    @FindBy(xpath = "//span[text()='SAVE']")
    private WebElement savePage;

    //VALIDATE PAGE CREATION
    @FindBy(id = "mat-input-4")
    private WebElement serachPageName;
    @FindBy(xpath = "(//div[text()='IconControlType'])[1]")
    private WebElement pageDisplayed;

    //ADDING CONTROL
    @FindBy(xpath = "//span[text()='Library']")
    private WebElement Library;
    @FindBy(xpath = "//span[text()='Outline']")
    private WebElement OutLine;
    @FindBy(xpath = "//*[@id=\"p:IconControlType_page_Web\"]")
    private WebElement WebPage;
    @FindBy(xpath = "//span[text()='Add child']")
    private WebElement addchild;
    @FindBy(xpath = "//span[text()=' Basic Elements ']")
    private WebElement Basic_Elements;
    @FindBy(xpath = "//span[text()='Icon ']")
    private WebElement icon;

    //VALIDATE CONTROL IS ADDED
    @FindBy(xpath = "//*[@id='p:IconControlType_page_Web'][1]/button/span[2]")
    private WebElement right_arrow;
    @FindBy(xpath = "(//span//span[contains(text(),'Icon')])[2]")
    private WebElement icon_conrol;
    @FindBy(xpath = "//mat-icon[text()=' chevron_right ']")
    private WebElement Right_Arrow;

    //MARGIN PROPERTY
    @FindBy(xpath = "//span[text()='Properties']")
    private WebElement Properties;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    private WebElement left_Margin;
    @FindBy(xpath = "(//input[@type='number'])[2]")
    private WebElement right_Margin;
    @FindBy(xpath = "(//input[@type='number'])[3]")
    private WebElement top_Margin;
    @FindBy(xpath = "(//input[@type='number'])[4]")
    private WebElement bottom_Margin;

    //PADDING PROPERTY
    @FindBy(xpath = "(//input[@type='number'])[5]")
    private WebElement left_Padding;
    @FindBy(xpath = "(//input[@type='number'])[6]")
    private WebElement right_Padding;
    @FindBy(xpath = "(//input[@type='number'])[7]")
    private WebElement top_Padding;
    @FindBy(xpath = "(//input[@type='number'])[8]")
    private WebElement bottom_padding;

    //COLOR PROPERTY
    @FindBy(xpath = "(//span[@class='color-preview rt-border'])[1]")
    private WebElement Fill;
    @FindBy(xpath = "(//span[@class='color-preview rt-border'])[2]")
    private WebElement color;
    @FindBy(xpath = "(//span[@class='color-preview rt-border'])[3]")
    private WebElement ToolTip_BG_Color;
    @FindBy(xpath = "(//span[@class='color-preview rt-border'])[4]")
    private WebElement ToolTip_FG_Color;
    @FindBy(xpath = "(//mat-icon[text()='clear '])[2]")
    private WebElement Clear_color_popup;

    //Colors
    @FindBy(xpath = "//span[text()='primary']//following-sibling::span[1]")
    private WebElement primary_1Color;
    @FindBy(xpath = "//span[text()='accent']//following-sibling::span[2]")
    private WebElement accent_2color;
    @FindBy(xpath = "//span[text()='warn']//following-sibling::span[1]")
    private WebElement warn_1Color;
    @FindBy(xpath = "//span[text()='primary']//following-sibling::span[6]")
    private WebElement primary_6Color;

    //DISPLAY PROPERTY
    @FindBy(xpath = "//span[text()='block']")
    private WebElement Display;
    @FindBy(xpath = "//span[text()=' flex ']")
    private WebElement flex;

    //FILE UPLOAD PROPERTY
    @FindBy(xpath = "//span[text()='Select File']")
    private WebElement Select_File;
    @FindBy(xpath = "(//mat-icon[text()=' search '])[2]//following-sibling::input")
    private WebElement Search_icon;
    @FindBy(xpath = "//img[@src='https://devum-client-public-bucket.s3.amazonaws.com/devum/images/icons/thumbnails/Whatsapp%20chat.svg']")
    private  WebElement WhatsappIcon;
    @FindBy(xpath = "//img[@src='https://devum-client-public-bucket.s3.amazonaws.com/devum/images/icons/thumbnails/Whatsapp%20chat.svg']")
    private  WebElement WhatsappIconUploaded;
    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement Continue;

    //Icon SIZE
    @FindBy(xpath = "//label[text()='Icon Size']//following-sibling::mat-form-field//div[1]//input")
    private WebElement IconSize;
    //PUBLISH
    @FindBy(xpath = "//mat-icon[text()='publish']")
    private WebElement publish;

    //DELETING PAGE
    @FindBy(xpath = "//mat-icon[text()='clear ']")
    private WebElement clear;
    @FindBy(xpath = "//button[text()=' Yes, Leave ']")
    private WebElement Yes_Leave;
    @FindBy(xpath = "//mat-icon[text()='search ']//following-sibling::input")
    private WebElement Search_Bar;
    @FindBy(xpath = "//mat-icon[text()='more_horiz']")
    private WebElement Horizontal_Bar;
    @FindBy(xpath = "//span[text()='Disable']")
    private WebElement Disable_Page;
    @FindBy(xpath = "//span[text()='YES, Disable']")
    private WebElement Yes_Disable;
    @FindBy(xpath = "//*[@id=\"content\"]/div/den-w-devum-app-map/div/den-w-app-pages-dashboard/div[2]/div/div[1]/mat-card/div/div[1]/div[2]/button")
    private WebElement Hzl_Bar2;
    @FindBy(xpath = "//a[2]")
    private WebElement Delete_Page;
    @FindBy(xpath = "//span[text()='YES, DELETE']")
    private WebElement Yes_Delete;
    @FindBy(xpath = "//mat-icon[text()='search ']//following-sibling::input")
    private WebElement Search_Page;
    @FindBy(xpath = "//mat-icon[text()='close']")
    private WebElement Close_SearchPageName;
    @FindBy(xpath = "//p[text()=' No records found ']")
    private WebElement NoRecordsFound;


    //LOGOUT
    @FindBy(xpath = "//mat-icon[contains(text(),' expand_more')]")
    private WebElement expand_more;
    @FindBy(xpath = "//span[contains(text(),'Logout')]")
    private WebElement logout;

    public IconControlType(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //LOGIN
    public void login_Devum() throws InterruptedException {
        username.sendKeys("ambika");
        password.sendKeys("Workinprogress-614");
        signIn.click();
        System.out.println("login successfully");
        Thread.sleep(5000);
    }

    //verify_AppStudio_Page
    public void VerifyAppStudioPage() throws InterruptedException {
        Thread.sleep(5000);
        doubleArrow.click();
        appStudio.click();
        boolean displayAppStudio = appStudioName.isDisplayed();
        if (displayAppStudio) {
            System.out.println("Test Pass : User is navigated to App Studio Page");
        } else {
            System.out.println("Test Fail : User is Not navigated to App Studio Page");
        }
    }

    //adding New Page and Validating
    public void AddingNewPage() throws InterruptedException {
        Thread.sleep(5000);
        newpage.click();
        pageName.sendKeys("IconControlType");
        dropDwon.click();
        selectMasterpage.click();
        savePage.click();
        Thread.sleep(10000);
        Thread.sleep(5000);
        serachPageName.clear();
        serachPageName.sendKeys("IconControlType");
        boolean displayNewPage = pageDisplayed.isDisplayed();
        if (displayNewPage) {
            System.out.println("Test Pass : New Page is Created");
        } else {
            System.out.println("Test Fail : New Page is Not created");
        }
        pageDisplayed.click();
        Thread.sleep(3000);
    }

    //adding Icon Control and validating
    public void AddingIconControl() throws InterruptedException
    {
        Thread.sleep(5000);
        Library.click();
        OutLine.click();
        actions = new Actions(driver);
        actions.contextClick(WebPage).perform();
        Thread.sleep(3000);
        actions.moveToElement(addchild).perform();
        Thread.sleep(3000);
        actions.moveToElement(Basic_Elements).perform();
        Thread.sleep(3000);
        actions.click(icon).perform();
        actions = new Actions(driver);
        actions.click(right_arrow).perform();
        boolean display_Icon = right_arrow.isDisplayed();
        if (display_Icon) {
            System.out.println("Test Pass : Icon control is Added");
        } else {
            System.out.println("Test Fail : Icon control is not Added");
        }
    }

    //Adding Margin and Validating
    public void AddingAndVerifyingMargin() throws InterruptedException {
        actions = new Actions(driver);
        Thread.sleep(3000);
        actions.click(icon_conrol).perform();
        Thread.sleep(3000);
        actions.click(Properties).perform();
        String Initial_LMargin = left_Margin.getAttribute("value");
        System.out.println("Initial Left Margin value is :" + Initial_LMargin);
        Thread.sleep(3000);
        left_Margin.sendKeys("10");
        String Final_LMargin = left_Margin.getAttribute("value");
        System.out.println("Updated Left Margin value is :" + Final_LMargin);
        Thread.sleep(3000);
        if (Final_LMargin != Initial_LMargin) {
            System.out.println("TestCase is pass: Margin value is updated");
        } else {
            System.out.println("TestCase is Fail: Margin value is not updated");
        }

    }

    //Adding And Validating Padding
    public void AddingAndVerifyingPadding() throws InterruptedException {
        Thread.sleep(3000);
        left_Padding.click();
        String Initial_LPadding = left_Padding.getAttribute("value");
        System.out.println("Initial Left Padding value is :" + Initial_LPadding);
        Thread.sleep(3000);
        left_Padding.sendKeys("5");
        String Final_LPadding = left_Padding.getAttribute("value");
        System.out.println("Updated Left Padding value is :" + Final_LPadding);
        Thread.sleep(3000);
        if (Final_LPadding != Initial_LPadding)
        {
            System.out.println("TestCase is pass: Padding value is updated");
        } else
        {
            System.out.println("TestCase is Fail: Padding value is not updated");
        }
    }

    //Uploading File To Icon and Validating
    public void FileUploading() throws InterruptedException
    {
        Select_File.click();
        Search_icon.sendKeys("Whatsapp chat.svg");
        Thread.sleep(3000);
        WhatsappIcon.click();
        String Initial_Icon = WhatsappIcon.getAttribute("src");
        System.out.println("Initial Icon is :" + Initial_Icon);
        Thread.sleep(3000);
        Continue.click();
        Thread.sleep(3000);
        WhatsappIconUploaded.click();
        String Updated_Icon = WhatsappIconUploaded.getAttribute("src");
        System.out.println("Updated Icon is :" + Updated_Icon);
        Thread.sleep(3000);
        if (Updated_Icon.equals(Initial_Icon))
        {
            System.out.println("TestCase is pass: WhatsappChat Icon is updated");
        } else
        {
            System.out.println("TestCase is Fail: WhatsappChat is not updated");
        }
    }

    // Changing Icon Size and Validating
    public void ChangingIconSize() throws InterruptedException {
        Thread.sleep(3000);
        IconSize.click();
        String InitialIconSize = IconSize.getAttribute("value");
        System.out.println("Initial Icon Size  is :" + InitialIconSize);
        Thread.sleep(3000);
        IconSize.clear();
        IconSize.sendKeys("200");
        String FinalIconSize = IconSize.getAttribute("value");
        System.out.println("Updated Icon size is :" + FinalIconSize);
        Thread.sleep(3000);
        if (FinalIconSize != InitialIconSize) {
            System.out.println("TestCase is pass: Icon Size is updated");
        } else {
            System.out.println("TestCase is Fail: Icon Size is not updated");
        }
        publish.click();
        Thread.sleep(20000);
    }

    //Deleting Page and Validating
    public void Deleting_Page() throws InterruptedException
    {
        clear.click();
        Thread.sleep(3000);
        Yes_Leave.click();
        Thread.sleep(5000);
        Search_Bar.clear();
        Search_Bar.sendKeys("IconControlType");
        Thread.sleep(4000);
        actions = new Actions(driver);
        actions.click(Horizontal_Bar).perform();
        Thread.sleep(2000);
        Disable_Page.click();
        Thread.sleep(2000);
        Yes_Disable.click();
        Thread.sleep(4000);
        actions.click(Hzl_Bar2).perform();
        Thread.sleep(2000);
        Delete_Page.click();
        Thread.sleep(3000);
        actions.click(Yes_Delete).perform();
        Thread.sleep(3000);
        if(NoRecordsFound.isDisplayed()) {
            System.out.println("Testcase is Pass :Icon Control Page is Deleted Successfully");
        }
        else
        {
            System.out.println("Testcase is fail : Icon Control Page is not Deleted");
        }
    }

    //log Out and Validating
    public void log_Out() throws InterruptedException
    {
        actions=new Actions(driver);
        Thread.sleep(5000);
        actions.click(expand_more).perform();
        Thread.sleep(4000);
        actions.click(logout).perform();
        Thread.sleep(5000);
        String Login_url = "https://testbed.devum.com/#/security/login";
        String url = driver.getCurrentUrl();
        if(url.equals(Login_url))
        {
            System.out.println("Test Case : Pass , User Logged Out Successfully");
        }
        else
        {
            System.out.println("Test Case  : Fail ,  User Logged Out UnSuccessful ");
        }
    }
}
