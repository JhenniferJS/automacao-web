package br.inatel.s206.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:/features"},
        glue = {"br.inatel.s206.test.step"},
        plugin = {"pretty", "html:target/cucumber/relatorio.html"}
)
public class TestWebRunner {

}
