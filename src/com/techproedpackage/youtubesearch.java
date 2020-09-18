package com.techproedpackage;

import javafx.scene.web.WebEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class youtubeSearch {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/akbas/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < 20; i++) {
            driver.get("https://www.youtube.com/watch?v=hgfOB5FTIKk");
            WebElement playButton= driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
            playButton.click();
        }

    }
}