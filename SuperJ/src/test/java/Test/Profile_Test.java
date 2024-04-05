package Test;

import static org.testng.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


import org.aspectj.apache.bcel.generic.RET;
import org.openqa.selenium.devtools.v111.fetch.model.RequestStage;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.seleniumhq.jetty9.util.Retainable;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Element_loaction.Home;
import Element_loaction.Login;
import Element_loaction.Profile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Profile_Test extends Baseclass{
	
	
	Profile_Test(){
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
		
		
		main.entervalidmobilenumber();
		main.MobileNumberScreen_Continue();
		Thread.sleep(2500);
		
		main.OTP_1();main.OTP_2();main.OTP_3();main.OTP_4();
		main.OTP_continue();
		Thread.sleep(3000);
		
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

	@Test(priority = 1, retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_01()  throws Exception
	{
	
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "This is DID"); 
		
		test.log(Status.PASS, "Click on profile in Home screen.");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "click on this is your DID");
		main2.Thisis_DID();
		Thread.sleep(3000);
	
	}
	
	@Test(priority = 2, retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_02() throws Exception
	{
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Refer a freiend"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "Click On Refer a Friend");
		main2.Refer_friend();
		
		test.log(Status.PASS, "Refer Popup shhould close");
		main2.Refer_Popup_close();
		Thread.sleep(2000);

		
	}

	
	@Test(priority = 3, retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_03()  throws Exception
	{
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "My History"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "click on My History");
		main2.My_History();
		
		Thread.sleep(1000);
		test.log(Status.PASS, "inside history");
//		main2.get_histort_gettext();
//		main2.get_History();
		
		main2.MyHistory_Backbutton();		
		Thread.sleep(3000);
	}
	
	@Test(priority = 4, retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_04()  throws Exception
	{
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Edit & Update the pincode"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "Click on personal info edit");
		main2.profile_edit();
		
		test.log(Status.PASS, "Clear the Pincode");
		main2.Personaledit_pincode_clear();
		
		test.log(Status.PASS, "Enter pincode");
		main2.Personaledit_validpincode();
		
		test.log(Status.PASS, "Click on Done");
		main2.profile_Edit_Done();
				
		Thread.sleep(8000);
	}
	
	@Test(priority = 5,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_05() throws Exception 
	{
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Edit & Update the Email"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "Click on personal info edit");
		main2.profile_edit();
		
		test.log(Status.PASS, "Clear the Email");
		main2.Personaledit_Email_clear();
		
		test.log(Status.PASS, "Add email");
		main2.Personaledit_valid_Email();
		
		test.log(Status.PASS, "Click On Done");
		main2.profile_Edit_Done();
		Thread.sleep(4000);
		
	}
	
	
	
	@Test(priority = 6,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_06() throws Exception 
	{
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Help and support Contact Us"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "Click on HELP & SUPPORT");
		main2.HELP_Support();
		Thread.sleep(2000);
		
		test.log(Status.PASS, "select Terms & condition.");
		main2.Help_support_contactUs();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 7,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_07() throws Exception
	{
		
	Login main = new Login(driver);
	Home main1 = new Home(driver);
	Profile main2 = new Profile(driver);
	ExtentTest test = extent.createTest("this steps shows", "Help and support Terms & Condition"); 
	
	test.log(Status.PASS, "Click On Profile");
	main2.Click_on_Profile();
	
	test.log(Status.PASS, "Click on HELP & SUPPORT");
	main2.HELP_Support();
	Thread.sleep(2000);
	
	test.log(Status.PASS, "select Terms & condition.");
	main2.Help_support_terms_condition();
	Thread.sleep(4000);
	
	
	}
	
	@Test(priority = 8, retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_08() throws Exception 
	{
		
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Edit & Update the pincode and Email"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		Thread.sleep(1500);
		
		test.log(Status.PASS, "Click on personal info edit");
		main2.profile_edit();
		
		
		test.log(Status.PASS, "Clear the pincode & Email");
		main2.Personaledit_Email_clear();
		main2.Personaledit_pincode_clear();
		
		
		test.log(Status.PASS, "Add email");
		main2.Personaledit_valid_Email();
		main2.Personaledit_validpincode();
		Thread.sleep(1400);
		
		test.log(Status.PASS, "Click On Done");
		main2.profile_Edit_Done();
		Thread.sleep(4000);
		
		
		
	}
	
	@Test(priority = 9,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_09()  throws Exception
	{
		
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Logout the account Through Account Status"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		Thread.sleep(1500);
		
		test.log(Status.PASS, "Scroll to Account Status");
		String seemore = "Account Status";
		MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + seemore + "\").instance(0))"));			
		elementToClick.click();
		Thread.sleep(3600);
		test.log(Status.PASS, "Click on Account Status");
	
		test.log(Status.PASS, "Click on Logout");
		main2.logout();
		
		test.log(Status.PASS, "Logout Yes, i,ll be back");
		main2.Logout_Yes();
		Thread.sleep(3000);	
		
		test.log(Status.PASS, "onboarding mobile screen is displayed");
		Boolean visiable = main.Mobilenumber_screen_isdisplayed();
		Assert.assertEquals(visiable,true, "Login to begin 💰" );
		Thread.sleep(2500);
	}
	
	@Test(priority = 10,retryAnalyzer = Retry.class,enabled = true)
		public void TC_Profile_10() throws Exception
	
	{
		
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Personal info text"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		Thread.sleep(1400);
		
		test.log(Status.PASS, "Profile info text");
		main2.Personal_info_gettext();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 11,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_11() throws Exception
	{
	
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "Pincode error messages is isdisplayed"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		Thread.sleep(1400);
		
		test.log(Status.PASS, "Click On Personal info edit");
		main2.profile_edit();
		
		test.log(Status.PASS, "Enter Invalid pincode");
		main2.Personaledit_pincode_clear();
		main2.Personaledit_invalidpincode();
		
		test.log(Status.PASS, "Click On personal info inside Done");
		main2.profile_Edit_Done();
		Thread.sleep(1500);
		
		test.log(Status.PASS, "Pincode error message is displayed");
		boolean visible = main2.Pincode_errormessage();
		Assert.assertEquals(visible, true,"Please enter a valid pincode");
				
	}

	
	@Test(priority = 12,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_12() throws Exception
	{
	
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "email error messages is isdisplayed"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile();
		
		test.log(Status.PASS, "Click On Personal info edit");
		main2.profile_edit();
		
		test.log(Status.PASS, "Enter Invalid Email");
		main2.Personaledit_Email_clear();
		main2.Personaledit_invalid_Email();
		
		test.log(Status.PASS, "Click On personal info inside Done");
		main2.profile_Edit_Done();
		Thread.sleep(1500);
			
		Boolean visible =main2.Email_errormessage();
		Assert.assertEquals(visible,true, "Please enter a valid email");
		Thread.sleep(3000);	

	}
	
	
	@Test(priority = 13,retryAnalyzer = Retry.class,enabled = true)
	public void TC_Profile_13() throws Exception 
	{
		
		Login main = new Login(driver);
		Home main1 = new Home(driver);
		Profile main2 = new Profile(driver);
		ExtentTest test = extent.createTest("this steps shows", "logout the account"); 
		
		test.log(Status.PASS, "Click On Profile");
		main2.Click_on_Profile(); 
		
		test.log(Status.PASS, "Scroll to Logout");
		String logout = "Logout";
		MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + logout + "\").instance(0))"));			
		elementToClick.click();
		Thread.sleep(3000);
		
		test.log(Status.PASS, "account was logout");
		Thread.sleep(4000); 
		main2.Logout_Yes(); 
		Thread.sleep(2000); 
		
		test.log(Status.PASS, "onboarding mobile screen is displayed");
		Boolean visiable = main.Mobilenumber_screen_isdisplayed();
		Assert.assertEquals(visiable,true, "Login to begin 💰" );
		Thread.sleep(2500);
	}	

	 @Test(priority = 14,retryAnalyzer = Retry.class)
	public void DID()  throws Exception
	 {
		 Login main = new Login(driver);
			Home main1 = new Home(driver);
			Profile main2 = new Profile(driver);
			ExtentTest test = extent.createTest("this steps shows", "logout the account"); 
			
			test.log(Status.PASS, "Click On Profile");
			main2.Click_on_Profile(); 
			Thread.sleep(1700);
			
			main2.Thisis_DID();
			Thread.sleep(1700);
			String text = main2.DID_Text();
			
			System.out.println(text);
			Thread.sleep(1700); 
		 
	}
	
}
