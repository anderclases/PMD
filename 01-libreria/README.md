# 01-libreria

Se debe desarrollar un sistema de gestión de libros.

---

## Parte 1 clases (3 puntos)
- Crea una interface Producto, todos los productos tienen un precio (Double).
    - Tiene la función esCaro():Boolean **1 punto**.
    - Tiene la función precioConIva, aplica un incremento de precio del 21%.
- Crea clase Libro(titulo,publicacion,precio) con funciones esCaro y toString **1 punto**.
- Crea la clase LibroDigital(titulo,publicacion,precio,sizeArchivoMB,formato) **1 punto**.

Las clases cumplen estas condiciones.
- Todos los libros se consideran productos.
- El libro digital hereda de libro.

## Parte 2 extensión (1 punto)
- Crea una función de extensión Boolean.aRespuesta():String, en caso de True dice "SI" en caso de False dice "NO". **0,5 puntos**.
- Crea otra función de extensión libremente y pruebala en cualquier lado de tu código, deja un comentario en MainActivity de donde encontrarlo. **0,5 puntos**

## Parte 3 funcional (6 puntos)
- Este sistema dispone de una lista de libros que se puede visualizar en la ventana. **1 punto**
- Se puede visualizar cada uno de los elementos de la lista por individual .**1 punto**
- Hay un botón añadir libro, para poder crear nuevos libros que se añadan a la lista.
    - El formulario se conecta correctamente con el ViewModel. **1 punto**
    - Se validan los datos del fomulario  y se muestra un error en caso de datos incorrectos. **1 punto**
    - Se pueden crear libros digitales y Libros normales. **1 punto**
- Desarrolla un botón para pruebas, que introduce a la lista datos para pruebas, en caso de que sea necesaria probar alguna funcionalidad que no se prueba a nivel de ventana se puede probar mediante este botón y usar Text o MyLog para visualizar los resultados. **1 punto**

---

El proyecto debe disponer de un sistema que gestione la navegación entre ventanas y cada ventana debe permitir navegar a otra ventana, en caso de no cumplir **-1 punto**