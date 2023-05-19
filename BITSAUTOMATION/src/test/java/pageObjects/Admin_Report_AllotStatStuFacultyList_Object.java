package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Report_AllotStatStuFacultyList_Object {
	@FindBy(xpath="//a[@id='navbarDropdown']")
	public static WebElement Report;
	
	@FindBy(xpath="//a[@class='dropdown-item active current']")
	public static WebElement AllotStaStuFaculty;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-arrow-circle-o-right')]")
	public static WebElement FilterMenu;
	
	@FindBy(xpath="//a[@href='#batch']")
	public static WebElement ClickBatch;
	
	@FindBy(xpath="//select[@formcontrolname='batchId']")
	public static WebElement SelectBatch;
	
	@FindBy(xpath="//a[@href='#pstype']")
	public static WebElement ClickPS;
	
	@FindBy(xpath="//select[@formcontrolname='pstypeId']")
	public static WebElement SelectPS;
	
	@FindBy(xpath="//a[@href='#semester']")
	public static WebElement ClickSem;
	
	@FindBy(xpath="//select[contains(@formcontrolname,'semesterId')]")
	public static WebElement SelectSem ;
	
	@FindBy(xpath="//a[@href='#studentname']")
	public static WebElement ClickSN;
	
	@FindBy(xpath="//input[@placeholder='Enter the Student Name']")
	public static WebElement EnterSN;
	
	@FindBy(xpath="//a[@href='#campusname']")
	public static WebElement ClickCN;
	
	@FindBy(xpath="//select[contains(@id,'campusName')]")
	public static WebElement SelectCN;
	
	@FindBy(xpath="//a[@href='#discipiline']")
	public static WebElement ClickDis;
	
	@FindBy(xpath="//select[contains(@id,'tag')]")
	public static WebElement  SelectDis;
	
	@FindBy(xpath="//a[@href='#allottedstation']")
	public static WebElement ClickAllotSta ;
	
	@FindBy(xpath="//input[@placeholder='Enter the Station Name']")
	public static WebElement EnterAllotSta ;
	
	@FindBy(xpath="//a[@href='#parentcompany']")
	public static WebElement ClickPC ;
	
	@FindBy(xpath="//select[contains(@id,'parentStationName')]")
	public static WebElement SelectPC;
	
	@FindBy(xpath="//a[@href='#businessdomain']")
	public static WebElement ClickBD ;
	
	@FindBy(xpath="//select[contains(@id,'domainId')]")
	public static WebElement SelectBD;
	
	@FindBy(xpath="//a[@href='#projectdomain']")
	public static WebElement ClickPD ;
	
	@FindBy(xpath="//select[contains(@id,'projectDomainId')]")
	public static WebElement SelectPD;
	
	@FindBy(xpath="//a[@href='#allottedfaculty']")
	public static WebElement ClickAllotFac;
	
	@FindBy(xpath="//select[contains(@id,'facultyName')]")
	public static WebElement SelectAllotFac;
	
	@FindBy(xpath="//button[contains(.,'Filter')]")
	public static WebElement FilterButton;
	
	@FindBy(xpath="//button[contains(.,'Reset')]")
	public static WebElement Reset;
	
	@FindBy(xpath="//button[contains(.,'Export')]")
	public static WebElement Export;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-students-report/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement TableResult;	
}