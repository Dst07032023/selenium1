package com.alexandr.practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndysPizza {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://supraten.md/");

        driver.findElement(By.id("text-search")).sendKeys("clei" + Keys.ENTER);

        String expectedTitle = "clei";
        String actualTitle = driver.getTitle();

        if (actualTitle.endsWith(expectedTitle)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

    }
}
