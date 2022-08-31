package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ResultPage {
    private final String HOTEL_XPATH = "//div[text()='%s']";
    private final String RATING_XPATH = "//div[text()='%s']";

    public boolean checkName(String hotelName) {
        String nameXpath = String.format(HOTEL_XPATH, hotelName);
        return $(By.xpath(nameXpath)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
    public boolean checkRating(String rating) {
        String ratingXpath = String.format(RATING_XPATH, rating);
        return $(By.xpath(ratingXpath)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

}
