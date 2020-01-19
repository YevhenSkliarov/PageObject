package com.it.tests;

import com.it.pages.DashboardPage;
import com.it.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MyTest {

    /*@Test(priority = 4)
    public void testName() {
        System.out.println("test");
    }

    @Test(priority = 2, dependsOnGroups = {"test"})
    public void testName1() {
        System.out.println("test1");
        Assert.assertTrue(false);
    }

    @Test(description = "", dependsOnMethods = {"testName1", "testName"}, alwaysRun = true)
    public void testName2() {
        System.out.println("test2");
    }

    @Test(groups = "test")
    public void testName3() {
        System.out.println("test3");
    }

    @BeforeClass
    public void before() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void after() {
        System.out.println("AfterClass");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod");
    }

    //#2
    @DataProvider(name = "myDataProvider")
    public static Object[][] getCandidateLocalesData() {
        return new Object[][]{{2, 2, 4}, {3, 3, 7}, {4, 4, 8}};
    }

    @Test(dataProvider = "myDataProvider", invocationTimeOut = 1000)
    public void test4(int a, int b, int c) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(a + b, c);
    }

    @Test(dataProvider = "myDataProvider", invocationCount = 5)
    public void test5(int a, int b, int c) {
        Assert.assertEquals(a + b, c);
    }

    @Test(threadPoolSize = 10, invocationCount = 10)
    public void test6() {
        System.out.println(Thread.currentThread().getName());
        Assert.assertTrue(true);
    }

    @Test
    public void getGitHub() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/");
        driver.quit();
    }*/

    static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println(driver.manage().getCookies());
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.switchTo().activeElement();//switchTo - working with iframe
        driver.get("https://www.i.ua/");
    }


    @Test
    public void test10() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("ittest2", "337774a");
        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertEquals(dashboardPage.getLblUserEmail(), "ittest2@i.ua");
        driver.quit();
    }
}
