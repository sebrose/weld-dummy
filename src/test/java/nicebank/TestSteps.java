package nicebank;

import cucumber.api.java.en.Given;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TestSteps {
    @Inject
    Funky funky;   // This never gets injected

/*  This gives me the error "cucumber.runtime.CucumberException: class nicebank.TestSteps doesn't have an empty constructor. If you need DI, put cucumber-picocontainer on the classpath
"
    @Inject
    public TestSteps(Funky f){
        funky = f;
    }
*/

    @Given("^I am very funky$")
    public void i_am_very_funky() throws Throwable {
        System.out.println("I am "+ funky.funky());
    }
}
