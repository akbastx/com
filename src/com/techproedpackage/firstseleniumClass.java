package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/akbas/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=w8faYC7NDuM");
        






    }
}
