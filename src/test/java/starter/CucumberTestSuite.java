package starter;

import io.cucumber.junit.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.*;
import org.junit.runner.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features"
)
public class CucumberTestSuite {

}

