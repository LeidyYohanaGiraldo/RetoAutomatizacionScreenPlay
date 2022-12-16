#language: es
  Característica: Carrito de compras

    Antecedentes:
      Dado el usuario se encuentre en la pagina web
      Cuando seleccione productos de la categoria computadores podra agregarlos al carrito de compras

      Escenario: Eliminacion exitosa productos carrito de compras
        Cuando elimine los productos del carrito de compras
        Entonces el usuario visualizara el carrito vacio
