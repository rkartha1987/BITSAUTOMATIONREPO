package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Semester_Allotment_List_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[5]/a")
	public static WebElement SAMenu;

	///////////////// Show More/Less //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[7]/div/button[1]")
	public static WebElement ShowMore;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[7]/div/button[2]")
	public static WebElement ShowLess;


	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/thead/tr/th[3]/em")
	public static WebElement SortSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/thead/tr/th[4]/em")
	public static WebElement SortCampus;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/thead/tr/th[5]/em")
	public static WebElement SortTag;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/thead/tr/th[5]/em")
	public static WebElement SortCGPA;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/thead/tr/th[7]/em")
	public static WebElement SortPreferred;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/thead/tr/th[9]")
	public static WebElement SortOpted;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div/div[1]/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[3]/div/select")
	public static WebElement CampusDropDown;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[6]/div/select")
	public static WebElement SearchGot;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[7]/div/select")
	public static WebElement SearchSem;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[2]/table/tbody/tr/td")
	public static WebElement ListWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div/div[4]/div\r\n")
	public static WebElement DropdownNoRec;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[3]")
	public static WebElement SNameResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[2]/ul/li/div/a\r\n")
	public static WebElement SNameValue;	

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[2]/ul/li/div/a")
	public static WebElement CNameValue;	

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[2]/ul/li[1]/div/a")
	public static WebElement SNameDrop;	

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[2]")
	public static WebElement CIDResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div/div[1]/input")
	public static WebElement CampusResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[2]/ul/li[1]/div/a")
	public static WebElement CampusResultDrop;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-planning-team/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[9]")
	public static WebElement GotResult;
}
