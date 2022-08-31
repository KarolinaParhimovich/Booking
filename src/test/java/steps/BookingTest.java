package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = {"C:\\Users\\parhi\\Desktop\\задачи курсов\\lesson10\\Booking\\src\\test\\resources\\feature\\search.feature"},
            glue = "steps",
            plugin = { "pretty", "html:target/cucumber.html",
                    "json:target/cucumber.json"}
    )
    public class BookingTest extends AbstractTestNGCucumberTests {
    }

