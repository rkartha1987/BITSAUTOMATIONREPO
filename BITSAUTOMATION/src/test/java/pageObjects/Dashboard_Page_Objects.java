package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page_Objects {
	//----------------------Menu Strip----------------
	@FindBy(xpath="//div[@id='collapsibleNavbar']//li")
	public static List<WebElement> MenuStrip;

	@FindBy(xpath="//*[text()='Home']")
	public static WebElement  Home_Menu;
	
	@FindBy(xpath="//a[@href='/station/manage']")
	public static WebElement  Station_Menu;
	
	@FindBy(xpath="//div/a[contains(text(),'Semester Allotment')]")
	public static WebElement SemAllot_Menu;		
	
	@FindBy(xpath="//a[contains(text(),'Student Semester Allotment')]")
	public static WebElement StudSemAllot_Menu;

	@FindBy(xpath="//a[contains(text(),'All Allotted Student List')]")
	public static WebElement AllotStudList_Menu;	

	@FindBy(xpath="//a[contains(text(),'Station Allotment')]")
	public static WebElement StatAllot_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Announce Station')]")
	public static WebElement AnnounceStat_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Convert Station')]")
	public static WebElement ConvertStat_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Converted Station List')]")
	public static WebElement ConvertStatList_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Station Allotment')]//following::div/a[contains(text(),'Allotment')]")
	public static WebElement Allotment_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Post Allotment')]")
	public static WebElement  PostAllot_Menu;	
	
	@FindBy(xpath="//a[contains(text(),'Station Wise')]")
	public static WebElement StatWise_Menu;	

	@FindBy(xpath="//a[contains(text(),'Faculty Wise')]")
	public static WebElement FacultyWise_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Student Wise')]")
	public static WebElement StudWise_Menu;
	
//------------------MenuStrip related to Planning Team--------------------------
	
	@FindBy(xpath="//*[text()='Manage Station']")
	public static WebElement ManageStat_Menustrp;

	@FindBy(xpath="//a[text()='Problem Bank']")
	public static WebElement ProbBank_Menustrp;
	
	@FindBy(xpath="//a[contains(text(),'Station Allotment')]//parent::li/div//a")
	public static WebElement StatAllot_drpdwnlist;
	
	@FindBy(xpath="//a[contains(text(),'Station Preference')]")//list of Station Allotment
	public static WebElement StatPrefer_drpdwnlist;

	@FindBy(xpath="//a[text()=' Faculty Allotment ']")
	public static WebElement  FacultyAllotment;

	@FindBy(xpath="//a[text()='Group Leader Allotment']")
	public static WebElement GroupLeaderAllot_drpdwnval;	

	@FindBy(xpath="//a[text()='Station/Faculty wise Allotment']")
	public static WebElement StationOrFacultyAllot_drpdwnval;
	
	@FindBy(xpath="//a[text()='View Faculty Allotment']")
	public static WebElement ViewFaculty_drpdwnval;
	
//--------------------Reports-----------------------------	
	@FindBy(xpath="//*[contains(text(),'Reports')]")
	public static WebElement Reports_Menu;
	
	@FindBy(xpath="//*[contains(text(),'Allotted Station Student Faculty List')]")
	public static WebElement Allot_StaStudFact_list;
	
	@FindBy(xpath="//*[contains(text(),'Allotted Station Details')]")
	public static WebElement Allot_StatDetail;
	
	@FindBy(xpath="//*[contains(text(),'Preferences Allotted Station')]")
	public static WebElement Pref_AllotStat;
	
	@FindBy(xpath="//*[contains(text(),'Problem Bank Details')]")
	public static WebElement ProbBankDetail;
	
	@FindBy(xpath="//*[contains(text(),'Active Station')]")
	public static WebElement ActiveStat;
	
	@FindBy(xpath="//*[contains(text(),'All Station Contact List')]")
	public static WebElement AllStatContList;
	
	@FindBy(xpath="//*[contains(text(),'Student Course List')]")
	public static WebElement StudCourseList;
	
	@FindBy(xpath="//*[contains(text(),'Student Bio Data')]")
	public static WebElement StudBioData;
	
	//----------------------select--------------------

	@FindBy(xpath="//h2[text()='Station Allotment Details']")
	public static WebElement  Dashboard_Header;

	@FindBy(xpath="//select[@name='batchId']")
	public static WebElement BatchId_drpdwn;
	
	@FindBy(xpath="//select[@name='pstypeId']")
	public static WebElement PSType_drpdwn;
	
	@FindBy(xpath="//select[@name='semseter']")
	public static WebElement Semester_drpdwn;
	
	@FindBy(xpath="//div[@class='stepper-progress']/div")
	public static List<WebElement> Progress_StepList;
	
	@FindBy(xpath="//div[@id='step1']")
	public static WebElement SemPreferInitiated;
	
	@FindBy(xpath="//div[@id='step2']")
	public static WebElement ReadySemAllot;
	
	@FindBy(xpath="//div[@id='step3']")
	public static WebElement SemAllotStart;
	
	@FindBy(xpath="//div[@id='step4']")
	public static WebElement SemAllotComplete;
	
	@FindBy(xpath="//div[@id='step5']")
	public static WebElement RelStatPrefer;
	
	@FindBy(xpath="//div[@id=' step6']")
	public static WebElement ReadyStatAllot;

	@FindBy(xpath="//div[@id='step7']")
	public static WebElement StatAllotStart;

	@FindBy(xpath="//div[@id='step8']")
	public static WebElement StatAllotComplete;

	@FindBy(xpath="//div[@id='step9']")
	public static WebElement FacAllotStart;

	@FindBy(xpath="//div[@id='step10']")
	public static WebElement FacAllotComplete;

	@FindBy(xpath="//div[@id='step11']")
	public static WebElement AllotLetterRel;
	
	@FindBy(xpath="//div[@class='dashcount']")
	public static List<WebElement> DashValues;

	@FindBy(xpath="(//div[@class='dashcount'])[1]")
	public static WebElement TotalStud;
	
	@FindBy(xpath="(//div[@class='dashcount'])[2]")
	public static WebElement AllotStud;
	
	@FindBy(xpath="(//div[@class='dashcount'])[3]")
	public static WebElement AllotOrg;
	
	@FindBy(xpath="(//div[@class='dashcount'])[4]")
	public static WebElement OrgAnnounced;
	
	@FindBy(xpath="(//div[@class='dashcount'])[5]")
	public static WebElement AllotCore;
	
	@FindBy(xpath="(//div[@class='dashcount'])[6]")
	public static WebElement AllotNonCore;
	
	@FindBy(xpath="(//div[@class='dashcount'])[7]")
	public static WebElement AllotTop5Pre;
	
	//station pill
	@FindBy(xpath="//a[@data-toggle='pill' and text()='Station']")
	public static WebElement Station_pill;

	@FindBy(xpath="//*[contains(text(),'Stations Participated')]")
	public static WebElement stat_participated;
	
	@FindBy(xpath="//*[contains(text(),'Station Announced')]")
	public static WebElement stat_announce;
	
	@FindBy(xpath="//*[contains(text(),'Station Allotted')]")
	public static WebElement stat_allotd;
	
	@FindBy(xpath="//*[contains(text(),'Total Requirements')]")
	public static WebElement Tot_Req;
	
	@FindBy(xpath="//*[contains(text(),'Total Allotted')]")
	public static WebElement Tot_Allot;
	
	//stipend pill
	@FindBy(xpath="//a[@data-toggle='pill' and text()='Stipend']")
	public static WebElement Stipend_pill;
	
	@FindBy(xpath="//*[contains(text(),'Highest')]")
	public static WebElement Highest;
	
	@FindBy(xpath="//*[contains(text(),'Average')]")
	public static WebElement Avg;
	
	@FindBy(xpath="//*[contains(text(),'Median')]")
	public static WebElement Median;
	
	@FindBy(xpath="//*[contains(text(),'Lowest')]")
	public static WebElement Lowest;
		
	@FindBy(xpath="//a[@data-toggle='pill' and text()='Faculty']")
	public static WebElement Faculty_pill;
	
	@FindBy(xpath="//div[@id='faculty']//p[contains(text(),'Total')]")
	public static WebElement Total;
	
	@FindBy(xpath="//div[@id='faculty']//p[contains(text(),'On Campus')]")
	public static WebElement On_Campus;
		
	@FindBy(xpath="//div[@id='faculty']//p[contains(text(),'Off Campus')]")
	public static WebElement Off_Campus;
	
	@FindBy(xpath="//div[@id='faculty']//p[contains(text(),'Allotted')]")
	public static WebElement Allotd;
	
	@FindBy(xpath="//div[@id='faculty']//p[contains(text(),'Available')]")
	public static WebElement Available;
	
	@FindBy(xpath="//div[@id='faculty']//p[contains(text(),'Average Station Allotted')]")
	public static WebElement Avg_Stat_Allotd;
	
	//Students availability in different CGPA Range
	
	@FindBy(xpath="(//*[name()='g'][@focusable and @tabindex])[7]")
	public static WebElement CGPA_less5;
	
	@FindBy(xpath="(//*[name()='g'][@focusable and @tabindex])[8]")
	public static WebElement CGPA_5to6;
	
	@FindBy(xpath="(//*[name()='g'][@focusable and @tabindex])[9]")
	public static WebElement CGPA_6to7;
	
	@FindBy(xpath="(//*[name()='g'][@focusable and @tabindex])[10]")
	public static WebElement CGPA_7to8;
	
	@FindBy(xpath="(//*[name()='g'][@focusable and @tabindex])[11]")
	public static WebElement CGPA_8to9;
	
	@FindBy(xpath="(//*[name()='g'][@focusable and @tabindex])[12]")
	public static WebElement CGPA_9to10;
	//div[@class='dashcount']//strong
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[4]/a")
	public static WebElement SemesterAllotment;	
}
