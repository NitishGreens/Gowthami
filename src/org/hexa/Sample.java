package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		// to configure
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\k_sur\\eclipse-workspace\\TestNg\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to load the url of the page
		driver.get("https://en-gb.facebook.com/");

		// to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

		// to get the url of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// to quit the browser
		driver.quit();

	}

}
