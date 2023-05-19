package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Suggest_Station_List_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")
	public static WebElement StationMenu;
	
	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[2]/em")
	public static WebElement SortSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[3]/em")
	public static WebElement SortCity;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortBD;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortPC;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[6]/em")
	public static WebElement SortPSType;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement SearchField;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div/ng-autocomplete/div[1]/div[2]/ul/li/div/a")
	public static WebElement FilteredSearch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td")
	public static WebElement ListWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[3]/div/select")
	public static WebElement SelectStatus;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[4]/div/select")
	public static WebElement SearchPSType;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[2]")
	public static WebElement StationResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[4]")
	public static WebElement BDomainResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]")
	public static WebElement PCompanyResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[7]")
	public static WebElement StatusResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[6]")
	public static WebElement PSTypeResult;

	////////////////////////////// Delete Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[1]/div/input")
	public static WebElement Checkbox;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[2]/div/div[1]/div/a")
	public static WebElement ActionClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[2]/div/div[1]/div/div/a")
	public static WebElement Deleteclick;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;
	
   ////////////////////////////// Delete Record //////////////////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-header/nav/div/div/div[2]/ul/li[2]/div/div/a")
	public static WebElement ProfileClick;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-header/nav/div/div/div[2]/ul/li[2]/div/div/div/a")
	public static WebElement SignOutClick;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[1]/div/div/div[2]/div/button")
	public static WebElement AddStation;

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[1]/div/div/div[2]/button[1]")    
	public static WebElement AddStation1;

	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[2]/div/form/div/div[3]/div/div/button[3]")
	public static WebElement Submitbtn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[2]/div/form/div/div[3]/div/div/button[3]")
	public static WebElement Submitbtn1;

}
