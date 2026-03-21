import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestForm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///D:/Devops_ca2/feedback.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        System.out.println("Page Title: " + driver.getTitle());

        driver.findElement(By.id("name")).sendKeys("Janhavi");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");

        Select dept = new Select(driver.findElement(By.id("department")));
        dept.selectByVisibleText("CSE");

        driver.findElement(By.xpath("//input[@value='Female']")).click();

        driver.findElement(By.id("comments"))
              .sendKeys("This is a very good feedback form with proper validation and usability features");

        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        Thread.sleep(60000); // keep browser open for 10 sec

        // driver.quit();  // removed so browser stays open
    }
}