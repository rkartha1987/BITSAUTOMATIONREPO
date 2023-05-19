package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Report_StudentBioData_Objects { 
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[7]/a")
	public static WebElement Report;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[7]/div/a[9]")
	public static WebElement StudentBioData ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[1]/div/div/div[1]/nav/ol/li[2]")
	public static WebElement StudentBioDataResult;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[1]/i")
	public static WebElement Menu;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/a")
	public static WebElement ClickBatch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/select")
	public static WebElement SelectBatch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div/div[1]/a")
	public static WebElement ClickPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div/div[2]/select")
	public static WebElement SelectPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div/div[1]/a")
	public static WebElement ClickFirstName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterFirstName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[1]/a")
	public static WebElement ClickGender;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[2]/select")
	public static WebElement SelectGender;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div/div[1]/a")
	public static WebElement ClickCGPAGT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div/div[2]/input")
	public static WebElement EnterCGPAGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[7]/div/div/div[1]/a")
	public static WebElement ClickFillDetails;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[7]/div/div/div[2]/select")
	public static WebElement SelectFillDetails;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[2]/div[8]/button[1]")
	public static WebElement ClickFilter;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement Result;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[1]/div/div/div[3]/div/button/i")
	public static WebElement Export;	
}