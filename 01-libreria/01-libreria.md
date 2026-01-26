# 01-libreria

Se debe desarrollar un sistema de gestión de libros.

---

## Parte 1 clases (3 puntos)
- Crea una interface Producto que tiene la función esCaro():Boolean **1 punto**.
- Crea clase Libro(titulo,publicacion,precio) con funciones esCaro y toString **1 punto**.
- Crea la clase LibroDigital(titulo,publicacion,precio,sizeArchivoMB,formato) **1 punto**.

## Parte 2 extensión (1 punto)
- Crea una función de extensión Boolean.aRespuesta():String, en caso de True dice "SI" en caso de False dice "NO". **0,5 puntos**.
- Crea otra función de extensión libremente y pruebala en cualquier lado de tu código, deja un comentario en MainActivity de donde encontrarlo. **0,5 puntos**

## Parte 3 funcional (6 puntos)
- Este sistema dispone de una lista de libros que se puede visualizar en la ventana. **1 punto** (**0.5** si la lista no es reactiva)
- Se puede visualizar cada uno de los elementos de la lista por individual .**1 punto**
- Hay un botón añadir libro, que introduce datos en la lista.
    - El formulario se conecta correctamente con el ViewModel. **1 punto**
    - Se validan los datos del fomulario  y se muestra un error en caso de datos incorrectos. **1 punto**
    - Se pueden crear libros digitales y Libros normales. **1 punto**
- Desarrolla un botón para pruebas, que introduce a la lista datos para pruebas y consigue probar las funciones desarrolladas de backend. **1 punto**