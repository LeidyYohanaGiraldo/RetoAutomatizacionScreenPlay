package com.amazon.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.userInterfaces.EliminarProductoPage.BTN_ELIMINAR;
import static com.amazon.userInterfaces.EliminarProductoPage.IMGBTN_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(IMGBTN_CARRITO),
                    Click.on(BTN_ELIMINAR),
                    Click.on(BTN_ELIMINAR)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static EliminarProducto dataEliminacion(){
        return instrumented(EliminarProducto.class);
    }
}
