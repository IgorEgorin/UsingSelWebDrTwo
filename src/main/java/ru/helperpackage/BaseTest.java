package ru.helperpackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.PagesClasses.PageMain;
import ru.PagesClasses.PageMercedes;

public class BaseTest {


    public static WebDriver driver;
    public static PageMercedes pageMercedes;
    public static PageMain pageMain;



    @Before
    public void setUp() {
        System.out.println("\nMethod set up");
        driver = new ChromeDriver();
        pageMercedes = new PageMercedes(driver);
        pageMain = new PageMain(driver);

    }

    @After
    public void quit() {
        System.out.println("\nMethod tear down");
        driver.quit();
    }
}
