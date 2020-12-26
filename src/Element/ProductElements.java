package Element;

import org.openqa.selenium.By;

public interface ProductElements {

	// Login page
	By NewsLetter = By.xpath(".//*[@id='NewsletterModal']/div/div/div[1]");
	By NewsLetterClose = By.xpath(".//*[@id='NewsletterModal']/div/div/center/button");
	By LoginEmail = By.xpath(".//*[@id='navbarSupportedContent']/button");
	By EmailField = By.xpath(".//*[@id='loginform-email']");
	By PasswordFiled = By.xpath(".//*[@id='loginform-password']");
	By LoginButton = By.xpath(".//*[@id='login-form']/button");
	By Newsfeed = By.xpath(".//*[@id='navbarDropdown']/span");

	// Sign up Page
	By Signup = By.xpath(".//*[@id='accordion']/div/div[1]/div[2]/button");
	By Namefiled = By.xpath(".//*[@id='signupform-contact']");
	By Email = By.xpath(".//*[@id='signupform-email']");
	By password = By.xpath(".//*[@id='signupform-password']");
	By Signupbtn = By.xpath(".//*[@id='signup-btn']");
	By heading = By.xpath(".//*[@id='info_heading']");

	// Forgot password page
	By forgotPassLink = By.xpath(".//*[@id='info_heading']");
	By forgotEmail = By.xpath(".//*[@id='passwordresetrequestform-email']");
	By Resetbtn = By.xpath(".//*[@id='forgotpass-btn']");

	// Newsfeed page
	By dropdown = By.xpath(".//*[@id='navbarDropdown']");
	

	By myprofile = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/div/a[1]");
	By myprofile2 = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/a[1]");
	By newsfeed = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[1]/a/span");
	By status = By.xpath("//*[contains(text(), 'Snow is awesome')]");
	By statusbar = By.xpath(".//*[@id='status']");
	By statusbtn = By.xpath(".//*[@id='send-btn']");
	By uploadedImage = By.xpath(".//*[@id=\"snowbofeed\"]/div[1]/div/div[2]/div/div/a/img");
	By username = By.xpath(".//*[@id='nf-area']/table/tbody/tr/td[2]/h3");
	By imageUpload = By.xpath(".//*[@id='upload-image1']");
	By logoutbtn = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/div/a[3]");
	By logoutbtn2 = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[2]/div/a[3]");
	By RdropDown = By.xpath(".//*[@id='navbarDropdown']");
	By RmyProfile = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[3]/div/a[1]");
	By AccountSettings = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/div/a[2]");
	By ResortMyProfile = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[3]/div/a[1]"); // resort user
	
	//*[@id="navbarSupportedContent"]/ul/li[3]/div/a[1]
	
	
	//*[@id="snowbofeed"]/div[1]/div/div[1]/div[2]
	
	
	//Account settings page
	
	//*[@id="name"]
	
	By name = By.id("name");
	By Updatebtn = By.id("update-acc-btn");
	By AccountSettingStatus = By.xpath("/html/body/div[1]/div/div/div[1]");
	
	By email = By.id("email");
	
	
	//Sign up page
	By BusinessUserTab = By.xpath(".//*[@id='user-form-signup']/div[1]/div/div/label[2]");
	By Fullname = By.xpath(".//*[@id='signupform-contact']");
	By Bemail = By.xpath(".//*[@id='signupform-email']");
	By Bpass = By.xpath(".//*[@id='signupform-password']']");
	By Bname = By.xpath(".//*[@id='signupform-name']");
	By Bcagetogy = By.xpath(".//*[@id='signupform-business_category']");
	By SignUpBtn = By.id("signup-btn");
	
	//*[@id="signupform-password"]
	
	//*[@id='user-form-signup']/div[1]/div/div/label[2]
	
	
	
	
	
	//*[@id=""]


	// My Profile Page

	By proimageUpload = By.xpath(".//*[@id='profileimg']");
	
	
	By proimage1 = By.xpath("//*[@id=\"profile-user\"]/div/div[1]/center/img");
	By proimage = By.xpath(".//*[@id='profile-user']/div/div[1]/center/a/img");
	By Rproimage = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/center/a/img");// Resort
	
	//*[@id="profileimg"]
	
	
	
	By RCoverimage = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/a/img");// Resort
	By CoverImageUpload = By.xpath(".//*[@id='coverimg']");
	By Coverimage = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/a/img");
	By deletebtn = By.xpath(".//*[@id=\"confirmm\"]");
	By imageUploaderbtn = By.xpath(".//*[@id='media-section']/div/div[1]/h3/span/button[2]");
	By UploadImageBtn = By.id("upload-img-btn");
	By uploadedimage = By.xpath(".//*[@id='media-section']/div/div[2]/div/div[1]/a/img");
	By MediaTab = By.id("media-tab");
	By preview = By.xpath(".//*[@id='fileupload']/table/tbody/tr/td[1]");
	By BrowseImage = By.id("chooseFilesg");
	By videoUploadBtn = By.xpath(".//*[@id='media-section']/div/div[1]/h3/span/button[1]");
	By videoLinkField = By.id("vid_path");
	By videoSaveBtn = By.id("save-vid-btn");
	By RAccountSettings = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[3]/div/a[2]");
	By ResortLogOut = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[3]/div/a[3]");
	By Rstatus = By.id("status");
	
	By ResortStatusSend = By.id("send-btn");
	
	
	//*[@id="send-btn"]
	
	//Media tab page
	
	By mediaImage = By.xpath(".//*[@id='media-section']/div/div[2]/div/div[1]/a/img");
	
	By mediasrc = By.xpath(".//*[@id='media-galley-tab']/div[1]/a/img");
	//*[@id="media-galley-tab"]/div[1]/a/img
	
	
	//*[@id="media-tab"]

	By Howthesite = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/a/span");

	

	// See this posting page

	By BookNowBtn = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[3]/div[1]/button[1]");
	By Book = By.xpath("//*[contains(text(), 'See this posting')]");
	By plannerCat = By.xpath("//*[@id='snowbofeed']/div[div/div[1]/div[2]/div[contains(string(), 'Added a tour')]]");
	
    By AdventurePlanner = By.xpath("//div[contains(text(), 'Added a travel package')]");
    By AddToAdevnturePlanner = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[2]/button");
    By AdventurePlannertab = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[2]/a/span");
    By AccoName = By.xpath(".//*[@id='pg-title']");
    By postinglink = By.xpath(".//*[@id='snowbofeed']/div[/div/div[2]/div/a]");
  
    
    
 

	/////////////////////////////////////////////////////////////////////////////// Resort
	/////////////////////////////////////////////////////////////////////////////// //////////////////////////////////////////////////////////////////////

	// Accomodation post page
    
  //*[@id="navbarDropdown"]

	By Accotab = By.xpath(".//*[@id='accomodation-tab']");
	By AddAcco = By.xpath(".//*[@id='accomodation']/h3/a");

	By AccoTitle = By.xpath(".//*[@id='accommodationTitle']");
	
	By AccoCategory = By.id("jobCategory");
	By Accotype = By.id("jobType");
	
	By Tags = By
			.xpath(".//*[@id='post-info']/div/div[2]/fieldset[1]/div/div[2]/div[3]/span[2]/span[1]/span/ul/li/input");
	
	
	By TagValue = By.xpath(".//*[@id='s2-togall-w0']/span[1]");
	By Booklink = By.xpath(".//*[@id='accommodationApplyLink']");
	
	By AccoLocation = By.xpath(".//*[@id='post-address']");
	By StreetAddress = By.xpath(".//*[@id='address_1']");
	By Accosub = By.xpath(".//*[@id='suburb']");
	By state = By.xpath(".//*[@id='state_or_province']");
	
	By AccoDes = By.xpath(".//*[@id='accommodationDescription']");
	By AccoIncludes = By.xpath(".//*[@id='accommodationIncludes']");
	By AccoOptions = By.xpath(".//*[@id='accommodationOptions']");
	//By AccoImage = By.xpath(".//*[@id='upload-image1']");

	By AccoVideo = By.xpath(".//*[@id='upload-video']");
	By SelectPlan = By.xpath(".//*[@id='post-info']/div/div[2]/div/a[2]");
	//By CourseSelectPlan = By.xpath(".//*[@id='post-info']/div/div[2]/div/a[2]");
	
	//*[@id="post-info"]/div/div[2]/div/a[2]
	
	
	//Jobs post pagee
	
	By AddJobs = By.xpath(".//*[@id='jobs']/h3/a");
	By jobsTitle = By.id("jobTitle");
	By jobsTab = By.id("jobs-tab");
	By JobCat = By.id("jobCategory");

	By jobtype = By.id("jobType");
	
	By TagValuejobs = By.xpath(".//*[@id='s2-togall-w0']/span[1]");
	By jobApplyLink = By.id("jobApplyLink");
	
	By address = By.id("post-address");
	
	By streetAddress = By.id("address_1");
	By suburb = By.id("suburb");
	By StateOrProvince = By.id("state_or_province");
	//By jobsTab = By.id("jobs-tab");
	
	By JobStartDate = By.id("job_start");
	By JobEnd = By.id("job_end");
	By ApplicationOpen = By.id("application_open");
	By ApplicationClose = By.id("application_end");
	
	By SinglepostJob = By.xpath("//*[@id=\"post-info\"]/div/div[2]/fieldset[3]/div/div[2]/div[2]/div/div/label[2]");

	By JobHideDate = By.id("visible_before_at");
	
	By Pay = By.id("jobPay");
	By PayType = By.id("jobPayType");
	By currency = By.id("jobCurrency");
	
	By JobDescription = By.id("jobDescription");
	By JobIncludes = By.id("jobIncludes");
	By ImagePost = By.id("upload-image1");
	By VideoLink = By.id("upload-video");
	
	
	

	By courseTab = By.id("courses-tab");
	By freePlan = By.xpath(".//*[@id='free']/div/label");
	By SaveAcco = By.id("send-btn");
	
	//Post course page
	
	By AddCourse = By.xpath(".//*[@id='courses']/h3/a");
	By courseTitle = By.id("courseTitle");
	

	
	
	
	By courseapplyLink = By.id("courseApplyLink");
	
	
	
	By courseStart = By.id("course_start");
	By courseEnd = By.id("course_end");
	By courseCost = By.id("courseCost");
	By Coursecurrency = By.id("courseCurrency");
	
	
	
	
	By CourseDescription = By.id("courseDescription");
	By CourseIncludes = By.id("courseIncludes");
	
	
	
	// Tour package page
	
	By ToursTab = By.id("tours-tab");
	By AddTour = By.xpath(".//*[@id='tours']/h3/a");
	By TourTitle = By.id("tourTitle");
	

	
	
	
	By TourApplyNow = By.id("tourApplyLink");
	
	
	
	By TourApply = By.id("course_start");
	By TourDuration = By.id("tourDuration");
	By TourFrom = By.id("tour_start");
	By TourTo = By.id("tour_end");
	
	
	
	
	By TourPrice = By.id("tourPrice");
	By Corrency = By.id("tourCurrency");
	
	By TourIncludes = By.id("tourIncludes");
	By TourDes = By.id("tourDescription");
	
	
	// Tour package page
	
		By TravelTab = By.id("packages-tab");
		By AddTravel = By.xpath(".//*[@id='packages']/h3/a");
		By TravelTitle = By.id("travelTitle");
		

		
		
		
		By TavelApplyLink = By.id("travelApplyLink");
		
		
		
		
		By TravelDuration = By.id("travelDuration");
		By TraveTourFrom = By.id("package_start");
		By TraveTourTo = By.id("package_end");
		
		
		
		
		By TravePrice = By.id("travelPrice");
		By TraveCorrency = By.id("travelCurrency");
		
		By TraveIncludes = By.id("travelIncludes");
		By TraveDes = By.id("travelDescription");
		
		// Post Deal Page
		
		
		By DealsTab = By.id("deals-tab");
		By AddDeal = By.xpath(".//*[@id='deals']/h3/a");
		By DealTitle = By.id("dealTitle");
		

		
		
		
		By DealApplyLink = By.id("dealApplyLink");
		
		
		
		By DealCat = By.id("dealCategory");
		By lat = By.id("latitude");
		By longitude = By.id("longitude");
		
		
		
		By DealDes = By.id("dealDescription");
		
		
		
		By DealIncludes = By.id("dealIncludes");
	
		
	
	
	
	
	
	
	

}
