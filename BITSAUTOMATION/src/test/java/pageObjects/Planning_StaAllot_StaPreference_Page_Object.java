package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Planning_StaAllot_StaPreference_Page_Object {

	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[4]/a")
	public static WebElement StaAllot;
	
	//////////////////////////////////StaPreference///////////////////////////////////
	
	@FindBy(xpath="//a[text()='Station Preference']")
	public static WebElement StaPrefe;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[1]/div/div/div/h2")
    public static WebElement StaPrefeResult;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/div[1]/div[1]/div/input")
	public static WebElement StartDate;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/div[1]/div[2]/div/input")
	public static WebElement EndDate;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/div[1]/div[3]/div/select")
	public static WebElement Batch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/div[1]/div[4]/div/select")
	public static WebElement PSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/div[2]/div/button[2]")
    public static WebElement Release;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/app-alert-message/div/div/div/div[3]/button[1]")
	 public static WebElement Cancelclick;
			
    @FindBy(xpath="/html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/app-alert-message/div/div/div/div[3]/button[2]")
    public static WebElement Okclick;
    
    @FindBy(xpath=" /html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[1]/a/em")
    public static WebElement Edit;
    
    @FindBy(xpath=" /html/body/app-root/app-layout/app-station-preference-release/div/div[2]/div/div/div[1]/div[2]/div/button[2]")
    public static WebElement UpdateRelease;
    
    
    @FindBy(xpath=" //*[@id=\"modal\"]/div/div/div[3]/button[1]")
    public static WebElement UpdateClose;
    
    @FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
    public static WebElement UpdateOK;
    
}