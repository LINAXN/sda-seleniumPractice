package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        ;// Invoke FireFox Driver
//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
// Go to https://www.youtube.com/

        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
// Maximize the window
        driver.manage().window().maximize();
// Verify the page title contains the word video.
String title = driver.getTitle();
if (title.contains("video")){
    System.out.println("PASSED");
}else {
    System.out.println("FAILED");
}
// Minimize the window
        driver.manage().window().minimize();

// Verify the page title contains the word video.

        if (title.contains("YouTube")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
// Make the page fullscreen
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
// Close the driver.
driver.quit();
    }

}
