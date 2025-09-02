package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class C04_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        ;// Go to the w3school URL : https://www.w3schools.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
//        System.out.println("Position: " + driver.manage().window().getPosition());
//        System.out.println("Size: " + driver.manage().window().getSize());
//        Thread.sleep(2000);
//        driver.manage().window().setPosition(new Point(50,50));
//        driver.manage().window().setSize(new Dimension(600,600));
//        Thread.sleep(2000);
//        System.out.println("New Position: " + driver.manage().window().getPosition());
//        System.out.println("New Size: " + driver.manage().window().getSize());
//        Thread.sleep(2000);
//        driver.quit();

        int hight = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("Height: " + hight);
        System.out.println("Width: " + width);

        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        Thread.sleep(2000);
                driver.manage().window().setPosition(new Point(490,10));

        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(1372,1100));

        Thread.sleep(2000);



       int newHight = driver.manage().window().getSize().getHeight();
        int newWidth = driver.manage().window().getSize().getWidth();

        Thread.sleep(2000);
      int  newX = driver.manage().window().getPosition().x;

        Thread.sleep(2000);
      int   newY = driver.manage().window().getPosition().y;
        Thread.sleep(2000);
        System.out.println("New Height: " + driver.manage().window().getSize().getHeight());
        System.out.println("New Width: " + driver.manage().window().getSize().getWidth());
        System.out.println("New X: " + driver.manage().window().getPosition().getX());
        System.out.println("New Y: " + driver.manage().window().getPosition().getY());
        Thread.sleep(2000);




        if (hight==1372 && width==1265 && x==10 && y==10){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        if(newHight==600 && newWidth==1372 && newX==190 && newY==10){
            System.out.println("New Test PASSED");
        }else {
            System.out.println("New Test FAILED");
        }
        driver.quit();
    }

}
