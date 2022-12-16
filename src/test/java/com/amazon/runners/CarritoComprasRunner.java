package com.amazon.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/carritoCompras.feature",
        glue = "com.amazon.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CarritoComprasRunner {

}
