package Selenium.Problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	WebDriver driver;

	@BeforeEach 
	void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();// set the browser as chrome broswer
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");// browser will go to this specific website
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test1() throws InterruptedException {
		assertEquals("Web form", driver.getTitle());
		driver.findElement(By.linkText("Return to index")).click();
		Thread.sleep(2000);
		assertEquals("Index of Available Pages", driver.getTitle());
	}

	@Test
	void test2() throws InterruptedException {
		assertEquals("Web form", driver.getTitle());
		WebElement textInput = driver.findElement(By.name("my-text"));
		textInput.sendKeys("Selenium-textInput");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("my-password"));
		password.sendKeys("Selenium-password");
		Thread.sleep(2000);
		WebElement textArea = driver.findElement(By.name("my-textarea"));
		textArea.sendKeys("Selenium-textArea");
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.name("my-select"));
		Select dropDownSelect1 = new Select(select);
		dropDownSelect1.selectByIndex(2);
		Thread.sleep(2000);
		WebElement inputField = driver.findElement(By.name("my-datalist"));
		inputField.sendKeys("Chicago");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.id(("my-check-1")));
		assertTrue(checkBox.isSelected());
		Thread.sleep(2000);
		WebElement radioBox = driver.findElement(By.id(("my-radio-1")));
		assertTrue(radioBox.isSelected());
	}

	@Test
	void test3() throws InterruptedException {
		assertEquals("Web form", driver.getTitle());
		WebElement color = driver.findElement(By.name("my-colors"));
		color.sendKeys("#ffffff");
		Thread.sleep(2000);
		WebElement datePicker = driver.findElement(By.name("my-date"));
		datePicker.sendKeys("11/05/2002");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button")).click();
		WebElement messsage = driver.findElement(By.id("message"));
		Thread.sleep(2000);
		assertEquals("Received!", messsage.getText());
	}
}
