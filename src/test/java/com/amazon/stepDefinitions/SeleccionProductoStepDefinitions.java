package com.amazon.stepDefinitions;

import com.amazon.exceptions.ResultadoNoEsperado;
import com.amazon.questions.ValidacionProductos;
import com.amazon.task.SeleccionProducto;
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

public class SeleccionProductoStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor pepito = Actor.named("pepito");

    private RegistroPage registroPage = new RegistroPage();



    @Before
    public void configuracion() {
        pepito.can(
                BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario se encuentre en la pagina web$")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        pepito.wasAbleTo(
                Open.browserOn(registroPage)
        );
    }

    @Cuando("^seleccione productos de la categoria computadores podra agregarlos al carrito de compras$")
    public void seleccioneProductosDeLaCategoriaComputadoresPodraAgregarlosAlCarritoDeCompras() {
        pepito.attemptsTo(
                SeleccionProducto.dataSeleccion()
        );
    }

    @Entonces("^el visualizara los productos seleccionados en el carrito$")
    public void elVisualizaraLosProductosSeleccionadosEnElCarrito() {
        pepito.should(seeThat("El puede ver los productos del carrito de compras",
                ValidacionProductos.validarCarrito(),
                Matchers.equalTo(true)).orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.PRODUCTO_AGOTADO));

    }

}
