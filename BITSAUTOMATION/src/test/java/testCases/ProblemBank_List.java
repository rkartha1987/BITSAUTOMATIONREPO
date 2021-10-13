package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;

import pageObjects.Problem_Bank_List_Objects;

public class ProblemBank_List extends CommonFunctions{
	
static Logger logger = Logger.getLogger(ProblemBank_List.class);
	
	@Test(priority = 0)
	public void ProblemBankMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank List Page");
		PageFactory.initElements(driver, Problem_Bank_List_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Problem Bank List");
		Problem_Bank_List_Objects.PBMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ProblemBankList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ProblemBankList.png");
	}
	
	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Problem Bank List");

		Problem_Bank_List_Objects.SortSName.click();
		Thread.sleep(1000);
		Problem_Bank_List_Objects.SortSCity.click();
		Thread.sleep(1000);
		Problem_Bank_List_Objects.SortBDomain.click();
		Thread.sleep(1000);

	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Problem Bank List");

		Problem_Bank_List_Objects.SearchField.sendKeys(getExcelData("PBankList", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  Problem_Bank_List_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Invalid Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Invalid Search Validation Failed");
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);

	}
	
	@Test(priority = 3)
	public void VerifyValidSearchStationName() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Station Name Search in Problem Bank List");
		
		Problem_Bank_List_Objects.SearchSelect.sendKeys(getExcelData("PBankList", 2, 0));
		Thread.sleep(2000);

		Problem_Bank_List_Objects.SearchField.sendKeys(getExcelData("PBankList", 2, 1));
		Thread.sleep(2000);
		
		Problem_Bank_List_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 2, 2));
		Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 2, 4));
		//Thread.sleep(2000);

		String SNameResult = Problem_Bank_List_Objects.SNameResult.getText();
		System.out.println(SNameResult);
		
		
		Thread.sleep(2000);
		if(SNameResult.contentEquals(getExcelData("PBankList", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Station Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Station Name Search Validation Failed");
		}
		Thread.sleep(2000);
		Problem_Bank_List_Objects.SearchField.clear();
	}
	
	@Test(priority = 4)
	public void VerifyStationCity() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying City Search in Problem Bank List");
		Thread.sleep(2000);
		Problem_Bank_List_Objects.SearchSelect.sendKeys(getExcelData("PBankList", 3, 0));
		Thread.sleep(2000);

		Problem_Bank_List_Objects.SearchField.sendKeys(getExcelData("PBankList", 3, 1));
		Thread.sleep(2000);
		
		Problem_Bank_List_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 3, 3));
		Thread.sleep(2000);
		
		Problem_Bank_List_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 3, 2));
		Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 3, 5));
		//Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 3, 4));
		//Thread.sleep(2000);

		String CityResult = Problem_Bank_List_Objects.CityResult.getText();
		System.out.println(CityResult);
		
		Thread.sleep(2000);
		if(CityResult.contentEquals(getExcelData("PBankList", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "City Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "City Search Validation Failed");
		}
		Thread.sleep(2000);
		Problem_Bank_List_Objects.SearchField.clear();
	}

	@Test(priority = 5)
	public void VerifyBusinessDomain() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Business Domain Search in Problem Bank List");
		Thread.sleep(2000);
		Problem_Bank_List_Objects.SearchSelect.sendKeys(getExcelData("PBankList", 4, 0));
		Thread.sleep(2000);

		Problem_Bank_List_Objects.SearchField.sendKeys(getExcelData("PBankList", 4, 1));
		Thread.sleep(2000);
		
		Problem_Bank_List_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 4, 3));
		Thread.sleep(2000);
		
		Problem_Bank_List_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 4, 2));
		Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 4, 5));
		//Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 4, 4));
		//Thread.sleep(2000);

		String BDResult = Problem_Bank_List_Objects.BDResult.getText();
		System.out.println(BDResult);
		
		Thread.sleep(2000);
		if(BDResult.contentEquals(getExcelData("PBankList", 4, 1)))
		{
			extenttestCase.log(Status.PASS, "Business Domain Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Business Domain Search Validation Failed");
		}
		Thread.sleep(2000);
		Problem_Bank_List_Objects.SearchField.clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}