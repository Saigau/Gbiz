package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Utility.proper;
import io.netty.channel.unix.Socket;
import pages.CreatReviewRquest_page;
import pages.Login_Page;
import pages.QRCode_page;


public class BaseFile{
	public  static WebDriver driver;
	Login_Page login;
QRCode_page QR;
	CreatReviewRquest_page Review;
	@BeforeSuite
	public void init() throws InterruptedException, IOException

	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get(proper.prop("Url"));

	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		

	}

	@BeforeClass
	public void Obj()
	{
		login= new Login_Page(driver);
	Review = new CreatReviewRquest_page(driver);
	QR = new QRCode_page(driver);
	}
	
	@BeforeMethod
	public  void log() throws Throwable 
	{login.credentialsuser(proper.prop("user"));
	login.credentialspass(proper.prop("pass"));
	login.SwitchGbiz();
		
	}

//@AfterClass
//public void End () {
//	driver.quit();
//}
}
