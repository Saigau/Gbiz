package pages;

import java.time.Duration;
import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QRCode_page {

	
	WebDriver driver;
	
	@FindBy(xpath = "//span[normalize-space()='Location']")
	WebElement LocationSetting;
	
	@FindBy(xpath = "//a[normalize-space()='QR Code']")
	WebElement QRModule;
	@FindBy(xpath = "//select[@id='form_types']")
	WebElement Selectform;
	@FindBy(xpath = "//button[@class='copy-btn btn']")
	WebElement copybutton;
	
	@FindBy(xpath = "//*[@id='short_url']")
	WebElement copytext;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@data-id='Email']")
	WebElement emailF;
	
	@FindBy(xpath = "//textarea[@placeholder='Review']")
	WebElement review;
	@FindBy(xpath = "//textarea[@data-id='Feedback']")
	WebElement Feedback;
	@FindBy(xpath = "//label[@for='rs4']")
	WebElement Fourstar;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement Submit;
	public QRCode_page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void QRCode() throws InterruptedException  {
		
		LocationSetting.click();
		
		
		QRModule.click();
	Thread.sleep(3000);
		Select selform = new Select(Selectform);
		Thread.sleep(3000);
		selform.selectByValue("review_form");
		 
		 copybutton.click();
		String text = copytext.getText();
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		 
		    driver.get(text);
		    
		    
		    Name.sendKeys("Automation");
		    phone.sendKeys("9988776655");
		    email.sendKeys("asasd@gmail.com");
		    review.sendKeys("Good");
		    Fourstar.click();
		   Submit.click(); 
		  
		    
		   driver.switchTo().window(tabs.get(0));
			selform.selectByValue("feedback_form");
		   copybutton.click();
			String text1 = copytext.getText();
			
			driver.switchTo().window(tabs.get(1));
			 
			    driver.get(text1);
			    
			
			    Name.sendKeys("Automation");
			    phone.sendKeys("9988776655");
			    emailF.sendKeys("asasd@gmail.com");
			   Feedback.sendKeys("Good");
			   Submit.click(); 
			   driver.switchTo().window(tabs.get(0));
		
	}
}
