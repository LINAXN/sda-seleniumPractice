package com.github.LINAXN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1200,600");
        options.addArguments("window-position=200,100");
        WebDriver driver1 = new ChromeDriver(options);



        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(720, 480));
        driver.manage().window().setPosition(new org.openqa.selenium.Point(50, 50));

        driver.get("https://www.amazon.com/");
        System.out.println("Page loaded successfully");

        String title = driver.getTitle();
        System.out.println("Title: " + title);


        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);


        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);

//        driver.get("https://google.com");
//        driver.navigate().to("https://google.com");
//        driver.navigate().to("https://www.selenium.dev/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        System.out.println("Navigation successful");
        driver.quit();
        }
    }
