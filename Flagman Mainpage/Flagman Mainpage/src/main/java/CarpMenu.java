import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarpMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШНУРЫ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОВОДКОВЫЙ МАТЕРИАЛ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕСКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГРУЗИЛА")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КОРМУШКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГОТОВЫЕ МОНТАЖИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("МАРКЕРНЫЕ ПОПЛАВКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ МОНТАЖА ОСНАСТКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТ ДЛЯ БОЙЛОВ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАРПОВОЕ ПИТАНИЕ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВЕДРА")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СИТА")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИКАРМЛИВАНИЕ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЭЛЕКТРОННЫЕ СИГНАЛИЗАТОРЫ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("МЕХАНИЧЕСКИЕ СИГНАЛИЗАТОРЫ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСТАВКИ И ДЕРЖАТЕЛИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСАКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("МАТЫ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("САДКИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАРПОВЫЕ НАБОРЫ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("МЕБЕЛЬ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОСУДА")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ФОНАРИ")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СПАЛЬНЫЕ МЕШКИ, ОДЕЯЛА")).click();
        System.out.println(driver.getTitle());
        new CarpMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПАЛАТКИ")).click();
        System.out.println(driver.getTitle());
        driver.quit();

    }

    private static class CarpMainMenu {
        private WebDriver driver;

        public CarpMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_4")).click();
        }
    }
}
