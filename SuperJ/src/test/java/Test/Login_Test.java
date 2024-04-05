package Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.aspectj.apache.bcel.generic.RET;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Element_loaction.Home;
import Element_loaction.Login;
import Element_loaction.Profile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login_Test extends Baseclass{

	Login_Test() throws IOException {
		super();
		 
	 } 
	 
		 @BeforeMethod
			public void setup() throws IOException
			{
				
			FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\SuperJ\\src\\test\\java\\TestData\\DataFile");		
			prop.load(fr);
				
				 
				try {
				
				DesiredCapabilities capabilitie = new DesiredCapabilities();
				capabilitie.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
				capabilitie.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
				capabilitie.setCapability(MobileCapabilityType.DEVICE_NAME, "962959539700161");
				//capabilitie.setCapability(MobileCapabilityType.APP, fs.getAbsoluteFile());
				capabilitie.setCapability("autoGrantPermissions", "true");
				capabilitie.setCapability(MobileCapabilityType.NO_RESET,false);
				capabilitie.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				capabilitie.setCapability("appPackage","com.superj");
				capabilitie.setCapability("appActivity","com.superj.MainActivity");
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				URL url = new URL("http://127.0.0.1:4723");
				driver = new AppiumDriver<MobileElement>(url,capabilitie); 
				Login main = new Login(driver);
				Home main1 = new Home(driver);
				Profile main2 = new Profile(driver);
				
				  
				}catch (Exception exp) {
					System.out.println("cause is : "+exp.getCause());
					System.out.println("message is :"+exp.getMessage());
					exp.printStackTrace();
				} 
				
			}	
			
			   
			
			@AfterMethod
			public void teardown() 
			{
				 
				driver.quit();
				System.out.println("close the application...");
			
			}
			
			@Test(priority = 1,retryAnalyzer = Retry.class)
			public void TC_Login_01 () throws Exception
			{
				
			Login main = new Login(driver);
			ExtentTest test = extent.createTest("this steps shows", "Create an account");
			
			test.log(Status.PASS, "Enter Invalid MobileNumber");
			main.InValid_MObileNumber();
						 
			test.log(Status.PASS, "Click on Continue");
			main.MobileNumberScreen_Continue();
			Thread.sleep(3000);
			
			test.log(Status.PASS, "error message is displayed.");
			Boolean visible = main.MObilenumber_Errormessage();
			Assert.assertEquals(visible,true, "Please enter a valid phone number");
			
			
			Thread.sleep(7000);
			}

			
			
			@Test(priority = 2,retryAnalyzer = Retry.class)
			public void TC_Login_02 () throws Exception {
				
				Login main = new Login(driver);
				ExtentTest test = extent.createTest("this steps shows", "Create an account");
								
				test.log(Status.PASS, "Enter Valid MobileNumber");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				
				test.log(Status.PASS, "Click on Continue");
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enter invalid OTP");
				
				test.log(Status.PASS, "Click on Continue");
				main.OTP_continue();
				
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Error message is displayed");
				Boolean visible = main.OTP_error_message();
				Assert.assertEquals(visible,true,"Please enter a valid otp");
				
				Thread.sleep(2000);
			}
			
			
			@Test(priority = 3,retryAnalyzer = Retry.class)
			public void TC_Login_03 () throws Exception
			{
							
				Login main = new Login(driver);
				ExtentTest test = extent.createTest("this steps shows", "Create an account"); 
				
				test.log(Status.PASS, "Enter Valid MobileNumber");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				
				test.log(Status.PASS, "Click on Continue");
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enter valid OTP");			
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				
				test.log(Status.PASS, "Click on Continue");	
				main.OTP_continue();
				Thread.sleep(8000);
				
				//On-boarding screens.
				test.log(Status.PASS, "isdisplayed TAP TO GO screen.");
				main.TAP_TO_GO();
				Thread.sleep(4500);
				
				test.log(Status.PASS, "click on On-boarding next");
				main.On_boardingnext01();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Referral screen next");
				main.Have_Referral_code();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Referral inside click on next");
				main.Referralinside_next();
				
				test.log(Status.PASS, "error message is displayed");
				Boolean visible = main.Please_enter_avalid_Referral_code();
				Assert.assertEquals(visible,true, "Please enter a valid code");
			   
				Thread.sleep(3000);
				

			}
			
			
			@Test(priority = 4,retryAnalyzer = Retry.class)
			public void Tc_Login_04() throws Exception 
			{
			
				Login main = new Login(driver);
				Home main1 = new Home(driver);
				Profile main2 = new Profile(driver);
				
				
				ExtentTest test = extent.createTest("this steps shows", "Create an account"); 
				
				test.log(Status.PASS, "Enter Valid MobileNumber");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				
				test.log(Status.PASS, "Click on Continue");
				main.MobileNumberScreen_Continue();
				
				test.log(Status.PASS, "Enter valid OTP");			
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				
				test.log(Status.PASS, "Click on Continue");	
				main.OTP_continue();
				Thread.sleep(7000);
				
				//On-boarding screens.
				test.log(Status.PASS, "isdisplayed TAP TO GO screen.");
				main.TAP_TO_GO();
				Thread.sleep(4500);
				
				test.log(Status.PASS, "click on On-boarding next");
				main.On_boardingnext01();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Referral screen next");
				main.Referral_screen_next();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Select the DOB Year");
				main.Clickon_DOB();
				main.DOB_1955();				
				main.DOB_Next();
				
				test.log(Status.PASS, "Select the Gender");
				main.Gender_Male();
				main.DOB_Next();
				Thread.sleep(2000);
				
				test.log(Status.PASS, "Enterd City");
				main.City_Textfield();
				main.location_hyderabad();
				Thread.sleep(5000);
				main.DOB_Next();
				
				test.log(Status.PASS, "Select the On-boarding Coupons");
				Thread.sleep(5000);
				main.Myntra_coupon();main.McDonalds_coupon();
				
				test.log(Status.PASS, "collect your option");
				main.Collect_your_coupon();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "click on Start your Journey");
				main.Start_your_Journey();
				
				test.log(Status.PASS, "Notification screen select skip");
				main.notification_skip();
				
				Thread.sleep(5000);
				test.log(Status.PASS, "Home screen is displayed");
				main.Homescreen_supej();
				Thread.sleep(2000);
			}
			
			@Test(priority = 5,retryAnalyzer = Retry.class)
			public void Tc_Login_05() throws Exception {
				
				Login main = new Login(driver);
				Home main1 = new Home(driver);
				Profile main2 = new Profile(driver);
				
				
				ExtentTest test = extent.createTest("this steps shows", "Create an account"); 
				
				test.log(Status.PASS, "Enter Valid MobileNumber");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				
				test.log(Status.PASS, "Click on Continue");
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enter valid OTP");			
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				
				test.log(Status.PASS, "Click on Continue");	
				main.OTP_continue();
				Thread.sleep(7000);
				
				//On-boarding screens.
				test.log(Status.PASS, "isdisplayed TAP TO GO screen.");
				main.TAP_TO_GO();
				Thread.sleep(4500);
				
				test.log(Status.PASS, "click on On-boarding next");
				main.On_boardingnext01();
				
				test.log(Status.PASS, "Referral screen next");
				main.Referral_screen_next();
				Thread.sleep(2000);
				
				test.log(Status.PASS, "Select the DOB Year");
				main.Clickon_DOB();
				main.DOB_1955();				
				main.DOB_Next();
				
				test.log(Status.PASS, "Select the Gender");
				main.Gender_Male();
				main.DOB_Next();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enterd City");
				main.City_Textfield();
				Thread.sleep(1000);
				main.location_hyderabad();
				Thread.sleep(3000);
				main.DOB_Next();
				Thread.sleep(6000);
								
				test.log(Status.PASS, "collect your option");
				main.Collect_your_coupon();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Coupons Screen error message is displayed ");
				main.coupons_screen_error_Message();
				
				test.log(Status.PASS, "Select the On-boarding Coupons");
				Thread.sleep(5000);
				main.Myntra_coupon();main.McDonalds_coupon();
				
				test.log(Status.PASS, "collect your option");
				main.Collect_your_coupon();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "click on Start your Journey");
				main.Start_your_Journey();
				
				test.log(Status.PASS, "Notification screen select skip");
				main.notification_skip();
				
				Thread.sleep(5000);
				test.log(Status.PASS, "Home screen is displayed");
				main.Homescreen_supej();		
			}
			
			@Test(priority = 6,retryAnalyzer = Retry.class)
			public void TC_Login_06() throws Exception{
				
				Login main = new Login(driver);
				Home main1= new Home(driver);
				Profile main2 = new Profile(driver);
				ExtentTest test = extent.createTest("this steps shows", "Create an account gender Female");
				
				
				test.log(Status.PASS, "Enter a Valid Mobile Number");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				Thread.sleep(3000);
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enter a Valid OTP");
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				main.OTP_continue();
				Thread.sleep(8000);
				
				test.log(Status.PASS, "Select the On-Boarding next");
				main.TAP_TO_GO();
				Thread.sleep(6000);
				main.On_boardingnext01();
				
				test.log(Status.PASS, "Referral screen next");
				main.Have_Referral_code();
				main.dont_have_referral_code();
				
				test.log(Status.PASS, "Select the DOB year");
				main.Clickon_DOB();
				main.DOB_1955();
				main.DOB_Next();
				
				test.log(Status.PASS, "Select the Gender (female)");
				main.Gender_Female();
				main.DOB_Next();
				
				test.log(Status.PASS, "enter the city");
				main.City_Textfield();
				main.location_hyderabad();
				main.city_permission();
				Thread.sleep(1000);
				main.DOB_Next();
				
				test.log(Status.PASS, "Select the Coupons");
				Thread.sleep(7000);
				main.Gruhastree_Coupon();main.Islevania_Coupon();
				main.Collect_your_coupon();
				Thread.sleep(2000);
				
				test.log(Status.PASS, "Select the Journey");
				main.Start_your_Journey();
				main.notification_skip();
				Thread.sleep(2000);
				
				test.log(Status.PASS, "Home screen is displayed");
				main.Homescreen_supej();
				Thread.sleep(3000);				
			}
			
//			@Test(priority = 7, retryAnalyzer = Retry.class)
//			public void TC_Login_07() throws Exception 
//			{
//				
//				Login main = new Login(driver);
//				Home main1= new Home(driver);
//				Profile main2 = new Profile(driver);
//				ExtentTest test = extent.createTest("this steps shows", "Create an account gender Female");
//				
//				
//				main.entervalidmobilenumber();
//				main.MobileNumberScreen_Continue();
//				Thread.sleep(3000);
//				
//				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
//				main.OTP_continue(); 
//				Thread.sleep(6000);
//				
//				main2.Click_on_Profile();
//				Thread.sleep(2000);
//				
//			}
			
			@Test(priority = 8,retryAnalyzer = Retry.class)
			public void TC_Login_08() throws Exception
			{
			
				Login main = new Login(driver);
				Home main1 = new Home(driver);
				Profile main2 = new Profile(driver);
				
				
				ExtentTest test = extent.createTest("this steps shows", "Create an account"); 
				
				test.log(Status.PASS, "Enter Valid MobileNumber");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				
				test.log(Status.PASS, "Click on Continue");
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enter Invalid OTP");			
				main.OTP_1();main.OTP_2invalid();main.OTP_3();main.OTP_4();
				
				test.log(Status.PASS, "Click on Continue");	
				main.OTP_continue();
				Thread.sleep(5000);
				
				test.log(Status.PASS, "error message is displayed");
			    Boolean visiable =main.OTP_error_message();
				Assert.assertEquals(visiable,true, "Please enter a valid otp");
				
				main.OTP_4Clear();main.OTP_3Clear();main.OTP_2Clear();main.OTP_1Clear();
				
				
				test.log(Status.PASS, "Enter valid OTP");			
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				
				test.log(Status.PASS, "Click on Continue");	
				main.OTP_continue();
				Thread.sleep(9000);
				
				test.log(Status.PASS, "Onboarding welcome screen is displayed");
				Boolean Vscreen = main.Onboardng_Welcomescreen();
				Assert.assertEquals(Vscreen,true, "WELCOME");
				
				Thread.sleep(2000);
				
			}
			
			@Test(priority = 9,retryAnalyzer = Retry.class)
			public void TC_Login_09() throws Exception 
			{
				
				Login main = new Login(driver);
				Home main1= new Home(driver);
				Profile main2 = new Profile(driver);
				ExtentTest test = extent.createTest("this steps shows", "Create an account gender Female");
				
				
				test.log(Status.PASS, "Enter a Valid Mobile Number");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				Thread.sleep(3000);
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Enter a Valid OTP");
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				main.OTP_continue();
				Thread.sleep(9000);
				
				test.log(Status.PASS, "Select the On-Boarding next");
				main.TAP_TO_GO();
				Thread.sleep(6000);
				main.On_boardingnext01();
				
				test.log(Status.PASS, "Referral screen next");
				main.Have_Referral_code();
				main.dont_have_referral_code();
				
				test.log(Status.PASS, "Select the DOB year");
				main.Clickon_DOB();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "Scroll to 1982");
				String DOB = "1982";
				MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + DOB + "\").instance(0))"));			
				elementToClick.click();
				Thread.sleep(3000);
				main.DOB_Next();
				Thread.sleep(6000);
				
				test.log(Status.PASS, "Select the Gender (female)");
				main.Gender_Male();
				main.DOB_Next();
				
				test.log(Status.PASS, "enter the city");
				main.City_Textfield();
				main.location_hyderabad();
				Thread.sleep(1000);
				main.DOB_Next();
				
				test.log(Status.PASS, "Select the Coupons");
				Thread.sleep(7000);
				main.Gruhastree_Coupon();main.Islevania_Coupon();
				main.Collect_your_coupon();
				Thread.sleep(2000);
				
				test.log(Status.PASS, "Select the Journey");
				main.Start_your_Journey();
				main.notification_skip();
				Thread.sleep(2000);
				
				test.log(Status.PASS, "Home screen is displayed");
				main.Homescreen_supej();
				Thread.sleep(3000);				
				
			}
			
			@Test(priority = 10,retryAnalyzer = Retry.class)
			public void TC_Login_10() throws Exception 
			{
				
				Login main = new Login(driver);
				Home main1= new Home(driver);
				Profile main2 = new Profile(driver);
				ExtentTest test = extent.createTest("this steps shows", "Create an account gender Female");
				
				
				test.log(Status.PASS, "Enter a Valid Mobile Number");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
				Thread.sleep(3000);
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
				 
				test.log(Status.PASS, "Enter a Valid OTP");
				main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
				main.OTP_continue();
				Thread.sleep(9000);
				
				test.log(Status.PASS, "Select the On-Boarding next");
				main.TAP_TO_GO();
				Thread.sleep(6000);
				main.On_boardingnext01();
				
				Thread.sleep(2000);
				
			}
			
			@Test(priority = 11,retryAnalyzer = Retry.class)
			public void TC_Login_11() throws Exception 
			{
			
				
				Login main = new Login(driver);
				Home main1= new Home(driver);
				Profile main2 = new Profile(driver);
				ExtentTest test = extent.createTest("this steps shows", "Create an account gender Female");
				
				
				test.log(Status.PASS, "Enter a InValid Mobile Number");
				main.InValid_MObileNumber();
				Thread.sleep(1500);
				test.log(Status.PASS, "Click on Continue");
				main.MobileNumberScreen_Continue();
				Thread.sleep(3000);
			
				test.log(Status.PASS, "Error message is displyaed");
				Boolean visibles = main.MObilenumber_Errormessage() ;
				Assert.assertEquals(visibles,true, "Please enter a valid phone number");
				
				test.log(Status.PASS, "Clear the Mobile number");
				main.MobileNumber_clear();
				
				test.log(Status.PASS, "Enter a Valid Mobile Number");
				main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
								
				main.MobileNumberScreen_Continue();
				
				test.log(Status.PASS, "redirected to OTP screen");
				Boolean vs = main.EnterOTP_Screen();
				Assert.assertEquals(vs,true, "Enter OTP");
				
				Thread.sleep(2000);
			}
			
			
			
			
} 



