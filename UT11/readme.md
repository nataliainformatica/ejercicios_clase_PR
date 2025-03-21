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

´´´

 ------------------------- 
 Cine Club Lumiere 
 fila: numero 
 asiento: numero
 -------------------------
 ´´´
 
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

● AppCine, que contendrá el siguiente método main y que no deberás hacer: 
´´
 public static void main(String[] args) { 
 GestorCine gestor=new GestorCine(new Cine()); 
 gestor.gestionarMenu(); 
 } 
 
´´´

Asegúrate de capturar y tratar todas las excepciones verificadas en todas las clases. 

★ Clase Butaca:

´´´
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
´´´

