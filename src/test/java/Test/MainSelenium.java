package Test;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MainSelenium {
    public static WebDriver driver;

    @BeforeTest
    public static void Setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.bestprice.vn/");
    }

    @Test
    public void teststep() {
        HomePage homePage = new HomePage();
        homePage.click_flight_from();
        homePage.click_suggestion_flight_from_value();
        homePage.click_departure_date_picker();
        homePage.click_departure_date_picker_value();
        homePage.click_return_date_picker();
        homePage.click_return_date_picker_value();
        homePage.click_counter();
        homePage.add_accompanied_children();
        homePage.click_searchBtn();

    }
    @AfterTest
    public static void Teardown(){
        driver.close();
    }

}
