## Ejemplo 1 
Ejemplo donde se utilizan atributos  con modificador de accesibilidad private en la superclase, para ver cómo se accede a ellos a través de métodos public (ya que los atributos no son accesibles directamente desde las subclases)

##Ejemplo2

Clase Producto:

Contiene atributos comunes a todos los productos (nombre y precio).
Tiene un método mostrarInformacion que las subclases pueden extender.

Clase ProductoPerecedero:

Añade el atributo diasParaCaducar.
Incluye el método devolverFechaCaducidad. 

Incluye el método calcularPrecioFinal que calcula un descuento según los días restantes.

Clase ProductoNoPerecedero:

Añade el atributo descuento. 

Añade el atributo tipo ( ejemplo   "educativo", "electrónico", etc.).

Tiene un método aplicarPromocion que simula un descuento en el precio.



Clase Principal:
Crea instancias de ambas subclases (ProductoPerecedero y ProductoNoPerecedero).
Muestra la información y llama a los métodos específicos de cada subclase.
