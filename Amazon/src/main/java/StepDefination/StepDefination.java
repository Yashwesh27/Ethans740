package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination
{	
	public static WebDriver driver;
	
	@Given("^user is on login page$")  // ("^      $") Recomended ^ atostrophe & dollar
	public void loginpage()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of a page is " + title);
		System.out.println("I am in login page");
	}
	
	@When("^user click on username$")
	public void clickusername() 
	{
		
		WebElement Account=  driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Account).build();
		builder.perform();
		System.out.println("Mouse Hover at account");
		//Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\Action.png");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().activeElement(); //moving to another default element
		//driver.findElement(By.xpath("//span[text()='Daily essentials']")).click();		
		driver.findElement(By.xpath("//a[@aria-label='Daily essentials']")).click();	
		//Screenshot(driver, "C:\\Users\\HOME\\Desktop\\Amazon\\Cleaning essentials.png");		
		String title1 = driver.getTitle();
		System.out.println("Title of a page is " + title1);
		JavascriptExecutor j1= (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,900)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("mobiles");
	    //Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\mobiles.png");
		//Thread.sleep(10);
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='nav-search-submit-button']")));
		WebElement SearchButton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\SearchButton.png");
		SearchButton.click();
		System.out.println("I am in clickusername");		
	}
	
	@Then("^user click on Password$")
	public void clickPwd()
	{
		System.out.println("I am in clickPwd");		
	}
	
	@And("^user click on LoginButton$")
	public void loginbutton()
	{
		
		
	}	
}
