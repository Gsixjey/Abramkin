import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TourismMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("МЕБЕЛЬ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ ПИКНИКА")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГАЗОВОЕ ОБОРУДОВАНИЕ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ФОНАРИ И ЛАМПЫ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПАЛАТКИ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗОНТЫ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДУШКИ НАДУВНЫЕ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СПАЛЬНЫЕ МЕШКИ, ОДЕЯЛА")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("САМОНАДУВАЮЩИЕСЯ КОВРИКИ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("РЮКЗАКИ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТЕРМОСУМКИ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗАЩИТА ОТ НАСЕКОМЫХ")).click();
        System.out.println(driver.getTitle());
        new TourismMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СОПУТСТВУЮЩИЕ ТОВАРЫ")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    private static class TourismMainMenu {
        private WebDriver driver;

        public TourismMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_8")).click();
        }
    }
}
