package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import testCases.Login;
import pageObjects.Dashboard_Common_Objects;
import pageObjects.Login_Page_Objects;
public class AdminRole_Dashboard extends CommonFunctions {

	static Logger logger = Logger.getLogger(Dashboard_Common_Objects.class);

	@Test(priority = 0)
	public void AdminPageLanding() throws InterruptedException, IOException, Throwable
	{
		Login.AdminLogin();
		
		extenttestCase=extentReport.createTest("Verifying Admin's Dashboard Page");
		Thread.sleep(2000);

		PageFactory.initElements(driver, Dashboard_Common_Objects.class);
		Dashboard_Common_Objects.Home.click();
		extenttestCase.log(Status.INFO,"Landed in Admin's Dashboard Page");
		Thread.sleep(2000);

		captureScreen("Admin - Dashboard.png");		
	}

	@Test(priority = 1)
	public void VerifyDashboardpage() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Admin's Dashboard");
		Thread.sleep(2000);

		String LableName=Dashboard_Common_Objects.Dashboard.getText();
		String WelcomeMsg=Dashboard_Common_Objects.WelcomeMsg.getText();
		//System.out.println("Results: ");
		//System.out.println(LableName + ','+ WelcomeMsg);
		Thread.sleep(2000);

		if (LableName.equals("Station Allotment Details") && WelcomeMsg.equals("Welcome Sandeep"))
		{
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}  	
	}

	@Test(priority = 2)
	public void VerifyPracticeSchool () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Practice School Details");
		Thread.sleep(2000);

		String PStype=Dashboard_Common_Objects.PSType.getText();
		
		Thread.sleep(2000);

		if (PStype.contentEquals(getExcelData("AdminDash",1,1)))
		{
			//System.out.println("2");
			//System.out.println(getExcelData("AdminDash",1,1).toString());
			extenttestCase.log(Status.PASS, "Practice School Validation Done Successfully");
		}
		else
		{
			System.out.println("PS Type Fail");
			extenttestCase.log(Status.FAIL, PStype + " Validation Failed");
		}	      	
	}

	@Test(priority = 3)
	public void VerifySemester () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Semester Details Of Students");
		Thread.sleep(2000);

		String Semtype=Dashboard_Common_Objects.Semester.getText();
		System.out.println("Sem Type = "+ Semtype);
		Thread.sleep(2000);

		if (Semtype.contentEquals(getExcelData("AdminDash",2,1)))
		{
			//System.out.println("3");
			extenttestCase.log(Status.PASS, " Semester Validation Done Successfully");
		}
		else
		{
			System.out.println("Sem Type Fail");
			extenttestCase.log(Status.FAIL, Semtype+ " Validation Failed: " + getExcelData("AdminDash",2,1).toString());
		}	
	}

	@Test(priority = 4)
	public void VerifyCurrentBatch () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Current Batch Details Of Students");
		Thread.sleep(2000);

		String Batchtype=Dashboard_Common_Objects.Currentbatch.getText();
		System.out.println("Currnt Batch = "+ Batchtype);
		Thread.sleep(2000);

		if (Batchtype.contentEquals(getExcelData("AdminDash",3,1)))
		{
			//System.out.println("4");
			extenttestCase.log(Status.PASS, "Batch Validation Done Successfully");
		}
		else
		{
			System.out.println("Batch Type Fail");
			extenttestCase.log(Status.FAIL, Batchtype+ " Validation Failed" +getExcelData("AdminDash",3,1).toString() );
		} 	
	}

	@Test(priority = 5)
	public void VerifyTotalStudents () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Total No.Of Students");
		Thread.sleep(2000);

		String TotalCount=Dashboard_Common_Objects.TotalStudentcount.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",4,1));
		System.out.println(TotalCount.trim()+","+counter.trim());
		Thread.sleep(2000);

		if (TotalCount.trim().contentEquals(counter.trim()))
		{
			//System.out.println("5");
			extenttestCase.log(Status.PASS, " Validation Done Successfully ");
		}
		else
		{
			System.out.println("Total Students Fail");
			extenttestCase.log(Status.FAIL, "Validation Failed");
		}	
	}

	@Test(priority = 6)
	public void VerifyAllottedStudents () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted Students");
		Thread.sleep(2000);

		String AllottedStud=Dashboard_Common_Objects.AllottedStudent.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",5,1));
		//System.out.println(AllottedStud);
		System.out.println(AllottedStud.trim()+","+counter.trim());
		Thread.sleep(2000);

		if (AllottedStud.contentEquals(counter))
		{
			//System.out.println("6");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			System.out.println("Allotted Students Fail");
			extenttestCase.log(Status.FAIL, AllottedStud+ " Validation Failed: "+counter);
		}	
	}

	@Test(priority = 7)
	public void VerifyAllottedOrganizations () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted Organizations");
		Thread.sleep(2000);

		String AllottedOrgCount=Dashboard_Common_Objects.AllottedOrgcount.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",6,1));
		//System.out.println(AllottedOrgCount);
		Thread.sleep(2000);

		if (AllottedOrgCount.contentEquals(counter))
		{
			//System.out.println("7");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			System.out.println("Allotted Org Fail");
			extenttestCase.log(Status.FAIL, AllottedOrgCount+ " Validation Failed "+ counter);
		}	    	
	}
	@Test(priority = 8)

	public void VerifyOrganizationsAnnounced () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Organizations Announced Details");
		Thread.sleep(2000);

		String OrgAnnouncedcount=Dashboard_Common_Objects.OrgAnnouncedcount.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",7,1));
		//System.out.println(OrgAnnouncedcount);
		Thread.sleep(2000);

		if (OrgAnnouncedcount.contentEquals(counter))
		{
			//System.out.println("8");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	    	
	}

	@Test(priority = 9)
	public void VerifyCoreDiscipline () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted to Core Discipline Details");
		Thread.sleep(2000);

		String Corecount=Dashboard_Common_Objects.Corecount.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",8,1));
		//System.out.println(Corecount);
		Thread.sleep(2000);

		if (Corecount.contentEquals(counter))
		{
			//System.out.println("9");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 10)
	public void VerifyNonCoreDiscipline () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted to Non Core Discipline Details");
		Thread.sleep(2000);

		String NonCorecount=Dashboard_Common_Objects.NonCorecount.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",9,1));
		//System.out.println(NonCorecount);
		Thread.sleep(2000);

		if (NonCorecount.contentEquals(counter))
		{
			//System.out.println("10");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 11)
	public void VerifyTop5Preferences () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted with Top-5 Preferences Details");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.Prefercount.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",10,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("11");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 12)
	public void VerifyStationsParticipated () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Participated Stations");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.StationsParticipated.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",11,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("12");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 13)
	public void VerifyAnnouncedStations () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Announced Stations");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.StationAnnounced.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",12,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("13");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 14)
	public void VerifyStationsAllotted () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Allotted Stations");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.StationAllotted.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",13,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("14");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 15)
	public void VerifyTotalRequirements () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Total Requirements");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.TotalRqmts.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",14,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("15");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 16)
	public void VerifyTotalAllotted() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Total Allotted");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.TotalAllotted.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",15,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("16");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 17)
	public void VerifyStipendHighest() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Highest");
		Thread.sleep(2000);

		Dashboard_Common_Objects.StipendTab.click();
		Thread.sleep(2000);

		captureScreen("Admin - Stipend.png");
		String Prefercount=Dashboard_Common_Objects.Highest.getText().toString();
		String counter=Integer.toString(getExcelNumericData("AdminDash",16,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("17");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, Prefercount+ ": Validation Failed :"+ counter);
		}	
	}

	@Test(priority = 18)	
	public void VerifyStipendAverage() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Average");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.Average.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",17,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("18");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 19)	
	public void VerifyStipendMedian() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Median");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.Median.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",18,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("19");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 20)	
	public void VerifyStipendLowest() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Lowest");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.Lowest.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",19,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("20");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 21)	
	public void VerifyFacultyTotal() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Total");
		Thread.sleep(2000);

		Dashboard_Common_Objects.FacultyTab.click();
		Thread.sleep(2000);
		captureScreen("Admin - Faculty.png");
		String Prefercount=Dashboard_Common_Objects.FacultyTotal.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",20,1));
		//System.out.println("Faculty Total: "+Prefercount);
		//System.out.println("Excel Count: "+counter);
		Thread.sleep(2000);
		
		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("21");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 22)	
	public void VerifyFacultyOnCampus() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-On Campus");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyOnCampus.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",21,1));
		//System.out.println("Faculty Total: "+Prefercount);
		//System.out.println("Excel Count: "+counter);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("22");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 23)	
	public void VerifyFacultyOffCampus() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Off Campus");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyOffCampus.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",22,1));
		//System.out.println("Faculty Total: "+Prefercount);
		//System.out.println("Excel Count: "+counter);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("23");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 24)	
	public void VerifyFacultyAllotted() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Allotted");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyAllotted.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",23,1));
		//System.out.println("Faculty Total: "+Prefercount);
		//System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("24");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}

	@Test(priority = 25)	
	public void VerifyFacultyAvailable() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Available");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyAllotted.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",24,1));
		//System.out.println("Faculty Total: "+Prefercount);
		//System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("25");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
	@Test(priority = 26)	
	public void VerifyAvgStationAllotted() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Avg Station Allotted");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyAvgStationAllotted.getText();
		String counter=Integer.toString(getExcelNumericData("AdminDash",25,1));
		//System.out.println("Faculty Total: "+Prefercount);
		//System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);

		if (Prefercount.contentEquals(counter))
		{
			//System.out.println("26");
			extenttestCase.log(Status.PASS, " Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, " Validation Failed");
		}	
	}
}