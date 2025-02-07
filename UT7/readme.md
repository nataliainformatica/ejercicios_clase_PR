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


## Ejercicio 5
Enunciado: Sistema de Gestión de Vehículos y Cálculo de Tarifas de Parking

Vas a desarrollar un sistema en Java que permita gestionar distintos tipos de vehículos y calcular tanto su coste de mantenimiento como el precio por hora en un parking, siguiendo criterios similares a los que utilizan los ayuntamientos (como antigüedad, tipo de motor, descuentos para vehículos eléctricos, etc.). Utilizarás herencia, clases abstractas, interfaces y polimorfismo.

Requisitos:

Clase abstracta Vehiculo:

Atributos:

String marca

String modelo

String matricula

int anioFabricacion

double peso (en kilogramos)

Métodos:

Constructor para inicializar todos los atributos.

Método concreto String mostrarInformacion(): muestra la información básica del vehículo.

Método abstracto double calcularCostoMantenimiento(): debe ser implementado por cada subclase para calcular el coste de mantenimiento.

Método abstracto double calcularPrecioHora(): debe ser implementado por cada subclase para calcular el precio por hora en el parking según las características del vehículo.


Interfaz Electrico:

Métodos:

double calcularCostoCarga(): calcula el costo de cargar la batería.

double autonomia(): devuelve la autonomía del vehículo eléctrico en kilómetros.

Subclases que heredan de Vehiculo:

a) Clase Automovil:

Atributos adicionales:

int numeroPuertas

boolean esHibrido

double capacidadCombustible (en litros)

Implementación del método calcularCostoMantenimiento():

El costo base se calcula como: (peso * 0.05) + (capacidadCombustible * 0.1).

Si el automóvil es híbrido (esHibrido == true), reducir el costo total en un 10%.

Implementación del método calcularPrecioHora():

Precio base: 2 euros por hora.

Si el automóvil tiene más de 10 años de antigüedad, añadir un 20% al precio.

Si es híbrido, aplicar un descuento del 15%.

b) Clase BicicletaElectrica (implementa Electrico):

Atributos adicionales:

double capacidadBateria (en kWh)

double consumoPorKm (en kWh/km)

Implementación del método calcularCostoMantenimiento():

El costo base se calcula como: (peso * 0.02).

Agregar un costo fijo de 15 euros por mantenimiento de la batería.

Implementación del método calcularPrecioHora():

Las bicicletas eléctricas tienen parking gratuito.

Implementación de los métodos de Electrico:

calcularCostoCarga(): se calcula como (capacidadBateria * 0.20).

autonomia(): se calcula como (capacidadBateria / consumoPorKm).

Clase Parking:

Atributos:

ArrayList /< Vehiculo />  vehiculosEstacionados

Métodos:

void agregarVehiculo(Vehiculo vehiculo): agrega un vehículo al parking.

void mostrarTarifas(): recorre la lista de vehículos y muestra el precio por hora de cada uno usando polimorfismo.
double calcularRecaudacionTotal(): suma el precio por hora de todos los vehículos estacionados para obtener la recaudación total.

Clase Main:

Crear instancias de Automovil y BicicletaElectrica.

Agregar estas instancias al Parking.

Mostrar la información de cada vehículo, su costo de mantenimiento y su precio por hora.

Mostrar la recaudación total del parking.

Ejercicio adicional: Si el vehículo implementa la interfaz Electrico, mostrar también el costo de carga y la autonomía usando instanceof y casting.


## Ejercicio 5

# Electrodomésticos: práctica guiada que realizaremos en clase juntos. Aprenderemos las clases enumeradas

La primera versión que haremos del programa será sin Clases enumeradas!!!!!

## Crearemos una superclase llamada Electrodomestico con las siguientes características:

Sus **atributos** son precio base, color, consumo energético (letras entre A y F) y peso. **Usa una clase enumerada.**
    
Por defecto, el color será blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
    
Los colores disponibles son blanco, negro, rojo, azul y gris. **Usa una clase enumerada.**
    
Los **constructores** que se implementaran serán:
    
- Un constructor por defecto. public Electrodomestico() 
- Un constructor con el precio y peso. El resto por defecto. public Electrodomestico(float precioBase, float peso)
- Un constructor con todos los atributos. public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso)

Los **métodos** que implementara serán:
    
- Métodos get de todos los atributos.
- comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, si no es correcta, usara la letra por defecto. Se invocara al crear el objeto y no será visible.
- comprobarColor(String color): comprueba que el color es correcto, si no lo es, usa el color por defecto. Se invocara al crear el objeto y no será visible.
- getPrecioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:

**LETRA	PRECIO**

A	100 €

B	80 €

C	60 €

D	50 €

E	30 €

F	10 €

**TAMAÑO	PRECIO**

Entre 0 y 19 kg:	10 €

Entre 20 y 49 kg:	50 €

Entre 50 y 79 kg:	80 €

Mayor que 80 kg:	100 €


## Crearemos una subclase llamada Lavadora con las siguientes características:

Su **atributo** es carga, además de los atributos heredados.
    
Por defecto, la carga es de 5 kg. Usa una constante para ello.
    
Los **constructores** que se implementaran serán:
    
- Un constructor por defecto. public Lavadora()
- Un constructor con el precio y peso. El resto por defecto. public Lavadora(float precioBase, float peso)
- Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre. public Lavadora(float precioBase, float peso, char consumoEnergetico, String color, int carga) y public Lavadora(float precioBase, float peso, int carga)
- Un constructor con precio, peso, consumo energético y color (sin carga). public Lavadora(float precioBase, float peso, char consumoEnergetico, String color) 

 Los **métodos** que se implementara serán:
    
 - Método get de carga.
 - getPrecioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.


## Crearemos una subclase llamada Television con las siguientes características:

Sus **atributos** son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
    
Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
    
Los **constructores** que se implementaran serán:
    
- Un constructor por defecto. public Television()
- Un constructor con el precio y peso. El resto por defecto. public Television(float precio, float peso)
- Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre. public Television(float precio, float peso, char consumo, String color, int resolucion, boolean siTDT

Los **métodos** que se implementara serán:
    
- Método get de resolución y sintonizador TDT.
- getPrecioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.


## Ahora crea una clase ejecutable que realice lo siguiente:

Crea un ArrayList de Electrodomesticos.
    
Crea diferentes electrodomésticos con los valores que desees.
    
Ahora, recorre este ArrayList y ejecuta el método precioFinal().
    
Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos). 

**Polimorfismo: Recuerda el uso operador instanceof.**

Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, dos lavadoras de 200 y una televisión de 500, el resultado final sera de 1000 (300+400+500) para electrodomésticos, 400 para lavadora y 500 para televisión.

## Ejercicio 6 
Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas) que forman parte del sistema solar. 

Algunos atributos que necesitaremos almacenar son: 

- Nombre
- Radio
- Rotación del eje
- Masa del cuerpo. 
- Temperatura media
- Gravedad

En el caso de los **planetas** es necesario almacenar:

- Distancia al sol
- Órbita al sol
- tiene satélites (guardadlos en una lista dinámica **ArrayList**)

En el caso de los **satélites** es necesario almacenar:

- Distancia al planeta 

- Órbita al planeta planeta al que pertenece



**Define las clases necesarias conteniendo:**

• Constructores. 

• Métodos para recuperar y almacenas atributos. 

• Método para mostrar la información del objeto. 


**Sobreescribir el método toString()**
Vamos a sobreescribirlo para que dado un objeto del sistema solar (planeta o satélite), devuelva un String con toda la información que se dispone sobre el mismo (además de su lista de satélites si los tuviera).

Para ello haremos uso de la clase StringBuilder.

**Aunque salga en la captura, no hay que implementar el método muestra y mucho menos abstracto!!!!! utilizad el método toString() adecuadamente en cada caso** 

![Captura de pantalla de 2022-01-14 18-55-49](https://user-images.githubusercontent.com/91023374/149562533-f583c5b3-2c44-4b25-8155-ecba6e193b6d.png)


## Ejemplo de salida del programa

Con un menú para elegir los diferentes astros

![image](https://user-images.githubusercontent.com/91023374/213674199-dedb6630-9c8f-49ff-b964-2c791049b035.png)

**CONTROL DE ERRORES**
El programa controla que se intruduzca un número de planeta correcto (debe ser un entero positivo relacionado a un planeta existente)


## Valores de ejemplo para planetas y satélites

```
        // Instanciamos planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);

        // Instanciamos satélites
        Satelite luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0, tierra);
        Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000, marte);
        Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460, marte);
```

### Pista: para crear correctamente el método toString()
Investiga sobre:
- getClass()
- getClass().getSimpleName()

```
    public String toString() {
        StringBuilder sb = new StringBuilder("\n*** "+getClass().getSimpleName()+" "+super.getNombre()+" ***");
        sb.append(super.toString());
        sb.append("\ndistPlaneta=").append(distPlaneta);
        sb.append("\norbPlaneta=").append(orbPlaneta);
        sb.append("\nplaneta=").append(planeta.getNombre());
        return sb.toString();
    }
```



# VERSIÓN 2: Con clase abstracta

Implementar el método abstracto en Astro:

```
    // MÉTODO ABSTRACTO
    public abstract double obtenerNumeroDistanciaSoles();
    
```

Para obtener el número de soles de distancia hay que tener en cuenta que no se obtiene igual en los planetas que en los satélites. Vamos a considerar (que no se entere ningún astrónomo que nos mata!!!!) que:
- **En los planetas:** el número de soles será la distancia al sol dividida por el diámetro del sol (distSol / DIAMETRO_SOL).
- **En los satélites:** el número de soles será la distancia del satélite al planeta + la distancia del planeta el sol, dividido por el diámetro del sol.

```
    // Constante en la clase padre Astro
    protected final double DIAMETRO_SOL = 1500000;

```

**Al usar el método abstracto obligará a:**

- Declarar Astro como clase abstracta.

- Implementar el método abstracto en las clases hijas Planeta y Satélite.


# VERSIÓN 3: Uso de instance of

Solo la clase **Planeta** va a tener un nuevo método de comportamiento:

```
    // Método de comportamiento
    public String infoExtra(){
       return "Un planeta es un cuerpo esférico sin luz propia, que gira alrededor de una estrella"; 
    }
```

En la clase Main añade la lógica para que en el caso de que el astro de la lista sea un Planeta además muestra dicha información extra.
