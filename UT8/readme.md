## Ejercicio 1: Propagación de excepción con throws
Crear una clase que simule una operación bancaria en la que se intenta realizar un retiro de dinero
de una cuenta. Si el saldo es insuficiente, se debe lanzar una excepción que se propaga.


## Ejercicio 2: Propagación de excepciones en múltiples niveles
Simular un proceso de compra en una tienda, donde diferentes métodos podrían lanzar excepciones
y estas se propagan hasta el método main.
Ejercicio 3: Uso de excepciones en una jerarquía de clases
Crear una jerarquía de clases para gestionar una empresa con trabajadores y excepciones
relacionadas con salarios.
Ejercicio 4: Propagación de excepciones entre clases
Crear una clase Cajero que realice una operación de pago y que propague excepciones si los datos
ingresados no son correctos.
Ejercicio 5: Excepciones personalizadas con try-catch y finally
Crear una clase para manejar un sistema de inventarios con excepciones personalizadas. Al final de
cada operación, imprimir un mensaje de cierre con el bloque finally.

# Ejercicios para trabajar con excepciones propias checked (comprobadas)

## Ejercicio 3: PhoneNumberAlreadyExistsException 

### Versión 1
1. Descarga los fuente iniciales
2. Crea la excepción PhoneNumberAlreadyExistsException en el paquete es.daw.poo2.exceptions.
3. En el método **validatePhone** de la clase PhoneNumberRegisterService implementa el código para comprobar si el número existe en la lista de números proporcionados. Observa cómo se crea el List.
**NUEVO:** método contains de ArrayList

4. Cuando dicha lista contenga el número recibido como argumento, debe crear, lanzar y propagar la excepción con el mensaje "El número de teléfono XXXXX está en uso por otro cliente!"
5. En la clase principal haz la prueba con varios números de teléfono, uno que no esté repetido y otro que lo esté ("+34 222 222 222", "+34 111 111 113") 

Deberás obtener algo similar a esto:

![alt text](image.png)
