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
![https://refactoring.guru/es/design-patterns/singleton]

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
