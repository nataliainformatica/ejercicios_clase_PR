COLLECCIONES
## Ejemplo1 - Implementación de HashMap
Haremos una aplicación de agenda de contactos utilizando un HashMap como colección. 

La clave será el número de teléfono, el nombre el valor.

Al ejecutar la aplicación, mostrará un menú: 

  1.Insertar contacto
  
  2.Consultar contacto (número)
  
  3.Mostrar todos
  
  4. Salir




## Ejercicio 1

Se requiere desarrollar una aplicación en Java, repasando la orientación a objetos, para gestionar gastos compartidos entre un grupo de participantes. 
Repasaremos herencia abstracta, interfaces y excepciones. 

La aplicación debe permitir registrar ingresos y gastos, calcular los saldos individuales y determinar cuánto debe pagar o recibir cada participante para equilibrar los costos.

Se usará herencia abstracta para definir una clase base **Persona**.
Se implementará una interfaz **Transaccion** , que será utilizada por Gasto e Ingreso.

Gestión de Participantes y Transacciones

La clase **Participante**  representará a cada persona involucrada en los gastos.

Cada Participante tendrá una lista de Transaccion (gastos e ingresos).

Se podrá agregar transacciones (gastos o ingresos) a un participante.
Si el  participante tiene mayor importe en ingresos que en gastos, se propagará una excepción **ImportePositivoExcepcion**,  con los datos del participante y el importe resultante. 

Se podrá consultar el importe pendiente de cada participante (gastos - ingresos).

Gestión de **Gastos**  e  **Ingresos**

La clase Gasto representará un gasto con un importeGasto(double),  categoría (tipo enumerado)  y detalle(String).

La clase Ingreso representará un ingreso con un importeIngredo(double) y descripción (String).

Gasto lanzará una excepción personalizada (GastoInvalidoException) si el monto es negativo (tanto desde el constructor, como desde el setter)

Cálculo de Saldos Pendientes

En la clase **GestionGastos** , se implementará un método calcularPendientes, que:

// utilizaremos un DAOparticipantes con las instancias de todos los participantes
// en lugar de introducir los datos por consola
Determinará la cuota equitativa dividiendo el total de gastos entre el número de participantes.
Indicará cuánto debe pagar o recibir cada participante. 

Manejo de Excepciones
TODAS LAS EXCEPCIONES SE MANEJAN EN LA CLASE GestionGastos
Se almacenarán las excepciones de ImportePositivoExcepcion en una coleccion para en un futuro poder tratarlas. 

Ejemplo de Funcionamiento
Si tres participantes han registrado los siguientes gastos e ingresos:

Ana: Gasto de 30€ en comida, Ingreso de 50€

Juan: Gasto de 20€ en transporte, Ingreso de 30€

Luis: Gasto de 50€ en entradas

El programa calculará cuánto ha pagado y cuánto debería haber pagado cada uno, y mostrará los saldos pendientes de cada participante.

# Ejercicio2 : ORDENACIÓN DE PRODUCTOS

## Objetivos

- Uso de clases, uso método toString() para mostrar datos. 

- Uso de arrays (ArrayList)  de objetos. 

- Argumentos por referencia.

- Uso de interfaces Comparable y Comparator. 

- Uso del **patrón DAO** para abstraer y encapsular todos los accesos a la fuente de datos.

## Problema a resolver

Nos piden hacer la lógica que podrá ordenar (por distintos parámetros) una colección de Productos. 

Para esto completaremos la clase **Ordenaciones** que deberá tener tres métodos con las siguientes firmas: 

```

public ArrayList<Producto> ordenarAltoProducto(  ArrayList<Producto>   coleccion);
  

public ArrayList<Producto> ordenarAnchoProducto(  ArrayList<Producto>   coleccion);
  

public ArrayList<Producto> ordenarLargoProducto(  ArrayList<Producto>   coleccion); 
  
```

### La clase Producto

- Se ordenará por **criterio natural** por el atributo de **nombre**. 
- Es posible crear un Producto con el nombre, de forma que las medidas por defecto son las mínimas expresadas a continuación.
- Los datos del paquete no podrán ser modificados una vez creados.
- Todos los productos están empaquetados en cajas con medidas que no superan los siguientes límites: 

```
(Si se pasan valores superiores o inferiores se  truncará al valor mínimo o máximo)

Alto: desde 2 cm hasta 30 cm 

Ancho: desde 2 cm hasta 10 cm 

Largo: desde 2 cm hasta 10 cm 
```

Podremos **ordenar los productos** por cualquiera de estas tres medidas, siempre de mayor a menor. 


### Pruebas

Mostraremos el catálogo de productos en el siguiente orden:
- sin ordenar
- ordenados por nombre
- sin ordenar
- ordenados por alto
- sin ordenar
- ordenados por ancho
- sin ordenar
- ordenados por largo

# AMPLIACIÓN: PRÁCTICA GUIADA: con Servicio de Ordenación y Patrón Singleton
Singleton - también llamado instancia única
![https://refactoring.guru/es/design-patterns/singleton

Aprenderemos a crear un servicio de ordenación (una única instancia)
privte static ArrayList<T> listaClonada;
```
private static ServicioOrdenacion instance;
    
    private ServicioOrdenacion(){
        listaClonada = new ArrayList<>();
    }
    
    public static ServicioOrdenacion getInstance(){
        if (instance == null)
            instance = new ServicioOrdenacion();
        return instance;
    }
```

```
ServicioOrdenacion servicio = ServicioOrdenacion.getInstance();
...
servicio.ordenarAltoProducto(productos);
...
servicio.ordenarAnchoProducto(productos);
...
servicio.ordenarLargoProducto(productos);

```

# Ejercicio 3:Alquiler de vehículos

Se pretende desarrollar una aplicación que permita **calcular los precios de alquiler de una empresa de alquiler de vehículos.**

Cada vehículo se identifica unívocamente por medio de su matrícula. 

La empresa alquila distintos tipos de vehículos, tanto para transporte de personas como de carga. En la actualidad los vehículos alquilados por la empresa son:
- coches
- microbuses
- furgonetas de carga
- camiones

**El precio del alquiler de cualquier vehículo tiene una componente base que depende de los días de alquiler a razón de 50 €/día.**

## Coche

En el caso de un coche, al precio base se le suma la cantidad de 1.5€ por plaza y día. 

## Microbuses

El precio de alquiler de los microbuses añade una cantidad de 3€ por plaza al precio base, independientemente de los días de alquiler. 

## Vehículos de carga (furgonetas y camiones)

El precio de los vehículos de carga es el precio base más 20€ * PMA (PMA = peso máximo autorizado en toneladas)

Además, en el caso de los camiones, al precio se suma un fijo de 40 € independientemente de los días de alquiler. 


**La interacción del empleado con la aplicación deberá realizarse a través de la consola.**

**Decide el diseño de las clases con sus atributos y métodos correspondientes**



## CASOS DE USO

1. Añade vehículo  

2. Marca un vehículo como alquilado y  obtiene precio de alquiler

3. Muestra todos los vehículos 

4. Muestra todos los vehículos NO alquilados

5. Muestra todos los vehículos alquilados

0. SALIR 



**Opción 1:**

el empleado selecciona la opción "añade vehículo"

la aplicación pide los datos del vehículo

la aplicación añade el vehículo a la lista de vehículos de empresa (pondremos que como máximo puede tener 10)


**Opción 2:**

La aplicación pide la matrícula del vehículo y los días que va a durar el alquiler

la aplicación muestra el precio previsto y marca el vehículo como alquilado


**Opción 3:**

Muestra una lista con todos los detalles de los vehículos alquilados


**Opción 4:**

Muestra una lista con todos los detalles de los vehículos NO  alquilados


**Opción 5:**

La aplicación pide la matrícula del vehículo, muestra el precio del alquiler y marca el vehículo como no alquilado. 

# ejercicio 4: Electrodomésticos: 

## Crearemos una superclase llamada Electrodomestico con las siguientes características:

Sus **atributos** son precio base, color, consumo energético (letras entre A y F) y peso. **Usa enumerados para color y consumo.**
    
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
 - getPrecioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y añade el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.


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


# Ejercicio5
## para practicar  herencia y sobreescritura del método equals

## Parte I

![image](https://user-images.githubusercontent.com/91023374/149546516-f3a9e2b1-9815-4317-a0a3-769c0ce91537.png)

## Parte II

![image](https://user-images.githubusercontent.com/91023374/149546559-be226c3f-69af-4060-a003-d0f0535f4ee8.png)

## Parte III

![image](https://user-images.githubusercontent.com/91023374/149546782-c5094ebf-6044-4402-9bc7-7a5d38f16068.png)

## Ejemplo de salidas del programa con diferentes set de datos

![image](https://user-images.githubusercontent.com/91023374/149550906-e4e64e8e-318b-4221-b9eb-866c7e3e32a9.png)

![image](https://user-images.githubusercontent.com/91023374/149551033-788a47a8-34df-467a-8dd6-576646866fe0.png)

# Ejercicio 6 - ASTROS
Trabajaremos herencia y composición. Colecciones. Excepciones. 

Define una jerarquía de clases que permita almacenar datos sobre los astros:  planetas y satélites (lunas) que forman parte del sistema solar. 

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



# VERSIÓN 2: Con método abstracto

Implementar el método abstracto en Astro:

```
    // MÉTODO ABSTRACTO
    public abstract double obtenerNumeroDistanciaSoles();
    
```

Para obtener el número de soles de distancia hay que tener en cuenta que no se obtiene igual en los planetas que en los satélites. Vamos a considerar (que no se entere ningún astrónomo .....!!!!) que:
- **En los planetas:** el número de soles será la distancia al sol dividida por el diámetro del sol (distSol / DIAMETRO_SOL).
- **En los satélites:** el número de soles será la distancia del satélite al planeta + la distancia del planeta el sol, dividido por el diámetro del sol.

```
    // Constante en la clase padre Astro
    protected final double DIAMETRO_SOL = 1500000;

```

# VERSIÓN 3: Uso de instance of

Solo la clase **Planeta** va a tener un nuevo método de comportamiento:
```
    // Método de comportamiento
    public String infoExtra(){
       return "Un planeta es un cuerpo esférico sin luz propia, que gira alrededor de una estrella"; 
    }
```
En la clase Main añade la lógica para que en el caso de que el astro de la lista sea un Planeta además muestra dicha información extra.
