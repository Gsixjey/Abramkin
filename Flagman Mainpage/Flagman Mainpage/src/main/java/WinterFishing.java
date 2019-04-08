import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinterFishing {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗИМНИЕ УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗИМНИЕ КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗИМНЯЯ ЛЕСКА")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕДОБУРЫ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПЕШНИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИМАНКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИКОРМКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОПЛАВКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КОРМУШКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КИВКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЖЕРЛИЦЫ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШУМОВКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАНЫ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("БАГРЫ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОЛОТЕНЦА")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ОДЕЖДА")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("НАБОРЫ ДЛЯ ЗИМНЕЙ РЫБАЛКИ")).click();
        System.out.println(driver.getTitle());
        new WinterMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗИМНИЕ ПАЛАТКИ")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    private static class WinterMainMenu {
        private WebDriver driver;

        public WinterMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_6")).click();
        }
    }
}
