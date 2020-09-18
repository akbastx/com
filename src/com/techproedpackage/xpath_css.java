package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_css {

//    Create a class : xpath_css
//    Create main method and complete the following task. 
//    user goes to http://a.testaddressbook.com/sign_in 
//    Locate the elements of email textbox,password textbox, and signin button 
//    Enter below username and password then click sign in button 
//    Username :  testtechproed@gmail.com 
//    Password : Test1234! 
//    Then verify that the expected user id  testtechproed@gmail.com
//    Sign out from the page

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/akbas/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement emailTextBox=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@type='password']"));
        WebElement submitButton=driver.findElement(By.xpath("//input[@type='submit']"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        submitButton.click();

        String ExpectedID="testtechproed@gmail.com";
        WebElement currentUserId=driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));

        if (currentUserId.getText().equals(ExpectedID)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


        WebElement signOut=driver.findElement(By.xpath("(//a[@class='nav-item nav-link'])[2]"));
        signOut.click();
        //To understand if we signed out, we can find a core element like sign in button to verify
        Thread.sleep(2000);
        //I am checking if signInButton element is visible after clicking on sign out
        WebElement signIn=driver.findElement(By.xpath("//input[@value='Sign in']"));
        //isDispladed() =>>>> This method is used to check is the element is on the page or not. It Returned boolean
        //If the element is on the page, this returns true it the element is not on the page, this returns false.
        if (signIn.isDisplayed()){
            System.out.println("PASSED. YOU ARE IN SING IN PAGE");
        }else{
            System.out.println("FAILED. YOU ARE NOT ON SIGN IN PAGE");
        }
        //Locating the email, password, signin element with CSS locator
        WebElement emailTextCSS=driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordTextCSS=driver.findElement(By.cssSelector("#session_password"));
        WebElement signInCSS=driver.findElement(By.cssSelector("input[type='submit']"));
        Thread.sleep(2000);
        emailTextCSS.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        passwordTextCSS.sendKeys("Test1234!");
        Thread.sleep(2000);
        signInCSS.click();
        driver.close();
    }
}
