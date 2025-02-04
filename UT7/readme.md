## Ejemplo 1 
Ejemplo donde se utilizan atributos  con modificador de accesibilidad private en la superclase, para ver cómo se accede a ellos a través de métodos public (ya que los atributos no son accesibles directamente desde las subclases)

## Ejemplo2

Clase Producto:

Contiene atributos comunes a todos los productos (nombre y precio).
Tiene un método mostrarInformacion que las subclases pueden extender.

Clase ProductoPerecedero:

Añade el atributo diasParaCaducar.
Incluye el método devolverFechaCaducidad. 

Incluye el método calcularPrecioFinal que calcula un descuento según los días restantes.

Si quedan menos de tres días se hace un descuento del 50%

Si queda menos de un día se hace un 75 % de descuento. 

Clase ProductoNoPerecedero:

Añade el atributo descuento. 

Añade el atributo tipo ( ejemplo   "educativo", "electrónico", etc.).

Tiene un método aplicarPromocion que simula un descuento en el precio.



Clase Principal:
Crea instancias de ambas subclases (ProductoPerecedero y ProductoNoPerecedero).
Muestra la información y llama a los métodos específicos de cada subclase.

## Ejercicio 3

Crea un sistema para gestionar productos en una tienda.

Define una clase base llamada Producto con los siguientes atributos:

codigo (String, único para cada producto)

nombre (String)

precio (double)

Además, incluye:

El constructor que permite inicializar la instancia conociendo el valor de totos sus atributos. 

Tanto el código como el nombre son atributos obligatorios, aunque está permitido crear una instancia sin que se concozca el precio del producto. 
Se podrá cambiar el precio del producto, sin embargo, no será posible cambiar ni el nombre ni el código, una vez realizada la inicialización del objeto.

Un método calcularDescuento(double porcentaje) que devuelva el precio del producto después de aplicar un descuento.

Sobrescribe el método equals para comparar productos por su codigo.

Crea una subclase llamada ProductoElectronico que extienda Producto con el atributo adicional:

garantia (int, duración en meses)

Sobrecarga el método calcularDescuento para que reciba dos parámetros: un porcentaje y un descuento adicional en euros. 

Este método devuelve el precio después de aplicar ambos descuentos.

Sobrescribe el método equals para comparar productos electrónicos por su codigo y su garantia.

Crea una Tienda que tendrá:

Una  lista de productos y productos electrónicos.De 10 elementos cada una. 

Crea un método que permita añadir un Producto (solamente si no está ya incluido). Utiliza el método equals.

Crea un método que permita añadir un ProductoElectronico (solamente si no está ya incluido). Utiliza el método equals.

Ambos métodos devolverán true si se ha podido añadir el producto (si hay espacio en la lista). 
Completa un método que permita calcularDescuento de un producto, el método tendrá la siguiente firma:

public double calcularDescuentoProducto(Producto producto, double descuento)
public double calcularDescuentoFinalProducto (ProductoElectronico producto, double descuento, double segundoDescuento)

completa un  método que muestre toda la información de la tienda (las dos colecciones de productos con sus datos correspondientes)


En la clase principal, crea una instancia de Tienda  y haz una prueba para añadir productos  (Producto y ProductoElectronico)

Haz una prueba del funcionamiento de hacer el descuento a un producto y el descuento final a  un producto electrónico. 

## Ejemplo 4 - Clases abstractas y herencia

Sistema de Gestión de Productos y Cálculo de Envíos

Vas a desarrollar un sistema en Java que permita gestionar distintos tipos de productos y calcular el coste  de envío en función de sus características. 

Para ello, deberás utilizar el concepto de herencia y clases abstractas.

Requisitos:

Clase abstracta Producto:

Atributos:

String nombre

double peso (en kilogramos)

double alto (en metros)

double ancho (en metros)

double profundidad (en metros)

Métodos:

Constructor para inicializar TODOS  los atributos.

Método concreto double volumen(): calcula el volumen del producto usando sus dimensiones.  V = ALTO  × ANCHO  × PROFUNDIDAD

Método abstracto double calcularCostoEnvio(): debe ser implementado por cada subclase para calcular el costo de envío según las características del producto.

Subclases que heredan de Producto:

a) Clase Electrodomestico:

Atributos adicionales:

Enum tipo (por ejemplo: "Refrigerador", "Lavadora", "Microondas").

boolean esFragil

Implementación del método calcularCosteEnvio():

El costo base se calcula como: (peso * 10) + (volumen() * 50).

Si el electrodoméstico es frágil (esFragil == true), agregar un 20% extra al costo total.

b) Clase Mueble:

Atributos adicionales:

Enum material (por ejemplo: "Madera", "Metal", "Plástico").

boolean requiereMontaje

Implementación del método calcularCostoEnvio():

El costo base se calcula como: (peso * 5) + (volumen() * 30).

Si el mueble requiere montaje (requiereMontaje == true), agregar un costo fijo de 15 euros.

Clase Main:

Crear instancias de Electrodomestico y Mueble.

Mostrar la información de cada producto y su coste de envío.

