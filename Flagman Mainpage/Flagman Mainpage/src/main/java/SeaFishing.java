import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SeaFishing {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕСКА")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТЫ")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШНУРЫ")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ МОНТАЖА")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИМАНКИ")).click();
        System.out.println(driver.getTitle());
        new SeaMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    private static class SeaMainMenu {
        private WebDriver driver;

        public SeaMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_7")).click();
        }
    }
}
