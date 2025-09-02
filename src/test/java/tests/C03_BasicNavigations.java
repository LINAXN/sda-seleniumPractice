package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        ;// Launch Chrome browser
// Open URL of Website
// Maximize Window
// Get Title of current Page
// Validate/Compare Page Title
// Close Browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");  Thread.sleep(1000);
        driver.manage().window().maximize();  Thread.sleep(1000);
        String title = driver.getTitle();
        System.out.println("Title: " + title);
//        String expectedTitle = "Google";
        if (title.equals("Google")) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED");
        }
        driver.quit();

    }
}
