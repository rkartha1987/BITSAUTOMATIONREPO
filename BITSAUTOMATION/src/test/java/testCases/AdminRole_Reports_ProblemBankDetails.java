package testCases;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_ProblemBankDetails_Object;

public class AdminRole_Reports_ProblemBankDetails extends CommonFunctions{

	static Logger logger = Logger.getLogger(Admin_Report_ProblemBankDetails_Object.class);

	@Test(priority = 0)
	public void PBReportMenu() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Instruction Cell Role");
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report Page");

		logger.info("Verifying Problem Bank Report Page");
		PageFactory.initElements(driver, Admin_Report_ProblemBankDetails_Object.class);

		Admin_Report_ProblemBankDetails_Object .Report.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.PBDetails.click();
		Thread.sleep(2000);

		String str=Admin_Report_ProblemBankDetails_Object.PBMenu.getText();
		System.out.println(str);
		captureScreen("PB report.png");

		if(str.contains("Problem Bank Report"))
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


	@Test(priority = 1)
	public void FilterByBatch() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Batch Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickBatch.click();
		Thread.sleep(2000);

		//Select sel=new Select(Admin_Report_ProblemBankDetails_Object.SelectBatch);
		//sel.selectByVisibleText("2021-22");


		Admin_Report_ProblemBankDetails_Object.SelectBatch.sendKeys(getExcelData("PBReport", 2, 1));
		Thread.sleep(2000);

		String BatchResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(BatchResult);
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);

		if(BatchResult.contentEquals(getExcelData("PBReport", 2, 1)))
		{
			extenttestCase.log(Status.PASS, " Batch Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Batch Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void FilterByPSType() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By PSTypeFilter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickPSType.click();
		Thread.sleep(2000);

		//Select sel=new Select(Admin_Report_ProblemBankDetails_Object.SelectPSType);
		//sel.selectByIndex(1);

		Admin_Report_ProblemBankDetails_Object.SelectPSType.sendKeys(getExcelData("PBReport", 3, 1));
		Thread.sleep(2000);

		String PSResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(PSResult);
		Thread.sleep(2000);

		//Select sel=new Select(Admin_Report_ProblemBankDetails_Object.SelectPSType);
		//sel.selectByIndex(2);

		Admin_Report_ProblemBankDetails_Object.SelectPSType.sendKeys(getExcelData("PBReport", 3, 2));
		Thread.sleep(2000);

		String PSResult1=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(PSResult1);
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
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

	@Test(priority = 3)
	public void FilterByStationName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By StationName Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickStationName.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterStatioName.sendKeys(getExcelData("PBReport", 4, 1));
		Thread.sleep(2000);

		String StationNameResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(StationNameResult);
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterStatioName.sendKeys(getExcelData("PBReport", 4, 2));
		Thread.sleep(2000);


		String StationNameResult1=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(StationNameResult1);
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
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



	@Test(priority = 4)
	public void FilterByBusinessDomain() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By BusinessDomain Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickBDomain.click();
		Thread.sleep(2000);

		//Select Sel=new Select(Admin_Report_ProblemBankDetails_Object.SelectBDomain);
		//Sel.selectByVisibleText("IT");

		Admin_Report_ProblemBankDetails_Object.SelectBDomain.sendKeys(getExcelData("PBReport", 5, 1));
		Thread.sleep(2000);

		String BDResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(BDResult);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);

		if(BDResult.contentEquals(getExcelData("PBReport", 5, 1)))
		{
			extenttestCase.log(Status.PASS, " BusinessDomain Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " BusinessDomain Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void FilterByCreatedDate() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Created Date Filter");

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickCreateDate.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterCreateDate.sendKeys(getExcelData("PBReport", 6, 1));
		Thread.sleep(2000);

		String CDResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(CDResult);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);

		if(CDResult.contentEquals(getExcelData("PBReport", 6, 1)))
		{
			extenttestCase.log(Status.PASS, " Create Date Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Create Date Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void FilterByTotalProjGT() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Total Project Greater Than Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickTPGT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterTPGT.sendKeys(getExcelData("PBReport", 7, 1));
		Thread.sleep(2000);

		String PGTResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(PGTResult);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);

		if(PGTResult.contentEquals(getExcelData("PBReport", 7, 1)))
		{
			extenttestCase.log(Status.PASS, " Total Project Greater Than Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Total Project Greater Than Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void FilterByTotalRequiredStudentsGreaterThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Total Required Students Greater Than Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickSGT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterSGT.sendKeys(getExcelData("PBReport", 8, 1));
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);

		String SGTTResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(SGTTResult);

		if(SGTTResult.contentEquals(getExcelData("PBReport", 8, 1)))
		{
			extenttestCase.log(Status.PASS, " Total Required Students Greater Than Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Total Required Students Greater Than Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}


	@Test(priority = 8)
	public void FilterByMinCGPAGT() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Minimum CGPA Greater Than Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickMinCGPAGT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterMinCGPAGT.sendKeys(getExcelData("PBReport", 9, 1));
		Thread.sleep(2000);

		String MinCGPAResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(MinCGPAResult);

		if(MinCGPAResult.contentEquals(getExcelData("PBReport",9, 1)))
		{
			extenttestCase.log(Status.PASS, " Minimum CGPA Greater Than Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Minimum CGPA Greater Than Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void FilterByTag() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Tag Name Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickTag.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterTag.sendKeys(getExcelData("PBReport",22, 1));
		Thread.sleep(2000);

		String TagResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(TagResult);

		if(TagResult.contentEquals(getExcelData("PBReport",22, 1)))
		{
			extenttestCase.log(Status.PASS, " Tag Name  Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Tag Name  Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}


	@Test(priority = 10)
	public void FilterByUGStipend() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By UG Stipend Greater and Lesser than Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickUGSGT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterUGSGT.sendKeys(getExcelData("PBReport",18, 1));
		Thread.sleep(2000);

		String UGSGTResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(UGSGTResult);


		Admin_Report_ProblemBankDetails_Object.ClickUGSLT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterUGSLT.sendKeys(getExcelData("PBReport",19, 1));
		Thread.sleep(2000);


		String UGSLTResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(UGSLTResult);

		if(UGSGTResult.contentEquals(getExcelData("PBReport",18, 1)) &&  UGSLTResult.contentEquals(getExcelData("PBReport",19, 1)))
		{
			extenttestCase.log(Status.PASS, " UG Stipend Greater and Lesser than  Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " UG Stipend Greater and Lesser than Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}


	@Test(priority = 11)
	public void FilterByPGStipend() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By PG Stipend Greater and Lesser than Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickPGSGT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterPGSGT.sendKeys(getExcelData("PBReport",18,2));
		Thread.sleep(2000);

		String PGSGTResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(PGSGTResult);


		Admin_Report_ProblemBankDetails_Object.ClickPGSLT.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.EnterPGSLT.sendKeys(getExcelData("PBReport",19,2));
		Thread.sleep(2000);


		String PGSLTResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(PGSLTResult);

		if(PGSGTResult.contentEquals(getExcelData("PBReport",18, 2)) &&  PGSLTResult.contentEquals(getExcelData("PBReport",19,2)))
		{
			extenttestCase.log(Status.PASS, " PG Stipend Greater and Lesser than  Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " PG Stipend Greater and Lesser than  Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}


	@Test(priority = 12)
	public void FilterBySemester() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank Report By Semester Filter");

		Admin_Report_ProblemBankDetails_Object.FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.ClickSem.click();
		Thread.sleep(2000);

		//Select Sel=new Select(Admin_Report_ProblemBankDetails_Object.SelectSem);
		//Sel.selectByIndex(1);

		Admin_Report_ProblemBankDetails_Object.SelectSem.sendKeys(getExcelData("PBReport", 23, 1));
		Thread.sleep(2000);

		String SemResult=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(SemResult);
		Thread.sleep(2000);


		//Select Sel=new Select(Admin_Report_ProblemBankDetails_Object.SelectSem);
		//Sel.selectByIndex(2);

		Admin_Report_ProblemBankDetails_Object.SelectPSType.sendKeys(getExcelData("PBReport", 23, 2));
		Thread.sleep(2000);

		String SemResult1=Admin_Report_ProblemBankDetails_Object.Result.getText();
		System.out.println(SemResult1);
		Thread.sleep(2000);

		Admin_Report_ProblemBankDetails_Object.Filter.click();
		Thread.sleep(2000);


		if(SemResult.contentEquals(getExcelData("PBReport", 23, 1)) && SemResult1.contentEquals(getExcelData("PBReport", 23, 2)))
		{
			extenttestCase.log(Status.PASS, "Semester Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Semester Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

}