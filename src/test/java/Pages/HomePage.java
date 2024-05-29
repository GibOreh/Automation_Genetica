package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage {

    @FindBy(xpath = "//div[@class='frm-flight-from search-form__content__des search-form__content__des--flight']//input[contains(@class,'form-control des-input flight_from')]")
    public WebElement flight_from;

    @FindBy(xpath = "//li[@class='col-xs-6 col-sm-3 li-item-des des-chd flight_from_2']//strong[contains(text(),'Hà Nội')]")
    public static WebElement suggestion_flight_from_value;

    @FindBy(xpath = "//div[@class='search-form__content__date']//div[@class='search-form__content__date__input']")
    public static WebElement departureDatePicker;

    @FindBy(xpath = "//td[contains(@data-handler,\"selectDay\")][1]")
    public static WebElement departure;

    @FindBy(xpath = "//*[@class=\"search-form__content__date__input\"]/input[@id=\"returning_date_flight\"]")
    public static WebElement returnDatePicker;

    @FindBy(xpath = "//span[@class='ui-datepicker-price ui-datepicker-price-2-6']")
    public static WebElement returnDate;

    @FindBy(xpath = "//form[@id='flight_search_form']//input[@id='flight_passenger']")
    public static WebElement counter;

    @FindBy(xpath = "//div[@class='search-form__content__button']//button[@id='search_button']")
    public static WebElement searchBtn;

    @FindBy(xpath = "(//div[@type='button'])[16]/parent::span")
    public static WebElement accompaniedChildren;

    public void click_flight_from() {
        flight_from.click();
    }

    public static void click_suggestion_flight_from_value() {
        suggestion_flight_from_value.click();
    }


    public static void click_departure_date_picker() {
        departureDatePicker.click();
    }

    public static void click_departure_date_picker_value() {
        departure.click();
    }

    public static void click_return_date_picker() {
        returnDatePicker.click();
    }

    public static void click_return_date_picker_value() {
        returnDate.click();
    }

    public static void click_counter() {
        counter.click();
    }

    public static void click_searchBtn() {
        searchBtn.click();
    }

    public static void add_accompanied_children() {
        accompaniedChildren.click();
    }


}
