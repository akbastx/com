package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/akbas/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("porcelain teapot"+ Keys.ENTER);

        WebElement searchResultElement=driver.findElement(By.xpath("//div[@id='result-stats']"));
        String searchResultText=searchResultElement.getText().substring(6,16);
        System.out.println(searchResultText);

        WebElement shopping=driver.findElement(By.linkText("Shopping"));
        shopping.click();

        WebElement homepage=driver.findElement(By.linkText("Home"));
        homepage.click();





    }
}
