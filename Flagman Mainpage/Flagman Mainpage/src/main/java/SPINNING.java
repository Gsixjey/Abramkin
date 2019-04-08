import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SPINNING {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШНУРЫ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕСКА")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИМАНКИ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("АТТРАКТАНТЫ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ МОНТАЖА")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОПЛАВКИ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГОТОВЫЕ ОСНАСТКИ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("САДКИ И КУКАНЫ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТЫ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЭКИПИРОВКА")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СПИННИНГОВЫЕ НАБОРЫ")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗАПЧАСТИ И УХОД")).click();
        System.out.println(driver.getTitle());
        new SpinMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛОДКИ")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    private static class SpinMainMenu {
        private WebDriver driver;

        public SpinMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_2")).click();
        }
    }
}
