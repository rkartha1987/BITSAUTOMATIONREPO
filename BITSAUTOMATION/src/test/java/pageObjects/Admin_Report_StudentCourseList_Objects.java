package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Report_StudentCourseList_Objects {
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[6]/a ")
	public static WebElement Report ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[6]/div/a[8]")
	public static WebElement StuCourseList;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[1]/div/div/div[1]/nav/ol/li[2] ")
	public static WebElement StuCourseListResult;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[1]/i")
	public static WebElement Menu;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/a")
	public static WebElement ClickBatch;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/select")
	public static WebElement SelectBatch ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/select")
	public static WebElement ClickPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div/div[2]/select")
	public static WebElement SelectPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div/div[1]/a")
	public static WebElement ClickRollNum;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterRollNum;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[1]/a")
	public static WebElement ClickStudentName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterStudentName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div/div[1]/a")
	public static WebElement ClickGender;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div/div[2]/select")
	public static WebElement SelectGender;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[7]/div/div/div[1]/a ")
	public static WebElement ClickEmail;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[7]/div/div/div[2]/input")
	public static WebElement EnterEmail;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[8]/div/div/div[1]/a")
	public static WebElement ClickSem;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[8]/div/div/div[2]/input ")
	public static WebElement EnterSem ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[9]/div/div/div[1]/a ")
	public static WebElement ClickSubCode;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[9]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input ")
	public static WebElement EnterSubCode;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[10]/div/div/div[1]/a ")
	public static WebElement ClickCatalog;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[10]/div/div/div[2]/input")
	public static WebElement EnterCatalog;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[11]/div/div/div[1]/a")
	public static WebElement ClickDes  ;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[11]/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement EnterDes ;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[12]/div/div/div[1]/a")
	public static WebElement ClickGrade ;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[12]/div/div/div[2]/input")
	public static WebElement EnterGrade;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[13]/div/div/div[1]/a ")
	public static WebElement ClickCGPAGT;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[13]/div/div/div[2]/input")
	public static WebElement EnterCGPAGT;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[2]/div[14]/button[1]")
	public static WebElement Filter;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-list/div/div[2]/div/div/div[2]/div/div[3]/table ")
	public static WebElement Result;
	
	@FindBy(xpath=" /html/body/app-root/app-layout/app-student-course-list/div/div[1]/div/div/div[3]/div/button")
	public static WebElement Export;
}
