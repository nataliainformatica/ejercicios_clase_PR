## Ejercicio 1 
Crearemos una clase llamada Tarea, 
donde cada tarea tiene un nombre, 
una descripción y una fecha de vencimiento 
(utilizando LocalDate). 

Para crear la fecha se puede utilizar el método: 
static LocalDate	
LocalDate.of(int year, int month, int dayOfMonth)


La aplicación mostrará un menú,  que pedirá al usuario los datos para crear la tarea. 

La aplicación permite almacenar hasta 20 tareas

La aplicacion también tendrá un punto del menú que permitirá mostrar las tareas almacenadas. 



## Ejercicio 2

Enunciado: Gestión de DNIs

Crea una clase llamada Dni que permita gestionar información básica sobre un Documento Nacional de Identidad. Esta clase debe tener los siguientes atributos y métodos:

Atributos:

número: un valor entero que representa el número del DNI.

letra: un carácter que representa la letra asociada al DNI.

Métodos:

Constructor:

Debe permitir inicializar el número y la letra del DNI.

Método esValido():

Este método debe verificar si el DNI es válido. Para simplificar, considera que un DNI es válido si:

El número tiene 8 dígitos.
La letra no es un carácter vacío (' ').

Método mostrarDni():

Debe devolver un string para poder imprimir  en consola el número completo del DNI en formato 12345678A.

Tareas a realizar:

Crea un programa principal (una clase con el método main) que:

Pida por consola los datos para crear 2 objetos de la clase Dni con diferentes datos.
Muestre el resultado de verificar si cada uno de los DNIs es válido usando el método esValido().
Muestre los datos de los DNIs en consola usando el método mostrarDni().
