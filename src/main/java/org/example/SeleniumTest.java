package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void  main(String[] arg) {
        System.setProperty("webdriver.chrome.driver" , "C:\\DRIVERS\\chromedriver.exe");

        WebDriver  driver = new ChromeDriver();

        driver.get("http://qa2magento.dev.evozon.com/");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();

    }

}
