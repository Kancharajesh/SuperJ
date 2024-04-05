package Element_loaction;

import java.security.PublicKey;

import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindByAllSet;

public class Login {
	
	WebDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Login to begin 💰\"]")
	private WebElement mobilenumberscreen;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"phone-number-input\"]")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid phone number\"]")
	private WebElement invalidmobilenumber;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Continue\"]")
	private WebElement mobilescreencontinue;
	
	
	//OTP Screen
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Continue\"]")
	private WebElement OTPscreencontinue;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Send again\"]")
	private WebElement Otpsendagain;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Please enter a valid otp\"]")
	private WebElement OTPErrormessage;
	
	//OTP 1.
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp-input-hidden\"]")
	private WebElement OTP1;
		
	//OTP 2.
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp-input-hidden\"]")
	private WebElement OTP2;
	////android.widget.TextView[@text="2"] 
	
	//OTP 3.
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp-input-hidden\"]")
	private WebElement OTP3;
	
	//OTP 4.
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp-input-hidden\"]")
	private WebElement OTP4;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid otp\"]")
	private WebElement invalidotp;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Enter OTP\"]")
	private WebElement enterOTP;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"OTP resent successfully\"]")
	private WebElement sendagainotpmessage;
	
	
	
	//onboarding screens.
	@FindBy(xpath = "//android.widget.TextView[@text=\"TAP TO GO\"]")
	private WebElement taptogo;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
	private WebElement onboardingnextbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"WELCOME\"]")
	private WebElement OnboardingWelcome;
	
	
	//Referral screen.
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Let's get started 🚀\"]")
	private WebElement referalscreenisdisplayed;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]")
	private WebElement Referralscreennext;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Have a referral code?\"]")
	private WebElement Referalscreenhaveareferral;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"I don't have a referral code.\"]")
	private WebElement Idonthaveareferralcode;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid code\"]")
	private WebElement pleaseenterreferraltext;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	private WebElement Referralinsidenext;

	
	
	//DOB Screen.
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Enter your of birth\"]/android.view.ViewGroup")
	private WebElement DOB;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"1955\"]")
	private WebElement DOB1955;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"1982\"]")
	private WebElement DoB1982;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Next\"]")
	private WebElement DOBNext;
	
	
	
	//Gender.
	@FindBy(xpath = "//android.widget.TextView[@text=\"Female\"]")
	private WebElement Femaletext;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Male\"]")
	private WebElement Maletext;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Non Binary\"]")
	private WebElement nonBinarytext;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
	private WebElement onboardingBackbutton;
	
	
	
	//City.
	@FindBy(xpath = "//android.widget.EditText[@text=\"Select your City\"]")
	private WebElement CLickonCitytextfiled;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Hyderabad\"]")
	private WebElement loaction_Hyderabadtext;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Mumbai\"]")
	private WebElement loaction_mumbai;
	
	@FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement cityscreenpermission;
	
	@FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]")
	private WebElement Clearcityname;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup")
	private WebElement citydropdownclick;
	
	//Onboarding-coupons_screens.
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Myntra, 10% Off Upto Rs.500, Valid till: 2 Apr 2024\"]")
	private WebElement myntracoupons;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ISLEVANIA, FLAT 10% OFF ON NIGHT WEAR ON FIRST COLLECTION, Valid till: 2 May 2024\"]")
	private WebElement ISLEVANIAcoupons;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"GRUHA STREE, ON PURCHASE OF 199, GET A FREE GOODIE, Valid till: 2 Oct 2024\"]")
	private WebElement gruhastreecoupons;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"McDonalds, Any 1 of the Item Free on Purchase of ₹249/-, Valid till: 2 May 2024\"]")
	private WebElement McDonaldscoupon;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Collect your Coupon\"]")
	private WebElement collectyourcoupontext;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Please select 2 coupons to continue\"]")
	private WebElement couponsscreenerrormesg;
	
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"Start your Journey\"]")
	private WebElement StartyourJourneynext;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")
	private WebElement coupon1;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
	private WebElement coupon2;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]")
	private WebElement coupon3;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]")
	private WebElement coupon4;
	
	// notification screen.
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"Skip\"]")
	private WebElement notificationskip;
	
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"Yes, notify me\"]")
	private WebElement notificationyes;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Super J\"]")
	private WebElement Homescreen_supejtext;
	
	
	public Login(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	 
	
	public Boolean Mobilenumber_screen_isdisplayed() {
	return mobilenumberscreen.isDisplayed();
	}
	 
//	public void Valid_Mobilenumber () {
//		mobilenumber.sendKeys("6281674691");
//	}
//	
//	public void invalid_Mobilenumber(String data) {
//		mobilenumber.sendKeys(data);
//	}
	
	public void clickonMobilenumber(String data) {
	mobilenumber.sendKeys(data);
	}
	
	public void entervalidmobilenumber() {
		mobilenumber.sendKeys("6281674691");
	}
	
	public void InValid_MObileNumber() {
		mobilenumber.sendKeys("698789");
	}
	
	public void MobileNumber_clear() {
		mobilenumber.clear();
	}
	
	public Boolean invalid_mobilenumbertext_displayed() {
		return invalidmobilenumber.isDisplayed();
	}
	
//	public String invalid_mobilenumber_gettext() {
//	 return	invalidmobilenumber.getText();
//	 
//	}
	
	public void MobileNumberScreen_Continue() {
		mobilescreencontinue.click();
	}
	
	//OTP Screen.
	public void OTP_continue() {
		OTPscreencontinue.click();
	}
	
	public Boolean OTP_error_message() {
	return	OTPErrormessage.isDisplayed();
	}
	
	public Boolean MObilenumber_Errormessage() {
	return	invalidmobilenumber.isDisplayed();
	}
	
	
	//OTP.	
	public void OTP_1() {
		OTP1.sendKeys("2");
	}
	
	public void OTP_1Clear() {
		OTP1.clear();
	}
	
	public void OTP_2() {
		OTP2.sendKeys("0");
	}
	
	public void OTP_2Clear() {
		OTP2.clear();
	}
	
	public void OTP_2invalid() {
		OTP2.sendKeys("3");
	}
	
	public void OTP_3() {
		OTP3.sendKeys("2");
	}
	
	public void OTP_3Clear() {
		OTP3.clear();
	}
	
	public void OTP_4() {
		OTP4.sendKeys("0");
	}
	
	public void OTP_4Clear() {
		OTP4.clear();
	}
	
	public Boolean EnterOTP_Screen() {
	return enterOTP.isDisplayed();
	}
	
	public void Send_again_OTP() {
		Otpsendagain.click();
	}
	

	public Boolean OTP_reset_sucessfully() {
	return	sendagainotpmessage.isDisplayed();
	}
	
	
	// on-boarding First screen.
	public Boolean please_enter_invalidOTP() {
	return invalidotp.isDisplayed();
	}
	
	public Boolean Onboardng_Welcomescreen() {
	return	OnboardingWelcome.isDisplayed();
	}
	
	
	public String please_enter_invalidOTP_text() {
		return invalidotp.getText();
		}
	
	public void TAP_TO_GO() {
		taptogo.click();
	}
	
	public void On_boardingnext01() {
		onboardingnextbutton.click();
	}
	
	
	
	//Referral screen.
	public void Referral_screen_next() {
		Referralscreennext.click();
	}
	
	public Boolean Referralscreen_IsDisplayed() {
	return	referalscreenisdisplayed.isDisplayed();
	}
	
	public void Have_Referral_code() {
		Referalscreenhaveareferral.click();
	}
	
	public void dont_have_referral_code() {
		Idonthaveareferralcode.click();
	}
	
	public Boolean Please_enter_avalid_Referral_code() {
	return pleaseenterreferraltext.isDisplayed();
	}
	
	public void Referralinside_next() {
		Referralinsidenext.click();
	}
	
	
	//DOB Screen.
	public void Clickon_DOB() {
		DOB.click();
	}
	
	public void DOB_1955() {
		DOB1955.click();
	}
	
	public void DOB_1982() {
		DoB1982.click();
	}
	
	public void DOB_Next() {
		DOBNext.click();
	}
	
	
	
	//Gender screen.
	public void Gender_Female() {
		Femaletext.click();
	}
	
	public void Gender_Male() {
		Maletext.click();
	}
	
	public void Gender_NonBinary() {
		nonBinarytext.click();
	}
	
	public void OnBoarding_backbutton() {
		onboardingBackbutton.click();
	}
	
	
	// Location screen.
	public void City_Textfield() {
		CLickonCitytextfiled.sendKeys("Hyd");
	}
	
	public void location_mumbai() {
		loaction_mumbai.click();
	}
	
	public void location_hyderabad() {
		loaction_Hyderabadtext.click();
	}

	public void city_permission() {
		cityscreenpermission.click();
	}
	
	public void Clear_citytext() {
		Clearcityname.click();
	}
	
	
	public void City_Dropdown_click() {
		citydropdownclick.click();
	}
	
	// Notifiaction screen.
	public void notification_yes() {
		notificationyes.click();
	}
	
	public void notification_skip() {
		notificationskip.click();
	}
	
	
	//Coupons screen.
	public void Myntra_coupon() {
		myntracoupons.click();
	}
	
	public void Gruhastree_Coupon() {
		gruhastreecoupons.click();
	}
	
	public void Islevania_Coupon() {
		ISLEVANIAcoupons.click();
	}
	
	public void McDonalds_coupon() {
		McDonaldscoupon.click();
	}
	
	public void Collect_your_coupon() {
		collectyourcoupontext.click();
	}
	
	public Boolean coupons_screen_error_Message() {
	return	couponsscreenerrormesg.isDisplayed();
	}
	
	public void Start_your_Journey() {
		StartyourJourneynext.click();
	}
	
	public Boolean Homescreen_supej() {
	return	Homescreen_supejtext.isDisplayed();
	}
	
	public void Couon_1() {
		coupon1.click();
	}
	
	public void Coupon_2() {
		coupon2.click();
	}
	
	public void Coupon_3() {
		coupon3.click();
	}
	
	public void Coupon_4() {
		coupon4.click();
	}
}
