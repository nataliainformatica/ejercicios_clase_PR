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






