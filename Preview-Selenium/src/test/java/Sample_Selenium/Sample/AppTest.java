package Sample_Selenium.Sample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class AppTest {

	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();// set the browser as chrome broswer
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");// browser will go to this specific website
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		assertEquals("Web form", driver.getTitle());
		WebElement textBox = driver.findElement(By.name("my-text"));
		textBox.sendKeys("Selenium");
		Thread.sleep(4000);
		WebElement submitButton = driver.findElement(By.cssSelector("button"));
		submitButton.click();
		Thread.sleep(4000);
		WebElement message = driver.findElement(By.id("message"));
		Thread.sleep(4000);
		assertEquals("Received!", message.getText());

		driver.navigate().back();
		Thread.sleep(4000);
		WebElement randomlyInput = driver.findElement(By.name("my-readonly"));
		WebElement DisabedInput = driver.findElement(RelativeLocator.with(By.tagName("input")).above(randomlyInput)); // Relative
																														// Locator
		Thread.sleep(4000);
		assertFalse(DisabedInput.isEnabled());

		WebElement selectElement = driver.findElement(By.name("my-select"));
		Thread.sleep(4000);
		Select dropDownSelect = new Select(selectElement);// Select Class
		dropDownSelect.selectByIndex(1);
		Thread.sleep(4000);
		dropDownSelect.selectByValue("2");
		Thread.sleep(4000);
		dropDownSelect.selectByVisibleText("Three");
		Thread.sleep(4000);

		WebElement checkBox = driver.findElement(By.name("my-check"));
		Thread.sleep(4000);
		assertTrue(checkBox.isSelected());
		Thread.sleep(4000);
	}

}
