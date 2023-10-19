package Runner;


import Pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features"
        ,glue={"StepsDefinitions","Hooks"}
)
public class CucumberRunerTest {

}
