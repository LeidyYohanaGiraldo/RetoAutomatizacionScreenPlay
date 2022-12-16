package com.amazon.stepDefinitions;

import com.amazon.questions.ValidacionRegistro;
import com.amazon.task.Registro;
import com.amazon.userInterfaces.RegistroPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor pepito = Actor.named("pepito");

    private RegistroPage registroPage = new RegistroPage();



    @Before
    public void configuracion() {
        pepito.can(
                BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario se encuentre en la pagina web en el modulo de registro$")
    public void elUsuarioSeEncuentreEnLaPaginaWebEnElModuloDeRegistro() {
        pepito.wasAbleTo(
                Open.browserOn(registroPage)
        );
    }

    @Cuando("^digite los datos del formulario de registro$")
    public void digiteLosDatosDelFormularioDeRegistro() {
        pepito.attemptsTo(
                Registro.informacion()
        );
    }

    @Entonces("^el visualizara un mensaje de comprobacion$")
    public void elVisualizaraUnMensajeDeComprobacion() {
        pepito.should(seeThat("El puede ver un mensaje de comprobacion",
                ValidacionRegistro.validarRegistro(), Matchers.equalTo(true)));

    }
}
