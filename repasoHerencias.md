# Enunciado 1 - Taller

Crea la interfaz **Trabajo** *(costo: Int, ganancia: Int, diario: Boolean)* - **1 punto**.

Debe tener la función **masCaro(entrada: Trabajo)**, que devuelve `true` el argumento de entrada tiene un costo mayor que el que crea la función.

Crea la clase abstracta **Maquina** *(…, nombre)*, que contiene la función abstracta **sonido()**, la cual devuelve un `String` con el sonido de la máquina.  
Debe tener **tres clases hijas** - **1 punto**.

- **Taladro** *(…)*, su sonido es `"Brrrr"`
- **Compresor** *(…)*, su sonido es `"Pshhh"`
- **Sierra** *(…)*, su sonido es `"Zzzzz"`

La clase **Maquina** tiene la función **imprimir()**, que devuelve el siguiente formato - **1 punto**:
Taladro - rentabilidad: 200.0, nombre: taladro1
Para imprimir el nombre de la clase se debe usar la siguiente línea:
${this::class.simpleName}

---

# Enunciado 2 - Almacen

Se desea desarrollar un **sistema de gestión de un almacén** que permita manejar distintos tipos de productos de forma unificada.

Crea una **interface `Producto`** con los siguientes atributos:

- `nombre : String`
- `peso : Int`
- `cantidad : Int`

Todos los productos del almacén comparten estos metadatos básicos.  
El peso se almacena en **gramos (g)**.

### Método de la interface

La interface `Producto` debe incluir el siguiente método:

- `convertKg()`  
  Devuelve el peso del producto en **kilogramos (kg)**.  
  Esta conversión se realiza dividiendo el peso entre **1000**.

Existen los siguientes tipos de productos, los cuales **implementan la interface `Producto`**:

- **ProductoAlimenticio** `(…, fechaCaducidad)`
- **ProductoElectronico** `(…, garantiaMeses)`
- **ProductoHogar** `(…, material)`

Cada una de estas clases debe:

- Implementar todos los métodos definidos en la interface `Producto`
- La clase **Producto** tiene la función **imprimir()**, que devuelve el siguiente formato - **1 punto**:

## Clase Categoria

Además, se debe crear la clase:

- **Categoria**  
  `(nombreCategoria, descripcion, pasillo, estanteria)`

La clase `Categoria` **no hereda de ninguna otra clase**.

