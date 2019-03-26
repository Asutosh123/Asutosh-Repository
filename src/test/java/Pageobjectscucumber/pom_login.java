package Pageobjectscucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_login extends Basetest {
	
	public pom_login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}




	public WebDriver driver;
	

	
	
	@FindBy(id="email")
	public static WebElement Email;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(xpath="//button[text()='Login']")
	public static WebElement LoginBtn;
	
	
	
	
	  public void login(String un,String pwd)
		 {
			 System.out.println("Un is:"+ un );
			 
			 System.out.println("pwd is:"+ pwd );
			 Email.sendKeys(un);
			 System.out.println("pwd is:"+ pwd );
			 Password.sendKeys(pwd);
			 LoginBtn.click();

}
}