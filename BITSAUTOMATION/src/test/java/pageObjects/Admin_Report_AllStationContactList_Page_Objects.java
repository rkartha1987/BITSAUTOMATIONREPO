package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Report_AllStationContactList_Page_Objects 
{

	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[6]/a")
	public static WebElement Report;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[6]/div/a[6]")
	public static WebElement AllStaConList;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[1]/div/div/div[1]/nav/ol/li[2]")
	public static WebElement AllStaConListResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[1]/i")
	public static WebElement Menu;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/a")
	public static WebElement ClickPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/select")
	public static WebElement SelectPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div/div[1]/a")
	public static WebElement ClickStationName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement  EnterStationName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div/div[1]/a")
	public static WebElement ClickLocation;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterLocation;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[1]/a")
	public static WebElement ClickPCompany ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[2]/select")
	public static WebElement SelectPCompany;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div/div[1]/a")
	public static WebElement ClickContactName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div/div[2]/input")
	public static WebElement EnterContactName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[7]/div/div/div[1]/a")
	public static WebElement ClickContactType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[7]/div/div/div[2]/input")
	public static WebElement EnterContactType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[8]/div/div/div[1]/a")
	public static WebElement ClickAllotCurrentBatch ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[8]/div/div/div[2]/select")
	public static WebElement SelectAllotCurrentBatch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[9]/button[1]")
	public static WebElement Filter;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[1]/div/div/div[3]/div/button")
	public static WebElement Export;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement Result;

}
