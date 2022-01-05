package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Report_AllotStaDetails_Object 
{
	
	@FindBy(xpath="//a[@href='#'][contains(.,'Reports')]")
	public static WebElement Report ;
	
	@FindBy(xpath="//a[@href='/report/allotedstation']")
	public static WebElement AllottStationDetails;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-arrow-circle-o-right')]")
	public static WebElement FilterMenu;
	
	@FindBy(xpath="//a[@href='#batch']")
	public static WebElement ClickBatch;
	
	@FindBy(xpath="//select[@formcontrolname='batchId']")
	public static WebElement SelectBatch;
	
	@FindBy(xpath="//a[@href='#pstype']")
	public static WebElement ClickPS ;
	
	@FindBy(xpath="//select[@formcontrolname='pstypeId']")
	public static WebElement SelectPS;
	
	@FindBy(xpath="//a[@href='#semester']")
	public static WebElement ClickSem;
	
	@FindBy(xpath="//select[@id='semesterId']")
	public static WebElement SelectSem;
	
	@FindBy(xpath="//a[@href='#stationName']")
	public static WebElement ClickSN;
	
	@FindBy(xpath="//input[contains(@autocomplete,'off')]")
	public static WebElement EnterSN;
	
	@FindBy(xpath="//a[@href='#parentStationName']")
	public static WebElement ClickPC;
	
	@FindBy(xpath="//a[@href='#parentStationName']")
	public static WebElement SelectPC ;
	
	@FindBy(xpath="//a[@href='#industryDomain']")
	public static WebElement ClickBD;
	
	@FindBy(xpath="//select[contains(@id,'industryDomain')]")
	public static WebElement SelectBD ;
	
	@FindBy(xpath="//a[@href='#totalStudentsAllotedGreaterThan']")
	public static WebElement ClickTotalStuAllotGT ;
	
	@FindBy(xpath="//input[contains(@id,'totalStudentsAllotedGreaterThan')]")
	public static WebElement EnterTotalStuAllotGT;
	
	@FindBy(xpath="//a[@href='#totalStudentsAllotedLesserThan']")
	public static WebElement ClickTotalStuAllotLT ;
	
	@FindBy(xpath="//input[contains(@id,'totalStudentsAllotedLesserThan')]")
	public static WebElement EnterTotalStuAllotLT ;
	
	@FindBy(xpath="//a[@href='#totalHigherDegreeStudentsAllotedGreaterThan']")
	public static WebElement ClickTHDStuAllotGT;;
	
	@FindBy(xpath="//input[contains(@id,'totalHigherDegreeStudentsAllotedGreaterThan')]")
	public static WebElement EnterTHDStuAllotGT;
	
	@FindBy(xpath="//a[@href='#totalHigherDegreeStudentsAllotedLesserThan']")
	public static WebElement ClickTHDStuAllotLT ;
	
	@FindBy(xpath="//input[contains(@id,'totalHigherDegreeStudentsAllotedLesserThan')]")
	public static WebElement EnterTHDStuAllotLT;
	
	@FindBy(xpath="//a[@href='#totalFirstDegreeStudentsAllotedGreaterThan']")
	public static WebElement ClickTFDStuAllotGT;
	
	@FindBy(xpath="//input[contains(@id,'totalFirstDegreeStudentsAllotedGreaterThan')]")
	public static WebElement EnterTFDStuAllotGT ;
	
	@FindBy(xpath="//a[@href='#totalFirstDegreeStudentsAllotedLesserThan']")
	public static WebElement ClickTFDStuAllotLT  ;
	
	@FindBy(xpath="//input[contains(@id,'totalFirstDegreeStudentsAllotedLesserThan')]")
	public static WebElement EnterTFDStuAllotLT;
	
	@FindBy(xpath="//a[@href='#totalDualDegreeStudentsAllotedGreaterThan']")
	public static WebElement ClickTDDStuAllotGT;
	
	@FindBy(xpath="//input[contains(@id,'totalDualDegreeStudentsAllotedGreaterThan')]")
	public static WebElement EnterTDDStuAllotGT ;
	
	@FindBy(xpath="//a[@href='#totalDualDegreeStudentsAllotedLesserThan']")
	public static WebElement ClickTDDStuAllotLT;
	
	@FindBy(xpath="//input[contains(@id,'totalDualDegreeStudentsAllotedLesserThan')]")
	public static WebElement EnterTDDStuAllotLT;
	
	@FindBy(xpath="//a[@href='#maxCGPAGreaterThan']")
	public static WebElement ClickMaxCGPAGT;
	
	@FindBy(xpath="//input[contains(@id,'maxCGPAGreaterThan')]")
	public static WebElement EnterMaxCGPAGT;
	
	@FindBy(xpath="//a[@href='#maxCGPALesserThan']")
	public static WebElement ClickMaxCGPALT;
	
	@FindBy(xpath="//input[@id='maxCGPALesserThan']")
	public static WebElement EnterMaxCGPALT;
	
	@FindBy(xpath="//a[@href='#minCGPAGreaterThan']")
	public static WebElement ClickMinCGPAGT ;
	
	@FindBy(xpath="//input[@id='minCGPAGreaterThan']")
	public static WebElement EnterMinCGPAGT;
	
	@FindBy(xpath="//a[@href='#minCGPALesserThan']")
	public static WebElement ClickMinCGPALT;
	
	@FindBy(xpath="//input[contains(@id,'minCGPALesserThan')]")
	public static WebElement EnterMinCGPALT;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-add mr-4')]")
	public static WebElement ClickFilter;
	
	@FindBy(xpath="//button[@class='btn btn-add']")
	public static WebElement ClickReset;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-alloted-station/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement TableResult;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-export')]")
	public static WebElement ClickExport;
	}