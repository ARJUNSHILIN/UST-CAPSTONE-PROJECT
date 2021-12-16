package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Definitions {
public WebDriver driver;
public static String path = "C:\\\\Users\\\\Vishnu sathyan\\\\Desktop\\\\SDET\\\\JAR FILES\\\\chromedriver_win32\\\\chromedriver.exe";

		
		@Given("navigate to home page of urban ladder website")
		public void navigate_to_home_page_of_urban_ladder_website() {
			System.setProperty("webdriver.chrome.driver",path);	
			driver=new ChromeDriver();
			driver.get("https://www.urbanladder.com/");
			driver.manage().window().maximize();
		}
		
		@Then("login to urban ladder site")
		public void login_to_urban_ladder_site() throws InterruptedException {
			 driver.findElement(By.xpath("//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.linkText("Log In")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input")).sendKeys("abc1111@gmail.com");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")).sendKeys("Fk#mM!wGS9jvx4Z");
			  driver.findElement(By.id("ul_site_login")).click();
			  System.out.println("Login succesfull");
		}
		
		@Then("Navigate to module deals of the week")
		public void navigate_to_module_deals_of_the_week() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Fabric Sofas")).click();
			System.out.println("Naviagated to Fabric sofas page");			
		}
		
		@Then("filter by brand")
		public void filter_by_brand() throws InterruptedException {
			  driver.findElement(By.xpath("//*[@id='filters-form']/div[1]/div/div/ul/li[4]/div[1]/div")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("filters_brand_name_By_Urban_Ladder")).click();
		}
		
		@Then("filter by color")
		public void filter_by_color() throws InterruptedException {
			Thread.sleep(6000);
			  driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[3]/div[1]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("filters_primary_colors_Greens")).click();
			  Thread.sleep(2000);
			  driver.close();
		}

		
		
		
		
		
}