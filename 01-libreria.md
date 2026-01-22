# 01-libreria

Este ejercicio se realiza en dos partes, durante la primera no se pueden abir ni consultar más proyectos, en cambio en la segunda, se pueden abrir proyectos y consultar trabajos.

## Parte 1

1. Crear una interfaz LibroOperaciones con los siguientes métodos:
- infoResumen(): muestra un breve resumen del libro.
- reservarLibro(): indica que el libro ha sido reservado.

2. Definir una clase base Libro que incluya:
- Propiedades: titulo, autor, publicadoEn (año de publicación)
- Método: infoCompleta(): devuelve una descripción completa del libro.

3. Crear una clase LibroDigital que herede de Libro e implemente la interfaz LibroOperaciones
- Agregar una propiedad adicional tamañoArchivo (en MB).
- Sobrescribir el método infoResumen() para incluir el tamaño del archivo.
- Utilizar funciones de scope (como apply o also) para inicializar la clase con datos.

4. Crear una función de extensión para la clase Libro:
- esAntiguo(): determina si el libro fue publicado hace más de 20 años.

5. En la función main:
- Crear instancias de Libro y LibroDigital.
- Usar las funciones de extensión y de scope para modificar e imprimir los detalles de los libros.
- Ejecutar los métodos de la interfaz en el libro digital.