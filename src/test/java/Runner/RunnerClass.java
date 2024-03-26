package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\LENOVO\\eclipse-workspace\\org.dominos\\src\\test\\java\\Feature\\feature.feature",
glue = "",dryRun = false)
public class RunnerClass {
	
	public static WebDriver driver1;	
	@BeforeClass
	public static void start() {
		driver1= new ChromeDriver();

	}

}
