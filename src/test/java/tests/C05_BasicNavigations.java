package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
// Invoke Chrome Browser
        WebDriver driver =new ChromeDriver();
// Open URL: https: https://www.w3schools.com/
        driver.get("https://www.w3schools.com/");
// Maximize the window.
// Print the position and size of the page.
// Minimize the page.
// Wait 7 seconds in the icon state and maximize the page.
// Print the position and dimensions of the page in maximized state.
// Make the page fullscreen.
// Close the Browser.



        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Position: " + driver.manage().window().getPosition());
        System.out.println("Size: " + driver.manage().window().getSize());
        driver.manage().window().minimize();

        Thread.sleep(7000);

        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("New Position: " + driver.manage().window().getPosition());
        System.out.println("New Size: " + driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
}
