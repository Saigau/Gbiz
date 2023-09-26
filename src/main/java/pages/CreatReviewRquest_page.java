package pages;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatReviewRquest_page {

	WebDriver driver;	
	@FindBy(xpath = "//a[normalize-space()='Product Settings']")
	WebElement Productsetting;

	@FindBy(xpath = "//*[text()=' Review Request Forms ']")
	WebElement form;

	@FindBy(xpath = "//i[@class='fal fa-plus header-button']")
	WebElement Puls;

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name;

	@FindBy(xpath = "//textarea[@id='disc']")
	WebElement disc;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save1;

	@FindBy(xpath = "//div[contains(text(),'Security')]")
	WebElement security;

	@FindBy(xpath = "//label[@for='public_access']")
	WebElement PublicCheck;
	@FindBy(xpath = "//div[contains(text(),'Dynamic Config')]")
	WebElement dynamic;
	@FindBy(xpath = "//tbody/tr[2]/td[2]/a[1]/i[1]")
	WebElement Star;
	@FindBy(xpath = "//label[@for='is_required']")
	WebElement Staris;
	@FindBy(xpath = "//tbody/tr[4]/td[2]/a[1]/i[1]")
	WebElement Email;

	@FindBy(xpath = "//tbody/tr[5]/td[2]/a[1]/i[1]")
	WebElement Review;

	@FindBy(xpath = "//tbody/tr[6]/td[2]/a[1]/i[1]")
	WebElement Title;

	@FindBy(xpath = "//tbody/tr[7]/td[2]/a[1]/i[1]")
	WebElement Logo;

	

	@FindBy(xpath = "//label[@for='is_required']")
	WebElement Emailis;

	@FindBy(xpath = "//label[@for='is_required']")
	WebElement reviewis;

	@FindBy(xpath = "//input[@placeholder='Value']")
	WebElement titlevalue;

	@FindBy(xpath = "//input[@type='file']")
	WebElement logo; 

	@FindBy(xpath = "//button[@class='btn btn-primary px-2']")
	WebElement Starsave ;

	@FindBy(xpath = "//button[@class='btn btn-primary px-2']")
	WebElement Emailsave;
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	WebElement settingbutton;

	@FindBy(xpath = "//button[@class='btn btn-primary px-2']")
	WebElement reviewsave;

	@FindBy(xpath = "//button[@class='btn btn-primary px-2']")
	WebElement titlesave;

	@FindBy(xpath = "//button[@class='btn btn-primary px-2']")
	WebElement Logosave;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save2;

	Random rand = new Random(); 
    // Setting the upper bound to generate the
    // random numbers in specific range
    int upperbound = 25;
    // Generating random values from 0 - 24 
    // using nextInt()
    int int_random = rand.nextInt(upperbound); 

	public CreatReviewRquest_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void reviewform() throws InterruptedException 
	{		
	settingbutton.click();
	Thread.sleep(3000);

	Productsetting.click();
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    
    Thread.sleep(3000);
form.click();

Thread.sleep(3000);
	
	Puls.click();
	
	Name.sendKeys("TestAutomate"+int_random);
	disc.sendKeys("Testing porposes only");
	save1.click();
	
	security.click();

	PublicCheck.click();
	dynamic.click();
	
	//Star.click();

//    Thread.sleep(3000);
//	Staris.click();
//	Starsave.click();

	Email.click();
	Thread.sleep(3000);
	
	Emailis.click();
	Emailsave.click();

	Review.click();
	Thread.sleep(3000);
	
	reviewis.click();
	reviewsave.click();
	
	Title.click();
	titlevalue.sendKeys("Automation");
	titlesave. click();
	
	Logo.click();
	logo.sendKeys("C://Users//saigaurav//OneDrive - Uncode Inc//Pictures//Screenshots//image_173.png");
	Logosave.click();

	Save2.click();
	}
}
