package Element_loaction;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestData.properi;
import okhttp3.internal.cache.DiskLruCache.Editor;

public class Profile {
	
	WebDriver driver;
	
	//DID
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement clickonprofile;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement DIDtext; 
	
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"This is your DID\"]")
	private WebElement thisisdid;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement DIDIsdisplayed;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement DID_backbutton;	
	
	//Refer a friend.
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Refer a friend\"]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement clickonreferfriend;
	
	@FindBy(id = "android:id/contentPanel")
	private WebElement Closereferpoup;
	
	
	// My History.
	@FindBy(xpath ="//android.widget.TextView[@text=\"My History\"]")
	private WebElement My_history;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement getthecoupons;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement myhistort_backbutton;
	
	
	//Profile Edit.
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"Edit\"]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement profielpaeedit;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement Profilepageeditbackbuuton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Done\"]")
	private WebElement ProfileeditDone;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
	private WebElement profilepersonalinfo;
	
	@FindBy(xpath ="//android.widget.EditText[@content-desc=\"phone-number-input\" and @text=\"male\"]")
	private WebElement gendermale;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement Personaledit_pincode;
	
	@FindBy(xpath ="(//android.widget.EditText[@content-desc=\"phone-number-input\"])[4]")
	private WebElement personaledit_Email;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Contact us\"]")
	private WebElement edit_contactUs;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Cancel\"]")
	private WebElement edit_contactus_cancel;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Please enter a valid email\"]")
	private WebElement emailerrormessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid pincode\"]")
	private WebElement pincodeerror;
	
	
	
	//Help & support.
	@FindBy(xpath = "//android.widget.TextView[@text=\"Help and Support\"]")
	private WebElement HElp_suport;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Terms & Conditions\"]")
	private WebElement Hep_support_terms;
	
	@FindBy(xpath ="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement help_support_backbutton;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Contact Us\"]")
	private WebElement Helpsupport_contactus;
	
	
	//account status.
	@FindBy(xpath = "//android.widget.TextView[@text=\"Account Status\"]")
	private WebElement Account_status;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Delete Account\"]")
	private WebElement Deleteaccount;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Delete Account\"]")
	private WebElement Deleteaccount_yes;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Cancel\"]")
	private WebElement Delecteaccount_cancel;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement accountstsus_backbutton;  
	
	
	//privacy policy.
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Privacy Policy\"]")
	private WebElement privacypolicy;
	
	@FindBy(xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement privacypolicybackbutton;
	
	//Logout.
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Yes, I'll be back\"]")
	private WebElement Logoutyes;
	
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"Cancel\"]")
	private WebElement logoutcancel;
	
	
	//isdisplayed.
	@FindBy(xpath = "//android.widget.TextView[@text=\"Profile Page\"]")
	private WebElement isprofiepage;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Help & Support\"]")
	private WebElement ishelpsupport;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Account Status\"]")
	private WebElement isaccountstatus;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Privacy Policy\"]")
	private WebElement ispivacypolicy;
	
	
	public Profile (WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public String DID_Text() {
		return DIDtext.getText();
	}
	
	
	public void Click_on_Profile() {
		clickonprofile.click();
	}
	
	//DID
	public void Thisis_DID() {
		thisisdid.click();
	}
	
	public Boolean DID_displayed() {
	return	DIDIsdisplayed.isDisplayed();
	}
	
	
	public void DID_Backbutton() {
		DID_backbutton.click();
	}
	
	
	//Refer a friend.
	public void Refer_friend() {
		clickonreferfriend.click();
	}
	
	public void Refer_Popup_close() {
		Closereferpoup.click();
	}
		
	// My History.
	public void My_History() {
		My_history.click();
	}
	
	public Boolean get_History() {
	return	getthecoupons.isDisplayed();
	}
	
	public String get_histort_gettext() {
	return	getthecoupons.getText();
	}
	
	
	public void MyHistory_Backbutton() {
		myhistort_backbutton.click();
	}
	
	
	//Profile Edit
	public void profile_edit() {
		profielpaeedit.click();
	}
	
	public String Personal_info_gettext() {
	return profilepersonalinfo.getText();
	}
	
	public void Profile_edit_Backbutton() {
		Profilepageeditbackbuuton.click();
	}
	
	public void profile_Edit_Done() {
		ProfileeditDone.click();
	}
	
	public void Personaledit_pincode_clear() {
		Personaledit_pincode.clear();
	}
	
	public void Personaledit_validpincode() {
		Personaledit_pincode.sendKeys("500081");
	}
	
	public void Personaledit_invalidpincode() {
		Personaledit_pincode.sendKeys("5000");
	}
	
	public void Personaledit_Email_clear() {
		personaledit_Email.clear();
	}
	
	public void Personaledit_invalid_Email() {
		personaledit_Email.sendKeys("Superj");
	}
	
	public void Personaledit_valid_Email() {
		personaledit_Email.sendKeys("Superj@mail.com");
	}
	
	public void edit_contactUs() {
		edit_contactUs.click();
	}
	
	public void edit_contactus_cancel() {
		edit_contactus_cancel.click();
	}
	
	public Boolean Email_errormessage() {
	return	emailerrormessage.isDisplayed();
	}
	
	public Boolean Pincode_errormessage() {
		return pincodeerror.isDisplayed();
	}
	
	public String Pincode_error_gettext() {
		return pincodeerror.getText();
	}
	
	
	//HELP & SUPPORT.
	
	public void HELP_Support() {
		HElp_suport.click();
	}
	
	public void Help_support_terms_condition() {
		Hep_support_terms.click();
	}
	
	
	
	public void Help_support_backbutton() {
		help_support_backbutton.click();
	}
	
	
	public void Help_support_contactUs() {
		Helpsupport_contactus.click();
	}
	
	//Account Status.
	public void Account_status() {
		Account_status.click();
	}
	
	public void account_status_backbutton() {
		accountstsus_backbutton.click();
	}
	
	public void Deleteaccount_yes() {
		Deleteaccount_yes.click();
	}
	
	public void Delecte_account_cancel() {
	 Delecteaccount_cancel.click();
	}
	
	//Privacy policy;
	public void privacy_policy() {
	privacypolicy.click();	
	}
	
	private void privacypolicy_Backbutton() {
		privacypolicybackbutton.click();
	}
	
	
	
	//Logout.
	public void logout() {
		logout.click();
	}
	
	public void Logout_Yes() {
		Logoutyes.click();
	}
	
	public void Logout_cancel() {
		logoutcancel.click();
	}

	
	//isDisplayed.
	
	public Boolean account_status_isdisplayed() {
		return	isaccountstatus.isDisplayed();
	}
	
	public Boolean Help_Support_isdisplayed() {
		return ishelpsupport.isDisplayed();
	}
	
	public Boolean profile_page_isdisplayed() {
		return isprofiepage.isDisplayed();
	}
	
	public Boolean privacy_policy_isdisplayed() {
	return	ispivacypolicy.isDisplayed();
	}
	
}

