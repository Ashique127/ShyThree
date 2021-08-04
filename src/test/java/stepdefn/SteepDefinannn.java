package stepdefn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SteepDefinannn {

	WebDriver driver;

	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Then("^open amazon url and customer is on home page$")
	public void open_amazon_url_and_customer_is_on_home_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(2500);

	}

	@Then("^customer enters a product name Phone$")
	public void customer_enters_a_product_name_Phone() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		Thread.sleep(1000);

	}

	@Then("^customer hits Enter search box$")
	public void customer_hits_Enter_search_box() throws Throwable {
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);

	}

	@Then("^customer select Samsung Brand$")
	public void customer_select_Samsung_Brand() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"p_89/SAMSUNG\"]/span/a/span")).click();
		Thread.sleep(1000);
	}

	@Then("^customer select specific model$")
	public void customer_select_specific_model() throws Throwable {

		driver.findElement(By.xpath("//img[@alt='Samsung Galaxy S10, 128GB, Prism White - Fully Unlocked (Renewed)']"))
				.click();
		Thread.sleep(1000);

	}

	@Then("^customer add to cart$")
	public void customer_add_to_cart() throws Throwable {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}

}
