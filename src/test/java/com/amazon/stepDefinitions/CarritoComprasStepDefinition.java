package com.amazon.stepDefinitions;


import com.amazon.questions.ValidacionCarritoVacio;
import com.amazon.task.EliminarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CarritoComprasStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor pepito = Actor.named("pepito");




    @Before
    public void configuracion() {
        pepito.can(
                BrowseTheWeb.with(navegador));
    }

    @Cuando("^elimine los productos del carrito de compras$")
    public void elimineLosProductosDelCarritoDeCompras() {

        pepito.attemptsTo(
                EliminarProducto.dataEliminacion()
        );
    }

    @Entonces("^el usuario visualizara el carrito vacio$")
    public void elUsuarioVisualizaraElCarritoVacio() {
        pepito.should(seeThat("El puede ver el carrito vacio",
                ValidacionCarritoVacio.validarCarritoVacio(),
                Matchers.equalTo(true)));



    }

}
