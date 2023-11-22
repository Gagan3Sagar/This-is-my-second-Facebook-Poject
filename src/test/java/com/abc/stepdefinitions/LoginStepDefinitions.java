package com.abc.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	ChromeDriver driver;
	/////////////REGISTRATION///////////
	/*@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}

	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	
	@When("click on create New Account")
	public void CreateNewAccount()
	{
		driver.findElement(By.xpath("//input[@class='bh bi bj bt bl bu']")).click();
	}
	@When("enter valid First Name")
	public void EnterFirstName()
	{
		driver.findElement(By.name("firstname")).sendKeys("Gagan");
	}
	@When("enter valid Sur Name")
	public void EnterSurName()
	{
		driver.findElement(By.name("lastname")).sendKeys("Sagar");
	}
	@When ("Enter valid Email Address")
	public void EnterEmailAddress()
	{
		driver.findElement(By.name("reg_email__")).sendKeys("gagan3sagar@gmail.com");
	}
	@When ("click on valid gender")
	public void EnterGender()
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr/td/form/div[3]/div/div[2]/div/table/tbody/tr/td[2]/label/span")).click();
	}
	@When("Enter valid date of Birth")
	public void EnterDateOfbirth()
	{
		WebElement myDropdown=driver.findElement(By.id("day"));
		myDropdown.click();
		Select s=new Select(myDropdown);
		s.selectByIndex(2);
		
		   WebElement myDropdown1=driver.findElement(By.id("month"));
			myDropdown1.click();
			Select s1=new Select(myDropdown1);
			   s1.selectByIndex(0);
			   
			   WebElement myDropdown2=driver.findElement(By.id("year"));
				myDropdown2.click();
				Select s2=new Select(myDropdown2);
				   s2.selectByIndex(26);
	}			   
	@When ("Enter valid password")
	public void EnterValidPassword()
	{
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mfacebook@123");
	}
	
	@When("Click on sign up")
	public void ClickOnSignUp()
	{
		driver.findElement(By.id("signup_button")).click();
	}
	@When ("Enter Confirmation code")
	public void EnterConfirmcode()
	{
		driver.findElement(By.name("c")).sendKeys("38620");
	}
	@When ("Click On confirm")
	public void ClickOnConfirm()
	{
		driver.findElement(By.name("submit[confirm]")).click();
	}*/
	
	/////////////LOGIN, SEARCHING FOR FRIEND BY NAME,SENDING FRIEND REQUEST////////////////////
	 /*@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a valid email")
   public void EnteraValidEmail() throws InterruptedException
   {
	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
	   Thread.sleep(2000);
   }
	@When("enter a valid password")
   public void EnterValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }
	@When ("click on ok")
	public void ClickOk()
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
	}
	@When("click on find friends")
	public void FindFriends() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]")).click();
		Thread.sleep(2000);
	}
	@When("click on search for friends")
	public void searchforfriends() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/a")).click();
		Thread.sleep(2000);
	}
	@When ("Enter valid friend name")
	public void validfriendname() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Sagar SG Gagan");
		Thread.sleep(2000);
	}
	@When ("Click on search")
	public void search() throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	}
	@When ("Enter valid friend name1")
	public void enterVlaidname1() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Sagar SG Gagan");
		Thread.sleep(2000);
	}
	@When ("Click on search1")
	public void search1() throws InterruptedException
	{
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	}
	@When ("Click on Add friend")
	public void Addfriend()
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div[1]/table/tbody/tr/td[2]/div[2]/a")).click();
	}
}    */      
	          
	          ////////LOGOUT/////////
	
	/*@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a valid email")
   public void EnteraValidEmail() throws InterruptedException
   {
	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
	   Thread.sleep(2000);
   }
	@When("enter a valid password")
   public void EnterValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }
	@When ("click on ok")
	public void ClickOk() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		Thread.sleep(2000);
	}
	@When ("click on logout")
	public void ClickOnLogout()
	{
		driver.findElement(By.id("mbasic_logout_button")).click();
	}
}*/
	
	/////////////////adjusting privacy settings//////////
	/*@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a valid email")
   public void EnteraValidEmail() throws InterruptedException

   {
	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
	   Thread.sleep(2000);
   }
	@When("enter a valid password")
   public void EnterValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }
	@When ("click on ok")
	public void ClickOk() throws InterruptedException
	{
    driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
    Thread.sleep(2000);
	}
	@When("click on settings and privacy")
	public void SettingsAndPrivacy() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/table/tbody/tr/td[1]/a[3]")).click();
		Thread.sleep(2000);
	}
	@When ("click on profile locking")
	public void ProfileLocking() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/table/tbody/tr/td/div[3]/div[1]/a[1]/div/div/div[2]/div[1]")).click();
		Thread.sleep(2000);
	}
	@When("click on See your profile")
	public void SeeyourProfile() throws InterruptedException
	{
	driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/form/div[3]/div/a")).click();
	Thread.sleep(2000);
	}*/
//}

//////////////viewing others profile////////////////
	/*ChromeDriver driver;
	@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a valid email")
   public void EnteraValidEmail() throws InterruptedException
   {
	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
	   Thread.sleep(2000);
   }
	@When("enter a valid password")
   public void EnterValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }
	@When ("click on ok")
	public void ClickOk()
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
	}
	@When("click on Edit profile")
	public void EditProfile() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[2]\r\n")).click();
		Thread.sleep(2000);
	}
	@When("click on find friends")
	public void ClickonFindFriends() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]\r\n")).click();
	Thread.sleep(2000);
	}
	@When("enter valid name")
	public void EnterValidName() throws InterruptedException
	{
	driver.findElement(By.name("query")).sendKeys("Akshay Mahurkur");	
	Thread.sleep(2000);
	}
	@When ("Click on search")
	public void ClickonSearch() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}
	@When("click on name")
	public void ClickonName()
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div/div/div[1]/div/table/tbody/tr/td[2]/a")).click();
	}
}*/
	
	
	////////////////INVALID LOGIN////////////////
	//ChromeDriver driver;
	/*@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a invalid email")
   public void EnteraInValidEmail()
   {
	   driver.findElement(By.name("email")).sendKeys("gagansagar@gmail.com");
   }
	@When("enter a invalid password")
   public void EnterInValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("MFacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }*/
	
	
	/////////////CHANGE NAME IN PROFILE/////////////////
	@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a valid email")
   public void EnteraValidEmail()
   {
	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
   }
	@When("enter a valid password")
   public void EnteraValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }
    @When ("click on ok")
	public void ClickOk() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		Thread.sleep(2000);
	}
    @When("click on settings and privacy")
	public void SettingsAndPrivacy()throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/table/tbody/tr/td[1]/a[3]")).click();
		Thread.sleep(2000);
	}
	
    @When ("click on personal and account information")
    public void PersonalandAccount() throws InterruptedException
    {
    	driver.findElement(By.xpath("/html/body/div/div/div[1]/div/table/tbody/tr/td/div[1]/div[1]/a[1]/div/div/div[2]/div[1]")).click();
    	Thread.sleep(2000);
    }
	@When("click on edit")
	public void ClickOnEdit() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/table[1]/tbody/tr/td[2]/h3/a/span")).click();
		Thread.sleep(2000);
	}
	@When("click on change order of name")
	public void ChangeOrdername() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/form/div[1]/div/div[1]/a")).click();
		Thread.sleep(2000);
	}
	@When ("click on radio button")
	public void ClickOnRadioButton()
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/table/tbody/tr/td/div/form/div[2]/fieldset/label[2]/table/tbody/tr/td[2]/input")).click();
	}
	@When("Enter Saved password")
	public void SavedPassword() throws InterruptedException
	{
		driver.findElement(By.name("save_password")).sendKeys("Mfacebook@123");
		Thread.sleep(2000);
	}
	@When("Click on save changes")
	public void ClickOnSaveChanges() 
	{
		driver.findElement(By.name("save")).click();
	}
}
	
	
     ////////////ACCEPTING FRIEND REQUEST/////////
	/*@Given("open the browser")
	public void Openbrowser()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	@Given("navigate to {string} website")
	public void NavigateToUrl(String s)
	{
		driver.get(s);
	}
	@When("enter a valid email")
   public void EnteraValidEmail()
   {
	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
   }
	@When("enter a valid password")
   public void EnteraValidPassword()
   {
	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
   }
	@When("click on Log in button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.name("login")).click();   	   
   }
    @When ("click on ok")
	public void ClickOk() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		Thread.sleep(2000);
	}
    @When("Click on Find Friends")
    public void FindFriends() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]/strong")).click();
		Thread.sleep(2000);
	}
    
    @When("click on confirm")
    public void ClickonConfirm()
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/table/tbody/tr/td[2]/div[2]/a[1]")).click();
	}
}*/
	
	
	
    ////////////DELETING FRIEND REQUEST/////////
   /*	@Given("open the browser")
   	public void Openbrowser()
   	{
   		ChromeOptions options = new ChromeOptions(); 
   		options.addArguments("disable-notifications");
   		driver=new ChromeDriver(options);
   	driver.manage().window().maximize();
   	}
   	@Given("navigate to {string} website")
   	public void NavigateToUrl(String s)
   	{
   		driver.get(s);
   	}
   	@When("enter a valid email")
      public void EnteraValidEmail()throws InterruptedException
      {
   	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
   	   Thread.sleep(2000);
      }
   	@When("enter a valid password")
      public void EnteraValidPassword()
      {
   	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
      }
   	@When("click on Log in button")
      public void ClickOnLoginbutton()
      {
   	   driver.findElement(By.name("login")).click();   	   
      }
       @When ("click on ok")
   	public void ClickOk()
   	{
   		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
   	}
       @When("Click on Find Friends") 
       public void FindFriends() throws InterruptedException
   	{
   		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]/strong")).click();
   		Thread.sleep(2000);
   	}
       @When("click on delete request")
       public void DeleteRequest() throws InterruptedException
       {
    	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/table/tbody/tr/td[2]/div[2]/a[2]")).click();
    	   Thread.sleep(2000);
       }
}*/
    
       
       
     /////////LIKING POST/////////////
    /*   @Given("open the browser")
      	public void Openbrowser()
      	{
      		ChromeOptions options = new ChromeOptions(); 
      		options.addArguments("disable-notifications");
      		driver=new ChromeDriver(options);
      	driver.manage().window().maximize();
      	}
      	@Given("navigate to {string} website")
      	public void NavigateToUrl(String s)
      	{
      		driver.get(s);
      	}
      	@When("enter a valid email") 
         public void EnteraValidEmail()throws InterruptedException
         {
      	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
      	   Thread.sleep(2000);
         }
      	@When("enter a valid password")
         public void EnteraValidPassword()
         {
      	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
         }
      	@When("click on Log in button")
         public void ClickOnLoginbutton()
         {
      	   driver.findElement(By.name("login")).click();   	   
         }
          @When ("click on ok")
      	public void ClickOk() throws InterruptedException
      	{
      		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
      		Thread.sleep(2000);
      	}  
        @When("Click on like button") 
        public void ClickOnLikeButton() throws InterruptedException
        {
         driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/section/article/footer/div[2]/span[1]/a[1]")).click();
         Thread.sleep(2000);
         driver.close();
        }
}*/
        
        /////////COMMENTING ON POST//////////////////
        /*@Given("open the browser")
      	public void Openbrowser()
      	{
      		ChromeOptions options = new ChromeOptions(); 
      		options.addArguments("disable-notifications");
      		driver=new ChromeDriver(options);
      	driver.manage().window().maximize();
      	}
      	@Given("navigate to {string} website")
      	public void NavigateToUrl(String s)
      	{
      		driver.get(s);
      	}
      	@When("enter a valid email")
         public void EnteraValidEmail() throws InterruptedException
         {
      	   driver.findElement(By.name("email")).sendKeys("gagan3sagar@gmail.com");
      	   Thread.sleep(3000);         }
      	@When("enter a valid password")
         public void EnteraValidPassword()
         {
      	   driver.findElement(By.name("pass")).sendKeys("Mfacebook@123");
         }
      	@When("click on Log in button")
         public void ClickOnLoginbutton()
         {
      	   driver.findElement(By.name("login")).click();   	   
         }
          @When ("click on ok")
      	public void ClickOk() throws InterruptedException
      	{
      		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
      		Thread.sleep(2000); 
      	}
          @When("Click on comment button")
          public void CommentButton()
          {
        	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/section/article/footer/div[2]/a[1]")).click();
          }
          @When("Enter some valid text")
          public void validText()throws InterruptedException
          {
        	  driver.findElement(By.name("comment_text")).sendKeys("God rama is great");
        	  Thread.sleep(2000); 
          }
          @When("click on comment button1")
          public void CommentButton1()throws InterruptedException
          {
        	  driver.findElement(By.xpath("//input[@type='submit']")).click();
        	  Thread.sleep(2000);
        	  driver.close();
          }*/
	
	
