package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class Admin_Report_ProblemBankDetails_Object 
{

	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[7]/a")
	public static WebElement Report;
	
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[7]/div/a[4]")
	public static WebElement PBDetails;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[1]/div/div/div[1]/nav/ol/li[2]")
	public static WebElement PBMenu;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[1]/i")
	public static WebElement FilterMenu;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/a")
	public static WebElement ClickBatch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/select")
	public static WebElement SelectBatch ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[1]/a")
	public static WebElement ClickPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/select")
	public static WebElement SelectPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div/div/div[1]/a")
	public static WebElement ClickStationName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterStatioName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[5]/div/div/div[1]/a")
	public static WebElement ClickBDomain;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[5]/div/div/div[2]/select")
	public static WebElement SelectBDomain;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[6]/div/div/div[1]/a")
	public static WebElement ClickCreateDate;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[6]/div/div/div[2]/input")
	public static WebElement EnterCreateDate;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div/div/div[1]/a")
	public static WebElement ClickTPGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div/div/div[2]/input")
	public static WebElement EnterTPGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[8]/div/div/div[1]/a")
	public static WebElement ClickSGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[8]/div/div/div[2]/input")
	public static WebElement EnterSGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[9]/div/div/div[1]/a")
	public static WebElement ClickMinCGPAGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[9]/div/div/div[2]/input")
	public static WebElement EnterMinCGPAGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[10]/div/div/div[1]/a")
	public static WebElement ClickMaxCGPAGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[10]/div/div/div[2]/input")
	public static WebElement EnterMaxCGPAGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[11]/div/div/div[1]/a")
	public static WebElement ClickTag;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[11]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterTag;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[12]/div/div/div[1]/a")
	public static WebElement ClickUGSGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[12]/div/div/div[2]/input")
	public static WebElement EnterUGSGT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[13]/div/div/div[1]/a")
	public static WebElement ClickPGSGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[13]/div/div/div[2]/input")
	public static WebElement EnterPGSGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[14]/div/div/div[1]/a")
	public static WebElement ClickPLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[14]/div/div/div[2]/input")
	public static WebElement EnterPLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[15]/div/div/div[1]/a")
	public static WebElement ClickSLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[16]/div/div/div[1]/a")
	public static WebElement ClickMinCGPALT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[16]/div/div/div[2]/input")
	public static WebElement EnterMinCGPALT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[17]/div/div/div[1]/a")
	public static WebElement ClickMaxCGPALT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[17]/div/div/div[2]/input")
	public static WebElement EnterMaxCGPALT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[18]/div/div/div[1]/a")
	public static WebElement ClickUGSLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[18]/div/div/div[2]/input")
	public static WebElement EnterUGSLT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[19]/div/div/div[1]/a")
	public static WebElement ClickPGSLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[19]/div/div/div[2]/input")
	public static WebElement EnterPGSLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[20]/button[1]")
	public static WebElement Filter;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[20]/button[2]")
	public static WebElement Reset ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement Result;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div/div/div[1]/a")
	public static WebElement ClickSem;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problembank-details/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div/div/div[2]/select")
	public static WebElement SelectSem;
		
}
