package customTests

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:src/test/resources/customTests"),
  glue= Array("classpath:customTests"),
  plugin =  Array("pretty","html:target/test-report.html")
)
class Runner {
}
