import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katalog {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УДИЛИЩА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КАТУШКИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛЕСКА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ШНУРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ГОТОВЫЕ ОСНАСТКИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОПЛАВКИ И МАРКЕРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВСЕ ДЛЯ МОНТАЖА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТЫ ДЛЯ БОЙЛОВ И ПЕЛЛЕТСА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("КРЮЧКИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИМАНКИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИКОРМКИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПРИКАРМЛИВАНИЕ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ВЕДРА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СИТА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСТАВКИ И ДЕРЖАТЕЛИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЭЛЕКТРОННЫЕ СИГНАЛИЗАТОРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("МЕХАНИЧЕСКИЕ СИГНАЛИЗАТОРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДСАКИ И БАГРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("САДКИ, КУКАНЫ И КАНЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("УХОД ЗА КАРПОМ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТРАНСПОРТИРОВКА И ХРАНЕНИЕ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗОНТЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПЛАТФОРМЫ, КРЕСЛА И ОБВЕС")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ОДЕЖДА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОЛОТЕНЦА")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ИНСТРУМЕНТЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("CYBERFISHING")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ТУРИЗМ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЛОДКИ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЭХОЛОТЫ, НАВИГАТОРЫ И АКСЕССУАРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗИМНЯЯ ЛОВЛЯ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("АКЦИОННЫЕ НАБОРЫ")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ПОДАРОЧНЫЕ СЕРТИФИКАТЫ FLAGMAN")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("ЗАПЧАСТИ И УХОД")).click();
        System.out.println(driver.getTitle());
        new KatalogMainMenu(driver).invoke();
        driver.findElement(By.partialLinkText("СУВЕНИРНАЯ ПРОДУКЦИЯ")).click();
        System.out.println(driver.getTitle());
        driver.get("https://www.flagman.kiev.ua/");
        driver.quit();





    }

    private static class KatalogMainMenu {
        private WebDriver driver;

        public KatalogMainMenu(WebDriver driver) {
            this.driver = driver;
        }

        public void invoke() {
            driver.get("https://www.flagman.kiev.ua/");
            driver.findElement(By.className("main-menu_image")).click();
        }
    }
}
