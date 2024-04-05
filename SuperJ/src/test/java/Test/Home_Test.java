package Test;

import java.awt.Point;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;


import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Element_loaction.Home;
import Element_loaction.Login;
import Element_loaction.Profile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Home_Test extends Baseclass{

	
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
			capabilitie.setCapability(MobileCapabilityType.NO_RESET,true);
			capabilitie.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			capabilitie.setCapability("appPackage","com.superj");
			capabilitie.setCapability("appActivity","com.superj.MainActivity");
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			URL url = new URL("http://127.0.0.1:4723");
			driver = new AppiumDriver<MobileElement>(url,capabilitie); 
			Login main = new Login(driver);
			Home main1 = new Home(driver);
			Profile main2 = new Profile(driver);
			
			//add mobile Number.
//			main.entervalidmobilenumber();
//			main.MobileNumberScreen_Continue();
//			Thread.sleep(2500);
//			
//			main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
//			main.OTP_continue();
//			Thread.sleep(3000);
			
			  
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
		public void TC_HOME_01() throws Exception
		{
		
			Login main = new Login(driver);
			Home main1 = new Home(driver);
			Profile main2 = new Profile(driver);
			ExtentTest test = extent.createTest("this steps shows", "Wallet"); 
		
		//	Thread.sleep(6600);
			
			Thread.sleep(6000);
			
//			test.log(Status.PASS, "Click on Wallet.");
//			//main1.Wallet();
//			Thread.sleep(2700);
//			main1.Click_Bumper();
//			Thread.sleep(1500);
//			main1.Bumper_Start_Survey();
//			Thread.sleep(1500);
//			main1.Bumper_Streak_Answer_1();
//			Thread.sleep(1500);
//			main1.Bumper_Streak_next();
//			Thread.sleep(4000);
//			
			
			//(396, 2118 perform(Arrays.asList(tapPoint));
			
			main1.Bumper_streak_Earn_more_rewards();
			
			Boolean visible = main.Homescreen_supej();
			
			
		}
			 
}
