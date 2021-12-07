package testCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Dashboard_Page_Objects;

public class Dashboard_TC extends CommonFunctions {
		
public void	getLiveAllotmentstatus(int count){
		driver.findElement(By.xpath("//div[@class='stepper-progress']/div["+(count+1)+"]"));
		String step=driver.findElement(By.xpath("//div[@class='stepper-progress']/div["+(count+1)+"]")).getAttribute("id");
		System.out.println(step);
		switch(step){    
		case "step1":    
			extenttestCase.log(Status.PASS,"Semester Preference Initiated has been Completed");    
		 break; 
		case "step2":    
			extenttestCase.log(Status.PASS,"Ready For Semester Allotment has been Completed");    
			 break; 
		case "step3":    
			extenttestCase.log(Status.PASS,"Semester Allotment Started has been Completed");    
			 break; 	 
		case "step4":    
			extenttestCase.log(Status.PASS,"Semester Allotment Completed");    
			 break; 
		case "step5":    
			extenttestCase.log(Status.PASS,"Released Station For Preference has been Completed");    
			 break; 
		case " step6":    
			extenttestCase.log(Status.PASS,"Ready For Station Allotment has been Completed");    
			 break; 	 
		case "step7":    
			extenttestCase.log(Status.PASS,"Station Allotment Started");    
			 break; 	 
		case "step8":    
			extenttestCase.log(Status.PASS,"Station Allotment Completed");    
			 break; 	 
		case "step9":    
			extenttestCase.log(Status.PASS,"Faculty Allotment Started");    
			 break; 	 
		case "step10":    
			extenttestCase.log(Status.PASS,"Faculty Allotment Completed");    
			 break; 	 
		case "step11":    
			extenttestCase.log(Status.PASS,"Allotment Letter Released");    
			 break; 	 
		
		default:
			extenttestCase.log(Status.FAIL,"No Status is available");  
			//break;
		}    
}
	
public void Selectdrpdwn(WebElement Bat,String sheetname, int row, int col) {
	
	Select Batch = new Select(Bat);
	String BatchYr = null; 
	try {
		BatchYr = getExcelData(sheetname, row, col);
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
	Batch.selectByVisibleText(BatchYr);				
	extenttestCase.log(Status.INFO,"Selected the Batch name");
		
}


@Test(enabled=false)	
	public void Verify_LandingPage_Admin() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Admin team");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "STATION REFERAL", "MANAGE STUDENT","MANAGE FACULTY","REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			
			Actual.add(a.getText());
		}
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Admin Team member ");
		}
        else {
	        	   System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Admin team");
        }
	}

@Test(enabled=false)	
public void Verify_LandingPage_PlanningTeam() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Planning team");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "MANAGE STATION", "PROBLEM BANK","SEMESTER ALLOTMENT","STATION ALLOTMENT","FACULTY ALLOTMENT","POST ALLOTMENT","ANNOUNCEMENT","REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			
			Actual.add(a.getText());
		}
		
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Planning Team member ");
		}
        else {
	        	   System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Planning team");
        }	
}

@Test(enabled=false)	
	public void Verify_LandingPage_AllotTeam() throws Throwable {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			extenttestCase=extentReport.createTest("Verifying Landing Page of Allotment team");
			PageFactory.initElements(driver, Dashboard_Page_Objects.class);
			List<String> Expected=Arrays.asList("HOME", "STATION", "SEMESTER ALLOTMENT","STATION ALLOTMENT","POST ALLOTMENT","REPORTS");
			List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
			
			List<String> Actual=new ArrayList<String>();
			for(WebElement a:li) {
				Actual.add(a.getText());
			}
			
			if (Expected.equals(Actual) == true) {
	            System.out.println(" Array List are equal");
	    		extenttestCase.log(Status.INFO,"User successfully logged in as Allotment Team member ");
			}
	        else {
		        System.out.println(" Array List are not equal");    	
	       		extenttestCase.log(Status.INFO,"User logged in is not from Allotment team");
	        }
}

@Test(enabled=false)	
public void Verify_LandingPage_Dean() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Dean");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			Actual.add(a.getText());
		}
		
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Dean ");
		}
        else {
	        System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Dean");
        }
}

@Test(enabled=false)	
public void Verify_LandingPage_InstructionCell() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Instruction Cell team");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "STATION REFERAL","PROBLEM BANK","POST ALLOTMENT","FACULTY ALLOTMENT", "REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			Actual.add(a.getText());
		}
		
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.PASS,"User successfully logged in as Instruction Cell");
		}
        else {
	        System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.FAIL,"User logged in is not from Instruction Cell");
    }
		
	}


@Test(priority=0)
public void Verify_Dashboard_Allotmentstatus() throws Throwable {
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	extenttestCase=extentReport.createTest("Verifying Dashboard Allotment status");
	PageFactory.initElements(driver, Dashboard_Page_Objects.class);
	WebDriverWait wait= new WebDriverWait(driver, 15);	
	wait.until(ExpectedConditions.visibilityOf(Dashboard_Page_Objects.SemPreferInitiated));
	List<WebElement> li=Dashboard_Page_Objects.Progress_StepList;
	int count=0;
	for(WebElement a:li) {
		String at=a.getAttribute("class");
		//System.out.println(at);
		if(at.equals("progress-step is-complete")) {
	count++;
		}
			
	}
	getLiveAllotmentstatus(count);	
}

@Test(priority=1)
public void Verify_StudentCount_FromCGPARange() throws Throwable {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	extenttestCase=extentReport.createTest("Verifying No.of Students in each CGPA");
	

//changing the PS TYPE	
	Selectdrpdwn(Dashboard_Page_Objects.PSType_drpdwn, "FacultyGroupLeaderData" , 7, 1);
	synchronized(driver) {
	driver.wait(4000);
	}
	
	extenttestCase.log(Status.INFO,"No.of Students below CGPA 5");
	String CGPAlessthn5=Dashboard_Page_Objects.CGPA_less5.getText();
	extenttestCase.log(Status.INFO,"No.of Students below CGPA 5"+" is "+CGPAlessthn5);

	extenttestCase.log(Status.INFO,"No.of Students below CGPA 5-6");
	String CGPA5to6=Dashboard_Page_Objects.CGPA_5to6.getText();
	extenttestCase.log(Status.INFO,"No.of Students between CGPA 5-6"+" is "+CGPA5to6);
	
	extenttestCase.log(Status.INFO,"No.of Students below CGPA 6-7");
	String CGPA6to7=Dashboard_Page_Objects.CGPA_6to7.getText();
	extenttestCase.log(Status.INFO,"No.of Students between CGPA 6-7"+" is "+CGPA6to7);
	
	extenttestCase.log(Status.INFO,"No.of Students below CGPA 7-8");
	String CGPA7to8=Dashboard_Page_Objects.CGPA_7to8.getText();
	extenttestCase.log(Status.INFO,"No.of Students between CGPA 7-8"+" is "+CGPA7to8);
	
	extenttestCase.log(Status.INFO,"No.of Students below CGPA 8-9");
	String CGPA8to9=Dashboard_Page_Objects.CGPA_8to9.getText();
	extenttestCase.log(Status.INFO,"No.of Students between CGPA 8to9"+" is "+CGPA8to9);
	
	extenttestCase.log(Status.INFO,"No.of Students below CGPA 9-10");
	String CGPA9to10=Dashboard_Page_Objects.CGPA_9to10.getText();
	extenttestCase.log(Status.INFO,"No.of Students between CGPA 8to9"+" is "+CGPA9to10);

}

}
