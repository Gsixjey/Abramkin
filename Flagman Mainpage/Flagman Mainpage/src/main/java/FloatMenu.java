import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FloatMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕСКА")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГОТОВЫЕ ОСНАСТКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОПЛАВКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("САДКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСАКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ МОНТАЖА")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("НАСАДКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИКОРМКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСТАВКИ И ДЕРЖАТЕЛИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПЛАТФОРМЫ, КРЕСЛА И ОБВЕС")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗАБРОС ПРИКОРМКИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВЕДРА")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СИТА")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОЛОТЕНЦА")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТЫ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("НАБОРЫ ДЛЯ ПОПЛАВОЧНОЙ ЛОВЛИ")).click();
        System.out.println(driver.getTitle());
        new FloatMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗАПЧАСТИ И УХОД")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    private static class FloatMainMenu {
        private WebDriver driver;

        public FloatMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_5")).click();
        }
    }
}
