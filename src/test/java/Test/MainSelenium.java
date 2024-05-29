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
    public static void teststep() {
        HomePage.click_flight_from();
        HomePage.click_suggestion_flight_from_value();
        HomePage.click_suggestion_flight_to_value();
        HomePage.click_departure_date_picker();
        HomePage.click_departure_date_picker_value();
        HomePage.click_return_date_picker();
        HomePage.click_return_date_picker_value();
        HomePage.click_counter();
        HomePage.add_accompanied_children();
        HomePage.click_searchBtn();

    }
    @AfterTest
    public static void Teardown(){
        driver.close();
    }

}
