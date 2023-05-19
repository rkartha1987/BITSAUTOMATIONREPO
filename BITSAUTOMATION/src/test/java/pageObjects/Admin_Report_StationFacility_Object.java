package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Report_StationFacility_Object {
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[2]/a")
	public static WebElement Report;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-navbar/nav/div/div/ul/li[2]/div/a[10]")
	public static WebElement StationFacility;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[1]/i")
	public static WebElement Menu;
	
	/////////////////////////////////Filter By/////////////////////////////////////////////////////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/a")
	public static WebElement ClickBatch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/select")
	public static WebElement SelectBatch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement BatchResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[1]/a")
	public static WebElement ClickPSType ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/select")
	public static WebElement SelectPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement PSTypeResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div/div/div[1]/a")
	public static WebElement ClickStationName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div/div/div[2]/input")
	public static WebElement EnterStationName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement SNResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[5]/div/div/div[1]/a")
	public static WebElement ClickProjectName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[5]/div/div/div[2]/input")
	public static WebElement EnterProjectName ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement PNResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[6]/div/div/div[1]/a")
	public static WebElement ClickParentCompany;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[6]/div/div/div[2]/input")
	public static WebElement EnterParentCompany ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement PCResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div/div/div[1]/a")
	public static WebElement Accomo;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div/div/div[2]/select")
	public static WebElement SelectAccomo;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement AccomoResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[8]/div/div/div[1]/a")
	public static WebElement StipendGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[8]/div/div/div[2]/input")
	public static WebElement EnterStipendGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement SGTResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[9]/div/div/div[1]/a")
	public static WebElement StipendLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[9]/div/div/div[2]/input")
	public static WebElement EnterStipendLT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement SLTResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[10]/div/div/div[1]/a")
	public static WebElement ScholarshipGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[10]/div/div/div[2]/input")
	public static WebElement  EnterScholarshipGT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement SSGTResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[11]/div/div/div[1]/a")
	public static WebElement ScholarshipLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[11]/div/div/div[2]/input")
	public static WebElement EnterScholarshipLT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement SSLTResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[12]/div/div/div[1]/a")
	public static WebElement StipendForPGGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[12]/div/div/div[2]/input")
	public static WebElement EnterStipendForPGGT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement StipendForPGGTResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[14]/div/div/div[1]/a")
	public static WebElement StipendForPGLT ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[14]/div/div/div[2]/input")
	public static WebElement EnterStipendForPGLT;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement StipendForPGLTResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[13]/div/div/div[1]/a")
	public static WebElement SubsidizedLunch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[13]/div/div/div[2]/select")
	public static WebElement SelectSubsidizedLunch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement SubsidizedLunchResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[15]/div/div/div[1]/a")
	public static WebElement  Travel;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[15]/div/div/div[2]/select")
	public static WebElement SelectTravel;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement TravelResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[16]/div/div/div[1]/a")
	public static WebElement FieldDA;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[16]/div/div/div[2]/select")
	public static WebElement SelectFielDA;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement FielDAResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[17]/div/div/div[1]/a")
	public static WebElement FieldTA;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[17]/div/div/div[2]/select")
	public static WebElement SelectFieldTA;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement FieldTAResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[18]/div/div/div[1]/a")
	public static WebElement Faculty;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[18]/div/div/div[2]/input")
	public static WebElement  EnterFaculty;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement FacultyResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[19]/div/div/div[1]/a")
	public static WebElement Conveyance;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[19]/div/div/div[2]/select")
	public static WebElement SelectConveyance ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement ConveyanceResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[20]/div/div/div[1]/a")
	public static WebElement Medical;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[20]/div/div/div[2]/select")
	public static WebElement SelectMedical;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement MedicalResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[21]/div/div/div[1]/a")
	public static WebElement AddressforG;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[21]/div/div/div[2]/input")
	public static WebElement EnterAddressforG;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement AddressforGResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[22]/div/div/div[1]/a")
	public static WebElement AddressforB;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[22]/div/div/div[2]/input")
	public static WebElement EnterAddressforB;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement AddressforBResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[23]/div/div/div[1]/a")
	public static WebElement OtherInfo;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[23]/div/div/div[2]/input")
	public static WebElement EnterOtherInfo ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement OtherInfoOtherInfo ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[24]/div/div/div[1]/a")
	public static WebElement PBEnteredBy;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[24]/div/div/div[2]/input")
	public static WebElement EnterPBEnteredBy;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[3]/table")
	public static WebElement PBEnteredByResult ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[25]/button[1]")
	public static WebElement ClickFilter;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[1]/div/div/div[3]/div/button")
	public static WebElement Export;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[25]/button[2]")
	public static WebElement ClickReset ;	
}
