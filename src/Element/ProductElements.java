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
	
	
	//Forgot password page
	By forgotPassLink = By.xpath(".//*[@id='info_heading']");
	By forgotEmail = By.xpath(".//*[@id='passwordresetrequestform-email']");
	By Resetbtn = By.xpath(".//*[@id='forgotpass-btn']");
	
	
	
	// Status update
	By dropdown = By.xpath(".//*[@id='navbarDropdown']");
	By myprofile = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/div/a[1]");
	By newsfeed = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[1]/a/span");
	By status= By.xpath("//*[contains(text(), 'Snow is awesome')]");
	
	
	//Status update newsfeed

	By statusbar = By.xpath(".//*[@id='status']");
	By statusbtn = By.xpath(".//*[@id='send-btn']");
	//By newsfeed = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[1]/a/span");
	
      //image upload newsfeed
	By uploadedImage = By.xpath(".//*[@id=\"snowbofeed\"]/div[1]/div/div[2]/div/div/a/img");
	By username = By.xpath(".//*[@id='nf-area']/table/tbody/tr/td[2]/h3");
	By imageUpload = By.xpath(".//*[@id='upload-image1']");
	
	
	//Profile image
	
	By proimageUpload = By.xpath(".//*[@id='profileimg']");
	By proimage = By.xpath("//*[@id=\"profile-user\"]/div/div[1]/center/a/img");
	
	
	//Cover image
	By CoverImageUpload = By.xpath(".//*[@id='coverimg']");
	By Coverimage = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/a/img");
	
	
	//logout
	By logoutbtn = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/div/a[3]");
	By Howthesite = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[4]/a/span");
	
	//Delete  acctivity
	
	
	By deletebtn = By.xpath(".//*[@id=\"confirmm\"]");
	
	
	
	///////////////////////////////////////////////////////////////////////////////Resort //////////////////////////////////////////////////////////////////////
	
	By RdropDown = By.xpath(".//*[@id='navbarDropdown']");
	By RmyProfile = By.xpath(".//*[@id='navbarSupportedContent']/ul/li[3]/div/a[1]");
	By Accotab = By.xpath(".//*[@id='accomodation-tab']");
	By AddAcco = By.xpath(".//*[@id='accomodation']/h3/a");
	
	By AccoTitle = By.xpath(".//*[@id='accommodationTitle']");
	By Tags = By.xpath(".//*[@id='post-info']/div/div[2]/fieldset[1]/div/div[2]/div[3]/span[2]/span[1]/span/ul/li/input");
	By TagValue = By.xpath(".//*[@id='select2-w0-result-xdbu-snowbo']");
	By Booklink = By.xpath(".//*[@id='accommodationApplyLink']");
	
	By AccoLocation = By.xpath(".//*[@id='post-address']");
	By StreetAddress = By.xpath(".//*[@id='address_1']");
	By Accosub = By.xpath(".//*[@id='suburb']");
	By state = By.xpath(".//*[@id='state_or_province']");
	
	By AccoDes = By.xpath(".//*[@id='accommodationDescription']");
	By AccoIncludes = By.xpath(".//*[@id='accommodationIncludes']");
	By AccoOptions = By.xpath(".//*[@id='accommodationOptions']");
	By AccoImage = By.xpath(".//*[@id='upload-image1']");
	
	
	By AccoVideo = By.xpath(".//*[@id='upload-video']");
	By AccoSelectPlan = By.xpath(".//*[@id='post-info']/div/div[2]/div/a[2]");
	
	
	
	
	
	
	
	
}
