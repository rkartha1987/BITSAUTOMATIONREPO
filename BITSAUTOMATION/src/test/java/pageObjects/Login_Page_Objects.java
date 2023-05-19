package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Objects {
	
	@FindBy(id="userId")
	public static WebElement UserId;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/form/div/div/div/div/button")               
	public static WebElement SignIn;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/form/div/div/div/div/div[4]/lablel")
	public static WebElement LoginWarn;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/form/div/div/div/div/div[2]/div/div[2]/div")
	public static WebElement UserIdRqd;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/form/div/div/div/div/div[3]/div/div[2]/div")
	public static WebElement PasswordRqd;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-header/nav/div/div/div[2]/ul/li[2]/div/div/a/span")
	public static WebElement WelcomeMsg;
}
