# FICHEROS


# Ejercicio 1


Crea un  programa,  que tendrá un menú 
1. Consultar tu opción favorita
2. Escribir tu opción favorita
3. Salir
   
Si pulsa la opción 1, intentará leer el fichero opcion.txt. El fichero existirá si el usuario en algún momento ha ejecutado la aplicación y ha escrito su  opción favorita. 
Si el fichero no existe, mostrará un mensaje al usuario:
"DEBES GUARDAR ANTES TUS OPCIONES"
Si el fichero existe, mostrará al usuario su opción guardada.

Si pulsa la opción 2, preguntará al usuario cuál es su opción favorita, y la guardará en el fichero opcion.txt. 

# Ejercicio 2

Crea un  programa,  que tendrá un menú 
1. Consultar tus opciones favoritas
2. Escribir tus opciones favoritas
3. Salir
   
Si pulsa la opción 1, intentará leer el fichero opciones.txt. El fichero existirá si el usuario en algún momento ha ejecutado la aplicación y ha escrito sus  opciones favoritas.

Si el fichero no existe, mostrará un mensaje al usuario:
"DEBES GUARDAR ANTES TUS OPCIONES"
Si el fichero existe, mostrará al usuario su opción guardada.

Si pulsa la opción 2, preguntará al usuario cuál es su opción favorita, y la guardará en el fichero opciones.txt. 
Continuará preguntando al usuario por su opción favorita, hasta que el usuario escriba SALIR (o salir). 

# Ejercicio 3

Usando el fichero con el calendario laboral en formato CSV, que proporciona la API de datos en abierto : datos.gob.es  
https://datos.gob.es/es/catalogo/l01280796-calendario-laboral

Haremos una aplicación que será capaz de leer el fichero, para hacer un calendario 2025  para poder usarlo como parte de otras aplicaciones.

Es necesario hacer una jerarquía de clases: 

Dia (que tendrá como atributos fecha y dia_semana)

DiaLaborable - lunes, martes, miércoles, jueves o viernes

DiaSabado - diferenciamos el sábado de los dias laborables

DiaDomingo - diferenciamos el domingo de los días laborables

DiaFestivo - cualquier lunes a domingo que sea festivo


Nuestro objetivo, es conseguir un   private List<Dia> dias, leyendo cada una de las líneas del fichero csv, parseando correctamente  los datos a las clases comentadas anteriormente. 
/**
 * CABECERA DEL FICHERO CSV
 * 
 * Dia;Dia_semana;laborable / festivo / domingo festivo;Tipo de
 * Festivo;Festividad
 * 
 * Dia_semana = [lunes,martes,miércoles,jueves,viernes,sábado,domingo]
 * laborable =[laborable,festivo, sábado, domingo, domingo_festivo]
 * Tipo de Festivo =[Festivo nacional, Festivo de la Comunidad]
 * Festividad =*
 */


# Ejercicio 4
Queremos realizar una aplicación java para gestionar la venta automática de entradas del cine club 
Lumiere. El cine se representa como un array de 2 dimensiones, cada posición con dos únicos valores 
posibles y con tantos elementos como indican las constantes FILAS y ASIENTOS. En principio 
tendrá 10 filas con 15 asientos cada una (columnas) y cuando se crean se ponen a libre todos los 
asientos. 

En un fichero de texto, “entradasVendidas.txt”, se guarda la relación de filas y asientos que están ya 
ocupados y por tanto ya vendidos, uno por línea, con un formato fila:asiento. 

Cada vez que abramos la aplicación, descargaremos esa información en nuestro array. 

Se mostrará un menú en pantalla que permita las siguientes opciones: 

 1. Mostrar butacas
    
 2. Comprar entrada
    
 3. Devolver una entrada
    
 4. Salir
    
1. Mostrar el cine en pantalla (la visualización consistirá en un doble X (“XX”) para los asientos 
ocupados y un doble _ (“__”) para los que todavía se encuentren libres. Separa cada asiento al menos 
con 2 espacios.

2. Comprar la entrada de una fila y asiento concreto. Se muestra la entrada en pantalla y actualiza 
el array si está disponible o se comunica al cliente que ya está ocupada. Formato de salida, si la 
compra se efectúa

```

 ------------------------- 
 Cine Club Lumiere 
 fila: numero 
 asiento: numero
 -------------------------
```
 
3. Devolver una entrada, sólo si ha sido antes vendida.
   
4. Al salir de la aplicación, se deberá guardar en el archivo “entradasVendidas.txt” los nuevos 
asientos vendidos, de forma que cuando la aplicación se vuelva a abrir, las ventas de entradas estén 
completamente actualizadas y recuerden todo lo vendido hasta ahora.

Para todo esto debes realizar cuatro clases: 

● Butaca, con dos atributos, fila y asiento, constructor, métodos para recuperar los atributos y 
una forma de describir textualmente el objeto con formato fila:asiento. Esta clase se te proporciona 
ya hecha, aunque es posible que quieras añadirle algún otro método. 

● Cine, en donde además de los atributos ya reseñados, debe tener los métodos necesarios para 

○ mostrar el cine en pantalla 

○ vender una entrada 

○ devolver una entrada 

○ leer las ventas desde el archivo y actualizar el array 

○ guardar las ventas en el archivo a través de objetos de la clase Butaca 

○ cualquier otro método que creas oportuno. 

● GestionCine, encargado de crear y gestionar el menú en pantalla y de la comunicación con la 
clase Cine. Recibirá un objeto de la clase Cine en su constructor, que será precisamente el Cine que 
deba gestionar. Al comenzar se encargará de que se lean las ventas desde el archivo “entradasVendidas.txt”.

Tendrá un método por cada opción del menú que se encargue de ejecutarla y 
los métodos que sean necesarios para el menú en sí mismo. 

● AppCine, que contendrá el siguiente método main: 
```
 public static void main(String[] args) { 
 GestorCine gestor=new GestorCine(new Cine()); 
 gestor.gestionarMenu(); 
 } 
 
```

Asegúrate de capturar y tratar todas las excepciones verificadas en todas las clases. 

★ Clase Butaca:

```
public class Butaca { 
 private int asiento, fila; 
 
 public Butaca(int f, int a){ 
 asiento=a; 
 fila=f; 
 } 
 
 public Butaca(String s){ 
 String[] b=s.split(":"); 
 fila=Integer.parseInt(b[0]); 
 asiento=Integer.parseInt(b[1]); 
 } 
 public int getAsiento() { 
 return asiento; 
 } 
 public int getFila() { 
 return fila; 
 } 
 
 public String toString(){ 
 return fila+":"+asiento; 
 } 
} 
```


# Ejercicio 5 Juego del Ahorcado en Java

**Objetivo:**
Desarrollar un juego del ahorcado en consola donde el usuario debe adivinar una palabra. Se le proporcionarán ciertas ayudas y se registrarán los mejores puntajes en un fichero binario.

**Requisitos:**

1. Selección del dibujo del ahorcado
   
Al inicio del juego, el usuario podrá elegir entre diferentes estilos de dibujos del ahorcado. 
(los dibujos, estarán en un fichero en la carpeta dibujos, en la ruta de la aplicación, de forma que se mostrará el nombre de todos los ficheros que haya en esta carpeta, para que el usuario elija uno), por ejemplo 
```

   List<String> lista2=  new ArrayList<>(Arrays.asList(
            "  +----+",
            "  |    |",
            "  (x_x) |",
            "  /|\\  |",
            "  / \\  |",
            "       |",
            "========="
        ));
```

Dependiendo del dibujo elegido (número de líneas), se determinará la cantidad de intentos permitidos antes de perder la partida.

**2. Gestión de palabras**
   
Las palabras estarán almacenadas en un fichero de texto (palabras.txt).

Se seleccionará una palabra al azar al inicio de la partida.

**3. Reglas del juego**

Se mostrará la palabra oculta con guiones (_) representando las letras.

Las vocales se mostrarán siempre automáticamente y no cuentan como intentos.

El jugador puede ingresar una letra en cada turno:

Si acierta, la letra se muestra en su posición.

Si falla, se descuenta un intento y se actualiza el dibujo del ahorcado.

Se mostrará un listado de las letras ya intentadas.

**4. Registro del jugador**

Al inicio, el usuario ingresará su alias.

Al finalizar la partida, se guardarán en un fichero **binario** (ranking.dat) los siguientes datos:

Alias

Fecha de juego

Puntuación obtenida

**5. Sistema de puntuación**

La puntuación se calculará en función de:

Cantidad de intentos restantes (más intentos = más puntos).

Longitud de la palabra (palabras más largas dan más puntos).

Dificultad elegida (más intentos permitidos reducen la puntuación).

La decisión de cómo se asignan y cuántos se asignan es libre

**6. Consulta del ranking**

El juego tendrá una opción para mostrar las 10 mejores puntuaciones guardadas en el fichero binario. Ordenadas de mayor a menor.  Se mostrará la puntuación, el alias del usuario y la fecha


# Ejercicio6

Completa  el código de la carpeta ejercicio6_base, modifica el programa para que permita agregar nuevas personas a la lista sin borrar las anteriores.
Añade un  menú para que permita mostrar  las personas de la lista, y una opción para añadir personas. 
Modifica el código, de forma que la primera vez que se ejecuta la aplicación, muestre un mensaje de que no se pueden mostrar ningún dato (en lugar de guardar los datos del DAO)
# Ejercicio 7
Se pretende implementar un control de parkings de Alcalá, en los que pueden aparcar coches y motos y bicicletas eléctricas.

Cumpliendo los requisitos que se especifican a continuación, completa la estructura de clases con sus correspondientes métodos y atributos, aparte de los métodos y atributos especificados puedes añadir los que estimes oportunos.

Las características comunes a todos los parkings estarán en una clase **Parking**, que tendrá su _nombre_, _dirección_, una colección de **Plaza**, que almacenará las instancias de los vehículos que aparquen, y podrán ser de tres tipos: aparca un coche, aparca una moto y plaza con punto de recarga para vehículos eléctricos de los tres tipos (coche, moto o bicicleta). El tendrá definidos el número de plazas para coche, número de plazas para moto y número de plazas para recarga.

De los coches es necesario conocer la _marca_, el _modelo_, la _matrícula y si es eléctrico la potencia máxima de recarga_. Parámetros que no se pueden  modificar.

De una moto se necesita conocer la marca, el _modelo_ y la _matrícula_, _y si es eléctrico la potencia máxima de recarga_. Parámetros que no se pueden  modificar.

De una bicicleta solo se necesita guardar  un número identificador que se le asigna en la entrada al parking.

El identificador de bicicleta será un valor numérico que se obtendrá automáticamente. Para ello puede utilizarse una variable estática que se incrementará.

Tanto **Coche** como **Moto** y **Bicicleta** implementan la interface:

public interface recargable{

public double consultarPotenciaCarga();

// que devolverá los kW de potencia máxima de recarga

Todos los parking deben ser capaces de mostrar su porcentaje de ocupación, (número de total de plazas ocupadas/ número total de plazas disponibles) .

**public double mostrarOcupacion();**

Cada **Plaza** del parking tiene un número asignado.

La tarifa del parking es 0,05 x minuto, si se aparca en una plaza de coche, 0,03xminuto si se aparca en una plaza de moto,  y 0,1€ x Kw(PotenciaVehiculo) x minuto en las plazas de recarga. Por lo tanto la **_cantidadGanada_** la suma de todas las cantidades de las plazas.

****A continuación se definen los métodos de comportamiento del parking:**

**Si el parking no está completo** podrá aparcar y se ocupará una plaza.

Para aparcar en una plaza normal, se implementará el método **aparcarNormal**, que permite solo aparcar a coches y motos, que ocupará una plaza normal (de coche si aparca un coche y de moto si aparca una moto), guardando los todos datos del vehículo que aparca y la hora de entrada.

Para aparcar en una plaza de recarga, se implementará el método **aparcarRecarga**, que permite aparcar a coches, motos y bicicletas eléctricas, que ocupará una plaza de recarga, guardando los datos del vehículo y la hora de entrada.

Para abandonar el parking, se implementará el método **salir** que recibirá el número de plaza del vehículo que va a salir  y la hora de salida. Devolverá el importe a pagar (calculado según el tipo de plaza ocupada) , además el método liberará la plaza ocupada, recalculando el importe que acumula la plaza.

En el caso de que el parking esté completo, el método lanzará una excepción del tipo **Exception** con el nombre del parking y el número de plazas ocupadas, y el tipo de plaza que ha alcanzado el máximo.

_Se debe guardar la excepción en una colección, de forma que se puedan consultar en cualquier momento._

Parking deberá tener además los siguientes métodos de consulta:

public double **mostrarCantidadGanada**();

// devuelve  el total ganado por el parking con todas las plazas de aparcamiento

public String **mostrarlistaPlazasOcupadas**();

//devuelve una lista con las plazas que están ocupadas en el momento de la consulta. plaza con todos los detalles (número de plaza, tipo (coche, moto o eléctrica), cantidadAcumulada.

public String **mostrarlistaPlazasLibres**();

// devuelve una lista con las plazas que están libre en el momento de la consulta, plaza con todos los detalles (número de plaza, tipo (coche, moto o eléctrica), cantidadAcumulada.

public String **mostrarlistaPlazasOrdenadas**();

// mostrará la lista ordenada por número de plaza con todos los detalles (número de plaza, tipo (coche, moto o eléctrica), cantidadAcumulada.

public String **mostrarlistaPlazasOcupadasOrdenadas**();

// mostrará la lista ordenada por hora de ocupación, plaza con todos los detalles (número de plaza, tipo (coche, moto o eléctrica), cantidadAcumulada.
