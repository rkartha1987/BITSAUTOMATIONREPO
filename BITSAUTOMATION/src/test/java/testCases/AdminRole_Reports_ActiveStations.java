package testCases;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_ActiveStations_Objects;
public class AdminRole_Reports_ActiveStations extends CommonFunctions{

	static Logger logger = Logger.getLogger(Admin_Report_ActiveStations_Objects  .class);

	@Test(priority = 0)
	public void PBReportMenu() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Instruction Cell Role");
		extenttestCase=extentReport.createTest("Verifying Active Stations Report Page");

		logger.info("Verifying Report Page");
		PageFactory.initElements(driver, Admin_Report_ActiveStations_Objects   .class);

		Admin_Report_ActiveStations_Objects .Report.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.ActiveStation.click();
		Thread.sleep(2000);

		String str=Admin_Report_ActiveStations_Objects.ActiveStationResult.getText();
		//System.out.println(str);


		if(str.contains("Active Stations Report"))
		{
			extenttestCase.log(Status.PASS, " Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, " Search Validation Failed");
		}

		driver.navigate().refresh();
		Thread.sleep(2000);

	}	


	@Test(priority =1)
	public void FilterByPSType() throws Throwable
	{

		extenttestCase=extentReport.createTest("Verifying Active Stations Report By PSType Filter Validation ");

		Admin_Report_ActiveStations_Objects.Menu.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.ClickPSType.click();
		Thread.sleep(2000);

		//Select sel=new Select(Admin_Report_ActiveStations_Page_Objects.SelectPSType);
		//sel.selectByIndex(1);

		Admin_Report_ActiveStations_Objects.SelectPSType.sendKeys(getExcelData("PBReport", 3, 1));
		Thread.sleep(2000);

		String PSResult=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(PSResult);
		Thread.sleep(2000);

		//Select sel=new Select(Admin_Report_ActiveStations_Page_Objects.SelectPSType);
		//sel.selectByIndex(2);

		Admin_Report_ActiveStations_Objects.SelectPSType.sendKeys(getExcelData("PBReport", 3, 2));
		Thread.sleep(2000);

		String PSResult1=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(PSResult1);
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.Filter.click();
		Thread.sleep(2000);


		if(PSResult.contentEquals(getExcelData("PBReport", 3, 1)) && PSResult1.contentEquals(getExcelData("PBReport", 3, 2)))
		{
			extenttestCase.log(Status.PASS, " PSPType Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " PSType Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority = 2)
	public void FilterByStationName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Active Stations Report By StationName Filter Validation");

		Admin_Report_ActiveStations_Objects.Menu.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.ClickStationName.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.EnterStationName.sendKeys(getExcelData("PBReport", 4, 1));
		Thread.sleep(2000);

		String StationNameResult=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(StationNameResult);
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.EnterStationName.sendKeys(getExcelData("PBReport", 4, 2));
		Thread.sleep(2000);


		String StationNameResult1=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(StationNameResult1);
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.Filter.click();
		Thread.sleep(2000);

		if(StationNameResult.contentEquals(getExcelData("PBReport", 4, 1)) && StationNameResult1.contentEquals(getExcelData("PBReport", 4, 2)))
		{
			extenttestCase.log(Status.PASS, " StationName Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " StationName Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority = 3)
	public void FilterByLocation() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Active Stations Report By StationName Filter Validation");

		Admin_Report_ActiveStations_Objects.Menu.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.ClickLocation.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.EnterLocation.sendKeys(getExcelData("PBReport", 11,2));
		Thread.sleep(2000);

		String StationNameResult=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(StationNameResult);
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.Filter.click();
		Thread.sleep(2000);

		if(StationNameResult.contentEquals(getExcelData("PBReport",11,2)))
		{
			extenttestCase.log(Status.PASS, " StationName Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " StationName Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority = 4)
	public void FilterByParentCompany() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Active Stations Report by  Parent Company Filter Validation ");

		Admin_Report_ActiveStations_Objects.ClickPC.click();
		Thread.sleep(2000);

		//Select PS=new Select(driver.findElement(By.xpath("/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[2]/select")));
		//PS.selectByVisibleText("Yashoda");

		Admin_Report_ActiveStations_Objects.SelectPC.sendKeys(getExcelData("PBReport",12,2));
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.Filter.click();
		Thread.sleep(2000);

		String PCompanyResult=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(PCompanyResult);

		if(PCompanyResult.contentEquals(getExcelData("PBReport",12,2)))
		{
			extenttestCase.log(Status.PASS, " Filter By Parent Company Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Filter By Parent Company Validation Failed");
		}
	}


	@Test(priority = 5)
	public void FilterByCreateDate() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Active Stations Report by  Create Date Filter Validation ");

		Admin_Report_ActiveStations_Objects.ClickCreateDate.click();
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.EnterCreateDate.sendKeys(getExcelData("PBReport",6,1));
		Thread.sleep(2000);

		Admin_Report_ActiveStations_Objects.Filter.click();
		Thread.sleep(2000);

		String PCompanyResult=Admin_Report_ActiveStations_Objects.Result.getText();
		//System.out.println(PCompanyResult);

		if(PCompanyResult.contentEquals(getExcelData("PBReport",6,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Create Date Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Filter By Create Date Validation Failed");
		}
	}

}