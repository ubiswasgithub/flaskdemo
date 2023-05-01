package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeSteps {

	WebDriver driver;

	@Given("User is at the home page")
	public void user_is_at_the_home_page() {

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");

		driver = new EdgeDriver();
		driver.get("http://localhost:5000/");

	}

	@Then("User can see the welcome title as {string}")
	public void user_can_see_the_welcome_title_as(String string) {
		String title = driver.findElement(By.cssSelector("h1")).getText();

		Assert.assertTrue(title.equalsIgnoreCase(string));
		driver.quit();
	}

}
