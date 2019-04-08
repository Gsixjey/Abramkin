import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EquipmentMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КОСТЮМЫ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КУРТКИ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("РЕГЛАНЫ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТЕРМОБЕЛЬЕ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШТАНЫ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("НОСКИ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ОБУВЬ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГОЛОВНЫЕ УБОРЫ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("РУБАШКИ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ФУТБОЛКИ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОЛЯРИЗАЦИОННЫЕ ОЧКИ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЖИЛЕТЫ")).click();
        System.out.println(driver.getTitle());
        new EquipmentMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПЕРЧАТКИ")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    private static class EquipmentMainMenu {
        private WebDriver driver;

        public EquipmentMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("icon-menu_item_9")).click();
        }
    }
}
