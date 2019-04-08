import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalArea {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flagman.kiev.ua/");
        System.out.println(driver.getTitle());
        driver.get("https://my.flagman.kiev.ua/signin/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("u_phone")).sendKeys("380676638806");
        driver.findElement(By.id("u_pass")).sendKeys("Serega1206");
        driver.findElement(By.id("u_pass")).sendKeys(Keys.RETURN);
    }
}
