package testCases;



import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_StudentCourseList_Objects;

public class AdminRole_Report_StudentCourseList extends CommonFunctions{

	static Logger logger = Logger.getLogger(Admin_Report_StudentCourseList_Objects.class);

	@Test(priority = 0)
	public void VerifyStudentCourseListReport() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Instruction Cell Role");
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page");

		logger.info("Verifying Student Course List Report Page");
		PageFactory.initElements(driver, Admin_Report_StudentCourseList_Objects  .class);

		Admin_Report_StudentCourseList_Objects.Report.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.StuCourseList.click();
		Thread.sleep(2000);

		String str=Admin_Report_StudentCourseList_Objects.StuCourseListResult.getText();
		//System.out.println(str);


		if(str.contains("Student Course List Report"))
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
	public void FilterByBatch() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Batch Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.ClickBatch.click();
		Thread.sleep(2000);

		//Select Bat=new Select(driver.findElement(By.xpath("//*[@id=\"batch\"]/select")));
		//Bat.selectByVisibleText("2021-22");

		Admin_Report_StudentCourseList_Objects.SelectBatch.sendKeys(getExcelData("StuCourseList", 1, 1));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String BatchResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(BatchResult);

		if(BatchResult.contentEquals(getExcelData("StuCourseList", 1, 1)))
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

	@Test(priority =2)
	public void FilterByPSType() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By PSType Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);

		//Select PSType=new Select(driver.findElement(By.xpath("//*[@id=\"pstype\"]/select")));
		//PSType.selectByIndex(1);

		Admin_Report_StudentCourseList_Objects.SelectPSType.sendKeys(getExcelData("StuCourseList",2, 1));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.SelectPSType.sendKeys(getExcelData("StuCourseList",2, 2));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String PSTypeResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(PSTypeResult);

		if(PSTypeResult.contentEquals(getExcelData("StuCourseList", 2, 1)) && PSTypeResult.contentEquals(getExcelData("StuCourseList", 2, 2)))
		{
			extenttestCase.log(Status.PASS, " PSType Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " PSType Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority =3)
	public void FilterByRollNum() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Roll Number Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.ClickRollNum.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterRollNum.sendKeys(getExcelData("StuCourseList",3, 1));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterRollNum.sendKeys(getExcelData("StuCourseList",3, 2));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String RollNumResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(RollNumResult);

		if(RollNumResult.contentEquals(getExcelData("StuCourseList", 3, 1)) && RollNumResult.contentEquals(getExcelData("StuCourseList",3, 2)))
		{
			extenttestCase.log(Status.PASS, " Roll Number Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "Roll Number Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority =4)
	public void FilterByStudentName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Student Name Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.ClickStudentName.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterStudentName.sendKeys(getExcelData("StuCourseList",4, 1));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterStudentName.sendKeys(getExcelData("StuCourseList",4,2));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String StuNameResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(StuNameResult);

		if(StuNameResult.contentEquals(getExcelData("StuCourseList", 4, 1)) && StuNameResult.contentEquals(getExcelData("StuCourseList",4, 2)))
		{
			extenttestCase.log(Status.PASS, " Student Name Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "Student Name Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority =5)
	public void FilterByGender() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Gender Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);

		//Select gender=new Select(driver.findElement(By.id("gender")));
		//gender.selectByVisibleText("Male");

		Admin_Report_StudentCourseList_Objects.SelectGender.sendKeys(getExcelData("StuCourseList",5, 1));
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String GenderResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(GenderResult);

		if(GenderResult.contentEquals(getExcelData("StuCourseList",5, 1)))
		{
			extenttestCase.log(Status.PASS, " Gender Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Gender Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority =6)
	public void FilterByMailId() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By BITS Email Id Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickEmail.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterEmail.sendKeys(getExcelData("StuCourseList",6, 1));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterEmail.sendKeys(getExcelData("StuCourseList",6, 2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String EmailResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(EmailResult);

		if(EmailResult.contentEquals(getExcelData("StuCourseList",6, 1)) && EmailResult.contentEquals(getExcelData("StuCourseList",6, 2)) )
		{
			extenttestCase.log(Status.PASS, " Gender Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Gender Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority =7)
	public void FilterBySemester() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Semester Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickSem.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterSem.sendKeys(getExcelData("StuCourseList",7, 2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String SemResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(SemResult);

		if(SemResult.contentEquals(getExcelData("StuCourseList",7,2)))
		{
			extenttestCase.log(Status.PASS, " Semester Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, " Semester Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority =8)
	public void FilterBySubjectCode() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Subject Code Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickSubCode.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterSubCode.sendKeys(getExcelData("StuCourseList",8,1));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterSubCode.sendKeys(getExcelData("StuCourseList",8,2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String SemResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(SemResult);

		if(SemResult.contentEquals(getExcelData("StuCourseList",8,1)) && SemResult.contentEquals(getExcelData("StuCourseList",8,2)))
		{
			extenttestCase.log(Status.PASS, "Subject Code Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "Subject Code Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}


	@Test(priority =9)
	public void FilterByCatalog() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Catalog Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickCatalog.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterCatalog.sendKeys(getExcelData("StuCourseList",9,1));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterCatalog.sendKeys(getExcelData("StuCourseList",9,2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String CatalogResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(CatalogResult);

		if(CatalogResult.contentEquals(getExcelData("StuCourseList",9,1)) && CatalogResult.contentEquals(getExcelData("StuCourseList",9,2)))
		{
			extenttestCase.log(Status.PASS, "Catalog Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "Catalog Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority =10)
	public void FilterByDescription() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Description Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickDes.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterDes.sendKeys(getExcelData("StuCourseList",10,1));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterDes.sendKeys(getExcelData("StuCourseList",10,2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String DesResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(DesResult);

		if(DesResult.contentEquals(getExcelData("StuCourseList",9,1)) && DesResult.contentEquals(getExcelData("StuCourseList",9,2)))
		{
			extenttestCase.log(Status.PASS, "Catalog Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "Catalog Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Test(priority =11)
	public void FilterByGrade() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By Grade Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickGrade.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterGrade.sendKeys(getExcelData("StuCourseList",11,1));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterGrade.sendKeys(getExcelData("StuCourseList",11,2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String GradeResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(GradeResult);

		if(GradeResult.contentEquals(getExcelData("StuCourseList",11,1)) && GradeResult.contentEquals(getExcelData("StuCourseList",11,2)))
		{
			extenttestCase.log(Status.PASS, "Catalog Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "Catalog Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}	

	@Test(priority =12)
	public void FilterByCGPAGT() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By CGPA Greater Than Filter");

		Admin_Report_StudentCourseList_Objects.Menu.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.ClickCGPAGT.click();
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.EnterCGPAGT.sendKeys(getExcelData("StuCourseList",12,1));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		Admin_Report_StudentCourseList_Objects.EnterCGPAGT.sendKeys(getExcelData("StuCourseList",12,2));
		Thread.sleep(2000);	

		Admin_Report_StudentCourseList_Objects.Filter.click();
		Thread.sleep(2000);

		String GradeResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		//System.out.println(GradeResult);

		if(GradeResult.contentEquals(getExcelData("StuCourseList",12,1)) && GradeResult.contentEquals(getExcelData("StuCourseList",12,2)))
		{
			extenttestCase.log(Status.PASS, "CGPA Greater Than Filter Validation Done Successfully");
		}

		else
		{
			extenttestCase.log(Status.INFO, "CGPA Greater Than Filter  Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}		




}
