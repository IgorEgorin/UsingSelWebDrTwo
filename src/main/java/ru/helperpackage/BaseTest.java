package ru.helperpackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {


    protected WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("\nMethod set up");
        driver = new ChromeDriver();


    }

    @After
    public void quit() {
        System.out.println("\nMethod tear down");
        driver.quit();
    }
}
