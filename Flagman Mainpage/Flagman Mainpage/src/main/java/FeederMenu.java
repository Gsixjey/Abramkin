import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeederMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШНУРЫ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕСКА")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КОРМУШКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ МОНТАЖА")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИКОРМКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("РОГАТКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("НАСАДКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГОТОВЫЕ ОСТНАСТКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТЫ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПЛАТФОРМЫ, КРЕСЛА И ОБВЕС")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСТАВКИ И ДЕРЖАТЕЛИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВЕДРА")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СИТА")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОЛОТЕНЦА")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("САДКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСАКИ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ФИДЕРНЫЕ НАБОРЫ")).click();
        System.out.println(driver.getTitle());
        new FeederMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗАПЧАСТИ И УХОД")).click();
        System.out.println(driver.getTitle());
        driver.quit();


    }

    private static class FeederMainMenu {
        private WebDriver driver;

        public FeederMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_3")).click();
        }
    }
}
