import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by cristian on 10/10/16.
 */


@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", snippets = SnippetType.CAMELCASE,features="src/test/resources", monochrome = true, dryRun = true)
public class TesteHorarios {

}
