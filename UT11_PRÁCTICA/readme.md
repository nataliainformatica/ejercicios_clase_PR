
# PRÁCTICA RESUMEN

Se desarrollará una aplicación Java que permita gestionar el acceso de personas a un edificio. La aplicación incluirá las siguientes funcionalidades:

1.  **Autenticación de personas con verificación de credenciales.**
2.  **Registro de entrada y salida del edificio (asociado a la autenticación).**
3.  **Consulta de historial de accesos de la persona autenticada.**

Se manejarán excepciones para errores comunes como credenciales incorrectas o intentos de entrada inválidos.

El punto de partida de esta aplicación es que las personas ya están registradas en un fichero **personasRegistradas.dat** que se proporciona (serialización de un ArrayList<Persona>. NO se permite añadir ni eliminar personas.

----------

**Estructura de la Aplicación**

-   **Principal:** Implementa un menú interactivo con opciones para:

1.  Acceso al registro de entrada
2.  Acceso al registro de salida

-   **Persona:** Clase que representa a una persona con atributos:

-   NombreApellidos (String con el nombre completo
-   número de empleado (String para  un código de empleado)
-   password (contraseña)

**Registro**:

.	fecha (LocalDate)
.	hora (LocalTime)
.	Persona

 -Entrada y Salida, heredan de Registro 
 - Entrada tendrá el atributo : motivoEntrada
 - Salida, tendrá los atributos fechaEntrada, horaEntrada. 


-   **ExcepcionDeValidacion:** Excepción personalizada para errores de validación.

----------

**Detalles de Implementación**

Imagina una pantalla para el registro de acceso de un edificio, que muestra dos opciones:

Registro de acceso

Registro de salida.

Si el usuario pulsa la opción de registro de acceso,  se le pedirá que se autentique con su número de empleado y contraseña y el motivo de la entrada.

Si el usuario está en la lista de acceso al edificio (fichero),  se registrará su entrada y se le mostrará la opción de ver **sus** registros de entrada:

1.	Ver registros de entrada (ordenados por fecha y hora)
2.	Salir del menú (acceso al edificio).


Si el usuario pulsa la opción  registro de salida, se le pedirá que se autentique con su número de empleado y contraseña.

Se le permitirá salir si tenía una entrada registrada (sin salida).

**1. Método: Autenticación de Persona**

La persona introduce su numeroEmpleado y password. Si las credenciales son incorrectas, se mostrará un mensaje de error. Si la persona está registrada, se devolverá la instancia de Persona correspondiente.

**2. Métodos : RegistroEntrada, RegistroSalida**

Implementa los dos métodos para que una vez autenticada la persona, se pueda registrar la entrada o salida del edificio, teniendo en cuenta los siguientes requisitos.

Para los registros, se dispone de una colección HashMap, <Entrada,Salida>

No se permite la salida, si no hay una Entrada. Si se trata de registrar una salida, cuando no hay entrada, se lanzará una excepción controlada (checked), que capturará los datos de la persona y la fecha y hora. En el tratamiento de esta excepción, se guardarán los datos en el siguiente formato:

Fecha – hora – usuario: xxxx – “intento de salida sin registro de entrada”

ejemplo:

_2025-04-02 – 18:00:00 – Juán Pérez – 8765334 –intento de salida sin registro de entrada_

No se permite registrar una nueva entrada si no ha registrado antes una salida.

**3. Método: Consulta de Historial**

La persona autenticada podrá ver su historial de accesos, incluyendo fecha y hora de cada entrada y salida.

**Pautas para la Implementación**

-   La clase **Principal** será la única que imprime en consola.
-   No se permite sobrecarga del constructor en la clase Persona.
-   Se manejarán excepciones correctamente.
-   Se utilizará el fichero **personasRegistradas** para acceder a las personas registradas.

----------

Este ejercicio evalúa conocimientos en manejo de colecciones, excepciones, encapsulación y uso de ficheros.
