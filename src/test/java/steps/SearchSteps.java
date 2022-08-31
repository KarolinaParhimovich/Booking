package steps;
import Pages.MainPage;
import Pages.ResultPage;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.awt.*;


public class SearchSteps {
    MainPage mainPage;
    ResultPage resultPage;

    @Before
    public void setUp() {
        Configuration.timeout = 6000;
        Dimension size
                = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight() - 50;
        Configuration.browserSize = String.format("%dx%d", width, height);
    }

    @Given("Main Booking page opened")
    public void mainBookingPageOpened() {
        mainPage.openMainPage();
    }

    @When("User enters name of hotel in input {string}")
    public void userEntersNameOfHotelInInput(String inputName) {
        mainPage.enteringHotel(inputName);

    }


    @And("Click {string}")
    public void click(String button) {
        mainPage.clickSearch(button);

    }

    @Then("{string} hotel presents on page")
    public void hotelPresentsOnPage(String hotelName) {
        boolean isNameHotelDisplayed = resultPage.checkName(hotelName);
        Assert.assertTrue(isNameHotelDisplayed, "Hotel name was not found");
    }


    @Then("{string} rating is presented")
    public void ratingIsPresented(String rating) {
        boolean isRatingHotelDisplayed = resultPage.checkRating(rating);
        Assert.assertTrue(isRatingHotelDisplayed, "Rating is not 7.6");
    }
}
