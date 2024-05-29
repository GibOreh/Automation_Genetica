package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Test.MainSelenium.driver;

public class HomePage {
    //    await new Promise(res => setTimeout(res, 10000)); debugger;//*[contains(@class,"suggestion")]/*[contains(text(), "Việt Nam")]/*
    public static String count = "//form[@id='flight_search_form']//input[@id='flight_passenger']";
    public static String departureDatePicker = "//div[@class='search-form__content__date']//div[@class='search-form__content__date__input']";//    //*[contains(text(),"1008K")]/parent::a
    public static String returnDatePicker = "//*[@class=\"search-form__content__date__input\"]/input[@id=\"returning_date_flight\"]";
    public static String departure = "//td[contains(@data-handler,\"selectDay\")][1]";
    public static String returnDate = "//span[@class='ui-datepicker-price ui-datepicker-price-2-6']";
    public static String searchBtn = "//div[@class='search-form__content__button']//button[@id='search_button']";
    public static String flight_from = "//div[@class='frm-flight-from search-form__content__des search-form__content__des--flight']//input[contains(@class,'form-control des-input flight_from')]";
    public static String suggestion_flight_from_value = "//li[@class='col-xs-6 col-sm-3 li-item-des des-chd flight_from_2']//strong[contains(text(),'Hà Nội')]";
    public static String suggestion_flight_to_value = "//*[contains(@class,\"flight_to_domestic\")]//*[contains(text(),\"Hồ Chí Minh\")]";
    public static String accompanied_children = "(//div[@type='button'])[16]/parent::span";

    public static void click_flight_from() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(flight_from)))).click();
    }

    public static void click_suggestion_flight_from_value() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(suggestion_flight_from_value)))).click();
    }

    public static void click_suggestion_flight_to_value() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(suggestion_flight_to_value)))).click();

    }

    public static void click_departure_date_picker() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(departureDatePicker)))).click();

    }

    public static void click_departure_date_picker_value() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(departure)))).click();
    }

    public static void click_return_date_picker() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(returnDatePicker)))).click();
    }

    public static void click_return_date_picker_value() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(returnDate)))).click();
    }

    public static void click_counter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(count)))).click();

    }

    public static void click_searchBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(searchBtn)))).click();

    }

    public static void add_accompanied_children() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(accompanied_children)))).click();

    }


}
