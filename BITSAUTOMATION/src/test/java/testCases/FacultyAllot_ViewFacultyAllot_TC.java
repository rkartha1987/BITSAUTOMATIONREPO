package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import CommonFunctions.CommonFunctions;
import pageObjects.FacultyAllot_ViewFacultyAllot_Page_Objects;
public class FacultyAllot_ViewFacultyAllot_TC extends CommonFunctions{

	static Logger logger = Logger.getLogger(FacultyAllot_ViewFacultyAllot_TC.class);

	//function to select Batch
	public void SelectDropdownValue(WebElement Bat,String sheetname, int row, int col) throws Throwable {

		Select Batch = new Select(Bat);
		String BatchYr = null; 
		try {
			BatchYr = getExcelData(sheetname, row, col);
		} catch (Throwable e) {

			e.printStackTrace();
		}
		Batch.selectByVisibleText(BatchYr);	
		captureScreen("SelectDropdownValue.png");
		extenttestCase.log(Status.INFO,"Selected the Batch name");			
	}

	@Test(priority = 0)
	public void VerifyGroupLeaderAllotPage() throws Throwable {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying View Faculty Allotment Page");
		PageFactory.initElements(driver, FacultyAllot_ViewFacultyAllot_Page_Objects.class);

		FacultyAllot_ViewFacultyAllot_Page_Objects.FacultyAllotment.click();
		extenttestCase.log(Status.INFO,"Clicked on Faculty Allotment in Menu");
		captureScreen("FacultyAllotment.png");
		FacultyAllot_ViewFacultyAllot_Page_Objects.ViewFaculty_Listval.click();
		extenttestCase.log(Status.INFO,"Clicked on View Faculty Allotment");
		captureScreen("ViewFaculty_Listval.png");
		//FacultyAllot_GroupLeader_Allotment_Objects.StationOrFacultyAllot_Listval.click();//element to chech fail 

		String GrpLeadpage=FacultyAllot_ViewFacultyAllot_Page_Objects.ViewFacAllotPage.getText();

		if(GrpLeadpage.contains("Assigned Stations to Faculty")) {
			extenttestCase.log(Status.PASS, "User successfully navigated to View Faculty Page");
		}		
		else
		{
			extenttestCase.log(Status.FAIL, "User is not navigated to View Faculty Page");
		}
	}

	@Test(priority = 1)
	public void FetchingAllotedFacultyDetails() throws Throwable {

		SelectDropdownValue(FacultyAllot_ViewFacultyAllot_Page_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 1);
		SelectDropdownValue(FacultyAllot_ViewFacultyAllot_Page_Objects.PStypeSelect, "FacultyGroupLeaderData" , 7, 1);
		SelectDropdownValue(FacultyAllot_ViewFacultyAllot_Page_Objects.AllotPS1, "FacultyGroupLeaderData" , 11, 1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		captureScreen("FetchingAllotedFacultyDetails.png");
		List<WebElement> li=FacultyAllot_ViewFacultyAllot_Page_Objects.AllotStat_Gridval;

		for(WebElement ele:li) {
			String elem=ele.getText().trim();
			String al="Allotted";
			if(elem.contains(al)) {
			}
			else
			{
				extenttestCase.log(Status.FAIL, "User is not navigated to View Faculty Page");
				System.out.println("alloted records not fetched");
				break;
			}
		}	
		extenttestCase.log(Status.PASS, "Not Alloted records are fetched");
		System.out.println("Alloted records are fetched");
	}

	@Test(enabled =false)
	public void FetchingNotAllotedFacultyDetails() throws Throwable {

		SelectDropdownValue(FacultyAllot_ViewFacultyAllot_Page_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 1);
		SelectDropdownValue(FacultyAllot_ViewFacultyAllot_Page_Objects.PStypeSelect, "FacultyGroupLeaderData" , 7, 1);
		SelectDropdownValue(FacultyAllot_ViewFacultyAllot_Page_Objects.AllotPS1, "FacultyGroupLeaderData" , 15, 1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		captureScreen("FetchingNotAllotedFacultyDetails.png");
		List<WebElement> li=FacultyAllot_ViewFacultyAllot_Page_Objects.AllotStat_Gridval;

		for(WebElement ele:li) {
			String elem=ele.getText().trim();
			String al="Not Allotted";
			if(elem.contains(al)) { 
			}
			else
			{
				extenttestCase.log(Status.FAIL, "other records are fetched");
				System.out.println("other records are fetched");
				break;
			}
		}	
		extenttestCase.log(Status.PASS, "Not Alloted records are fetched");		
	}

	@Test(dependsOnMethods = "FetchingAllotedFacultyDetails")
	public void PublishAllotedFacultyDetails() throws Throwable {

		FacultyAllot_ViewFacultyAllot_Page_Objects.Publish_btn.click();
		captureScreen("Publish_btn.png");
		FacultyAllot_ViewFacultyAllot_Page_Objects.Okay_alertbtn.click();
		captureScreen("Okay_alertbtn.png");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		String toast=wait.until(ExpectedConditions.elementToBeClickable(FacultyAllot_ViewFacultyAllot_Page_Objects.Toaster)).getText();
		if(toast.contains("Faculty allotment published successfully")) { 
			extenttestCase.log(Status.PASS, "Records are Published");	
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Records are not Published");	
			System.out.println(" records are not publised");
		}
	}
}