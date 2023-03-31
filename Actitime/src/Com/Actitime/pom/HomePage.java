package Com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//decleration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy (xpath="//div[.'Reports']")
	private WebElement reportLnk;
	
	@FindBy (xpath= "//div[.='Users']")
	private WebElement userLnk;
	
	@FindBy (id="logoutLink")
	private WebElement logoutnk;
	
	
	//Intialization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getTasklnk() {
		return tasklnk;
	}
	public WebElement getReportLnk() {
		return reportLnk;
	}
	public WebElement getUserLnk() {
		return userLnk;
	}
	public WebElement getLogoutnk() {
		return logoutnk;
	}
	
}
