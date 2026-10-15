# Sistema de Gestión de Impresoras

## Descripción

Este proyecto consiste en un sistema de gestión de impresoras desarrollado en Java. Permite simular el funcionamiento de dos tecnologías de impresión: impresoras láser e impresoras de tinta.

El objetivo principal es aplicar programación orientada a objetos mediante clases abstractas, herencia y polimorfismo, controlando el consumo de los insumos y el estado de cada dispositivo.

## Funcionamiento

### Clase abstracta `Impresor`

Representa la estructura común de todas las impresoras.

**Atributos:**

* `modelo`: nombre o modelo de la impresora.
* `resolucion`: resolución de impresión expresada en DPI.

**Métodos principales:**

* `getModelo()`: devuelve el modelo de la impresora.
* `getResolucion()`: devuelve la resolución.
* `imprimirDocumento(String documento)`: método abstracto que cada tipo de impresora implementa según su tecnología.
* `mostrarEstado()`: método abstracto que permite consultar el estado de los consumibles.

### Clase `ImpresoraLaser`

Representa una impresora láser.

**Características:**

* Controla el nivel de tóner disponible.
* Permite indicar si imprime a color o en blanco y negro.
* Rechaza la impresión cuando el tóner está agotado.
* Consume un 10 % de tóner por cada impresión exitosa.
* Informa el modelo, la resolución y el nivel restante de tóner.

### Clase `ImpresoraTinta`

Representa una impresora de inyección de tinta.

**Características:**

* Controla los niveles de tinta negra y de color.
* Rechaza la impresión si cualquiera de los dos cartuchos está agotado.
* Consume un 15 % de tinta negra y un 5 % de tinta de color por cada impresión exitosa.
* Informa el modelo, la resolución y los niveles de ambos cartuchos.

### Clase `Main`

Contiene el método principal del programa y administra las impresoras mediante una lista de tipo `List<Impresor>`.

El programa realiza las siguientes operaciones:

1. Crea una impresora láser HP LaserJet y una impresora de tinta Epson EcoTank.
2. Muestra el estado inicial de ambas impresoras.
3. Ejecuta tres rondas de impresión con distintos documentos.
4. Muestra el estado final de los consumibles.

## Ejemplo de funcionamiento

Durante la ejecución se observa cómo disminuyen los niveles de los consumibles después de cada impresión exitosa.

* **HP LaserJet:** comienza con un 20 % de tóner y consume un 10 % por trabajo. Puede imprimir los dos primeros documentos, pero rechaza el tercero porque el tóner queda agotado.
* **Epson EcoTank:** comienza con un 30 % de tinta negra y un 10 % de tinta de color. Puede imprimir los dos primeros documentos. Después de la segunda impresión, la tinta de color llega al 0 %, por lo que rechaza la tercera.

Al finalizar, el programa muestra los niveles restantes de cada impresora.

## Conceptos de programación utilizados

* **Clases abstractas:** `Impresor` define los atributos y métodos comunes.
* **Herencia:** `ImpresoraLaser` e `ImpresoraTinta` heredan de `Impresor`.
* **Polimorfismo:** una lista de tipo `List<Impresor>` permite almacenar y utilizar distintos tipos de impresoras.
* **Sobrescritura de métodos:** `@Override` permite implementar el comportamiento específico de cada tecnología.
* **Encapsulamiento:** los consumibles se gestionan mediante atributos privados en las clases concretas.
* **Métodos abstractos:** obligan a cada impresora a definir cómo imprime y cómo muestra su estado.
* **Colecciones:** `ArrayList` almacena los dispositivos que administra el programa.
* **Control de estado:** los niveles de los consumibles cambian con cada impresión exitosa.
* **Validaciones:** el sistema impide imprimir cuando falta alguno de los consumibles necesarios.

## Tecnologías utilizadas

* Java.
* Programación Orientada a Objetos (POO).
* Colecciones de Java (`List` y `ArrayList`).
* IntelliJ IDEA como entorno de desarrollo.

## Ejecución

<img width="855" height="582" alt="image" src="https://github.com/user-attachments/assets/4ccf48d8-62b9-484f-9e08-88f39b6faf67" />

## Conclusión

Este ejercicio demuestra cómo utilizar clases abstractas y herencia para representar dispositivos con características comunes y comportamientos específicos. El polimorfismo permite administrar diferentes tipos de impresoras de forma uniforme, mientras que el control de consumibles simula situaciones reales de uso.
