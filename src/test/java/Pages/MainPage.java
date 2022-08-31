package Pages;
import Constants.Urls;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final String INPUT_XPATH="//input[@placeholder='%s']";
    private final String BUTTON_XPATH="//span[text()='%s']";

    public void openMainPage(){
        open(Urls.BOOKING_URL);
    }

    public void enteringHotel(String inputName) {
        String inputXpath=String.format(INPUT_XPATH, inputName);
        $(By.xpath(inputXpath)).sendKeys("Cairo Marriott Hotel & Omar Khayyam Casino");
    }

    public void clickSearch(String button) {
        String buttonXpath=String.format(BUTTON_XPATH,button);
        $(By.xpath(buttonXpath)).click();
    }

}
