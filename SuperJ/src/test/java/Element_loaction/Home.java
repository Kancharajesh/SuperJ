package Element_loaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	
	//Home Screen.
	@FindBy(xpath ="//android.widget.TextView[@text=\"Choose a job and Start Earning\"]")
	private WebElement homescreen_isdisplayed01;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Wallet\"]")
	private WebElement ClickonWallet;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Home\"]")
	private  WebElement Home1;
		
		
	//BUMPER.
	@FindBy(xpath = "//android.widget.TextView[@text=\"Current progress:\"]")
	private WebElement ClickonBumper;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Start Survey\"]")
	private WebElement Start_Survey;
	
	//BUMPER STREAK SURVEY QUESTIONS.
	@FindBy(xpath ="//android.view.ViewGroup")
	private WebElement Bumperstreaka1;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Next\"]/android.view.ViewGroup/android.view.View")
	private WebElement Bumpernext;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"Earn more Rewards!\"]")
	private WebElement earnmorereward;
	
	
	public Home(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	
	//Home Screen.
	public Boolean Homescreen_isdisplayed() {
	return homescreen_isdisplayed01.isDisplayed();
	}
	
		
	public void Wallet() {
		ClickonWallet.click();
	}
	
	
	//BUMPER STREAK.
	
	public void Click_Bumper() {
		ClickonBumper.click();
	}
	
	public void Bumper_Start_Survey() {
		Start_Survey.click();
	}
	
	public void Bumper_Streak_Answer_1() {
		Bumperstreaka1.click();
	}
	
	public void Bumper_Streak_next() {
		Bumpernext.click();
	}
	
	public void Bumper_streak_Earn_more_rewards() {
		earnmorereward.click();
	}
	
}
