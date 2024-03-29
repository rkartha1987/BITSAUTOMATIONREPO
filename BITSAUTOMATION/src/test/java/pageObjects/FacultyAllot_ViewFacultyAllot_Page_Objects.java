package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacultyAllot_ViewFacultyAllot_Page_Objects {
	

	//-----------Faculty Allotment dropdown list----------------//
	@FindBy(xpath="//a[text()=' Faculty Allotment ']")
	public static WebElement  FacultyAllotment;
	
	@FindBy(xpath="//a[text()='Group Leader Allotment']")
	public static WebElement GroupLeaderAllot_Listval;	

	@FindBy(xpath="//a[text()='Station/Faculty wise Allotment']")
	public static WebElement StationOrFacultyAllot_Listval;
	
	@FindBy(xpath="//a[text()='View Faculty Allotment']")
	public static WebElement ViewFaculty_Listval;

	//--------------View Faculty Allot-------------------

	@FindBy(xpath = "//*[contains(text(),'Assigned Stations to Faculty')]")
	public static WebElement ViewFacAllotPage;		
	
	@FindBy(xpath = "//div/select")
	public static WebElement  BatchYear;
		
	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div/div/select")
	public static WebElement  PStypeSelect;

	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div[2]/div/select")
	public static WebElement  Semester;
	
	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div[3]/div/select")
	public static WebElement  AllotPS2;

	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div[2]//select")
	public static WebElement  AllotPS1;

	@FindBy(xpath="//td[5]")
	public static List<WebElement> AllotStat_Gridval;
	
	@FindBy(xpath="//button[contains(text(),'Publish')]")
	public static WebElement Publish_btn;
	
	@FindBy(xpath="//div[@class='modal-footer']/button[text()='Okay']")
	public static WebElement Okay_alertbtn;
		
	@FindBy(xpath="//div[@class='modal-footer']/button[text()='Close']")
	public static WebElement Close_alertbtn;
	
	 @FindBy(xpath="//div[@id='toast-container']")
	 
	 
	public static WebElement Toaster;
}