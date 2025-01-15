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


## Ejercicio3 

Enunciado del ejercicio: Sistema de Gestión Académica

Diseña un programa en Java que gestione la información de alumnos, módulos y notas de una institución educativa. El programa debe cumplir con los siguientes requisitos:
Tendrá las siguientes clases, 
Principal, Alumno, Modulo, Nota

Clase Alumno:

Atributos:

nombre (String): Nombre completo del alumno.

matricula (String): Número de matrícula único del alumno.

modulos (Array de Módulos): Lista de módulos en los que está inscrito el alumno.

Métodos:

Constructor para inicializar los atributos.

Métodos agregarModulo y mostrarInformacion.

Clase Modulo:

Atributos:

nombre (String): Nombre del módulo (por ejemplo, "Programación").

codigo (String): Código único del módulo.

notas (Array de Notas): Lista de las evaluaciones (primera, segunda, tercera, ordinaria y extradinaria)  del módulo.

Métodos:
Constructor para inicializar los atributos.
Métodos para agregar una nota y calcular la nota media.


Clase Nota:

Atributos:
tipo (Enum): Tipo de evaluación (Primera, Segunda, Tercera, Ordinaria, Extraordinaria).

calificacion (double): Nota obtenida.

Métodos:

Constructor para inicializar los atributos.

Enum TipoNota:

Valores: PRIMERA, SEGUNDA, TERCERA, ORDINARIA, EXTRAORDINARIA.

Funcionalidad del programa:

El programa debe permitir registrar nuevos alumnos con sus módulos y notas.
(Haremos la prueba creando las instancias en el main)

Debe ser posible calcular y mostrar:

El promedio de calificaciones de un módulo.

La calificación final del alumno (promedio de todos los módulos).

(Una vez escrito el código con las clases y su funcionalidad, añadiremos el menú)
El programa debe ofrecer un menú para gestionar:

Añadir alumnos, módulos y notas.

Listar alumnos con sus módulos y calificaciones.

Mostrar estadísticas como promedios por módulo o alumno.

## Ejercicio 4
Vamos a crear una clase tarea:


Clase Tarea

Cada tarea estará representada por una clase Tarea con los siguientes atributos:

titulo: (String) el título de la tarea.

categoria: (enum) la categoría de la tarea, con valores como:

TRABAJO, ESTUDIO, PERSONAL, OTRO.

estado: (enum) el estado de la tarea, con valores como:

PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA.

fecha: (LocalDate) la fecha asignada a la tarea.

hora: (LocalTime) la hora asignada a la tarea.

En la clase principal, crearemos un array de tareas, y realizaremos la carga con la llamada a la clase facilitada. 

Probaremos a listar en la consola todas las tareas.  



## Ejercicio 4 - avanzado

El objetivo de este ejercicio es desarrollar una aplicación que permita gestionar una lista de tareas utilizando una clase llamada TodoList. 

La lista tiene una longitud máxima definida de 10 tareas, y las operaciones permitidas son añadir, modificar y listar tareas filtradas por una fecha específica. 

A continuación, se detallan los requisitos:

Requisitos principales

Clase Tarea

Cada tarea estará representada por una clase Tarea con los siguientes atributos:

titulo: (String) el título de la tarea.

categoria: (enum) la categoría de la tarea, con valores como:

TRABAJO, ESTUDIO, PERSONAL, OTRO.

estado: (enum) el estado de la tarea, con valores como:

PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA.

fecha: (LocalDate) la fecha asignada a la tarea.

hora: (LocalTime) la hora asignada a la tarea.

Clase TodoList

La clase TodoList debe manejar una lista de tareas de longitud fija (máximo 10).

Incluir los siguientes métodos:

añadirTarea(Tarea tarea)

Permite añadir una nueva tarea a la lista.

Restricción: No se debe añadir una tarea si ya existe otra con la misma fecha y hora.

Retornar un mensaje indicando si la tarea fue añadida correctamente o no.

modificarTarea(int index, Tarea tarea)

Permite modificar una tarea existente en una posición dada del array.

Validar que el índice esté dentro de los límites de la lista.

Restricción: Al modificar, la nueva fecha y hora no deben entrar en conflicto con otras tareas.

listarTareasPorFecha(LocalDate fecha)

Devuelve todas las tareas que coincidan con una fecha específica.

Clase Principal

Implementar un menú interactivo en la consola con las siguientes opciones:

Añadir tarea: Solicitar al usuario los datos de la tarea y añadirla a la lista.

Modificar tarea: Solicitar el índice de la tarea a modificar y los nuevos datos.

Listar tareas por fecha: Solicitar una fecha y mostrar las tareas correspondientes.

Salir: Finaliza el programa.

Restricciones adicionales

La lista de tareas debe tener un tamaño fijo de 10.

Manejar excepciones para entradas inválidas (por ejemplo, índices fuera de rango o conflictos de fecha y hora).

Mostrar mensajes claros al usuario cuando las operaciones no puedan realizarse (como lista llena o conflictos al añadir/modificar).


Ejemplo de flujo de la app

El usuario selecciona "Añadir tarea" e introduce:

Título: "Estudiar para examen"

Categoría: ESTUDIO

Estado: PENDIENTE

Fecha: 2025-01-20

Hora: 10:00

La tarea se añade correctamente.

El usuario intenta añadir otra tarea con la misma fecha y hora:

Mensaje: "No se puede añadir la tarea. Ya existe una tarea programada en esa fecha y hora."

El usuario selecciona "Listar tareas por fecha" y elige "2025-01-20":

Se muestra la tarea: "Estudiar para examen".

El usuario selecciona "Modificar tarea" y cambia la fecha y hora de la tarea.

Mensaje: "Tarea modificada correctamente."






