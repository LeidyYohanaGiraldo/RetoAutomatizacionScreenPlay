package com.amazon.exceptions;

public class ResultadoNoEsperado extends AssertionError{
    public static final String PRODUCTO_AGOTADO = " Producto fuera de stock";
    public static final String CANTIDAD_PRODUCTO = "No existe la cantidad requerida";
    public static final String NO_DISPONIBLE = "No disponible por el momento";


    public ResultadoNoEsperado(String message){super(message);
    }

    public ResultadoNoEsperado(String message, Throwable cause){
        super(message, cause);

    }
}

