## Ejercicio 1: Propagación de excepción con throws
Crear una clase que simule una operación bancaria en la que se intenta realizar un retiro de dinero
de una cuenta. Si el saldo es insuficiente, se debe lanzar una excepción que se propaga.


## Ejercicio 2: Propagación de excepciones en múltiples niveles
Simular un proceso de compra en una tienda, donde diferentes métodos podrían lanzar excepciones
y estas se propagan hasta el método main.

## Ejercicio 3: Uso de excepciones en una jerarquía de clases
Crear una jerarquía de clases para gestionar una empresa con trabajadores y excepciones
relacionadas con salarios.

## Ejercicio 4: Propagación de excepciones entre clases
Crear una clase Cajero que realice una operación de pago y que propague excepciones si los datos
ingresados no son correctos.

## Ejercicio 5: Excepciones personalizadas con try-catch y finally
Crear una clase para manejar un sistema de inventarios con excepciones personalizadas. Al final de
cada operación, imprimir un mensaje de cierre con el bloque finally.

# Ejercicios para trabajar con excepciones propias checked (comprobadas)

## Ejercicio 6: PhoneNumberAlreadyExistsException 

### Versión 1
1. Descarga los fuente iniciales que están en Git.
   Dispones de la clase principal RegisterClientApp, en la que haremos las pruebas registrando un cliente con la clase PhoneNumberRegisterService (que deberás completar). 
3. Crea la excepción PhoneNumberAlreadyExistsException en el paquete es.daw.poo2.exceptions.
4. En el método **validatePhone** de la clase PhoneNumberRegisterService implementa el código para comprobar si el número existe en la lista de números proporcionados. Observa cómo se crea el List.

**NUEVO:** método contains de ArrayList, para comprobar si existe el número. 

5. Cuando dicha lista contenga el número recibido como argumento, debe crear, lanzar y propagar la excepción con el mensaje "El número de teléfono XXXXX está en uso por otro cliente!"
6. En la clase principal haz la prueba con varios números de teléfono, uno que no esté repetido y otro que lo esté ("+34 222 222 222", "+34 111 111 113")
7. Implementa en la clase PhoneNumberRegisterService la funcionalidad que permite consultar la lista de números de teléfono.
8. Desde la clase RegisterClientApp prueba a recorrer la lista de teléfonos y mostrándolos por pantalla.
   

Deberás obtener algo similar a esto:

<img width="635" alt="image" src="https://github.com/user-attachments/assets/ee5ba4a8-0741-45e3-b157-fc2dff7f97e4" />



### Versión 2: trabajando con objetos cliente
Vamos a ampliar el ejercicio anterior.

Para ello vamos a crear la **clase Client** (es.daw.poo2.model) en base al siguiente **ClientDAO** que debes crear en el paquete es.daw.poo2.dao:

```
package es.daw.poo2.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import es.daw.poo2.model.Client;

public class ClientDAO {
    private ArrayList<Client> clients;

    public ClientDAO() {
        clients = new ArrayList<>();
        clients.add(new Client("2A", "Cliente2", "+34 111 111 112",LocalDate.parse("2024-02-28")));
        clients.add(new Client("1A", "Cliente1", LocalDate.parse("2024-02-27")));
        clients.add(new Client("3A", "Cliente3", "+34 111 111 113",LocalDate.parse("2024-02-29")));
        clients.add(new Client("4B", "Cliente4", "+34 111 111 114",LocalDate.parse("2024-02-29")));
    }

    public ArrayList<Client> select(){
        //return (ArrayList<Cliente>)clientes.clone();
        return new ArrayList<>(clients);
    }
    
}

```

Debes tener en cuenta que para dar de alta un cliente se puede hacer de dos formas:
- Con el código, nombre, número de teléfono y fecha de registro.
- Con el código, nombre y fecha de registro

En el caso de que un cliente se de de alta sin número de teléfono deberá indicarse "WITHOUT_PHONE" en dicho atributo.

Solo el número de teléfono podrá modificarse una vez creado el cliente en el sistema.

En el método **validatePhone** de la clase PhoneNumberRegisterService implementa el código para comprobar si el número existe un cliente con un teléfono en cuestión. La firma del método será:

```
public void validatePhone(ArrayList<Client> clients, String phoneNumber) throws PhoneNumberAlreadyExistsException
```

# EJERCICIO 7: Nos piden hacer que gestionemos una serie de productos.

Los productos tienen los siguientes atributos:

- Nombre
- Precio

Tenemos dos tipos de productos:

- *Perecedero:* tiene un atributo llamado días a caducar
- *No perecedero:* tiene un atributo llamado tipo con solo uno de estos dos valores ("Sin devolución", "Permite devolución");

Crea sus constructores, getters, setters y toString.

## Función calcular
Tendremos una función llamada *calcular*, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos.

En **No perecedero**, simplemente seria multiplicar el precio por la cantidad de productos pasados.

En **Perecedero**, aparte de lo que hace producto, el precio se reducirá según los días a caducar:

- Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
- Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
- Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.

En **NoPerecedero**, hace lo mismo que en producto.

## Pruebas: 

Crea una clase ejecutable y crea un array de productos y muestra el precio total de vender 5  productos de cada uno. Crea tú mismo los elementos del array.

## Pregunta: ¿Utilizarías una clase abstracta? Razona la respuesta

## NUEVOS REQUISITOS

### REQUISITO 1
Debemos ampliar el programa anterior de tal forma que se podrá consultar si el producto tiene devolución (true o false), siguiendo el siguiente criterio.

- Si son **perecederos** solo pueden devolverse cuando le queda más de 5 días para caducar.
- Si **no son perecederos** solo pueden devolverse en el caso de que el tipo sea "Permite devolución".



#### Pregunta: ¿Utilizarías una clase abstracta? ¿Qué método sería abstracto? Razona la respuesta


### REQUISITO 2
Todos los productos, al igual que todos los clientes y proveedores (producto, cliente y proveedor son clases del programa de gestión de la tienda) deben poder exportarse a formato XML.

Para ello cada producto debe tener implementado el método **convert2XML()**

Este método devuelve un String con el formato del xml de cada objeto.

El xml en el que se convierten los productos, clientes y proveedores son diferentes.

#### Ejemplos de String devuelto por cada clase:

##### XML de productos

&lt;producto&gt;bla bla bla&lt;producto&gt;
  
##### XML de clientes
&lt;cliente&gt;bla bla bla&lt;cliente&gt;
  
##### XML de proveedores
&lt;proveedor&gt;bla bla bla&lt;proveedor&gt;

#### Pregunta: ¿Utilizarías una interface? Razona tu respuesta

No se pide programar las clases Cliente, Proveedor..... pero sí la interface y su implementación en la clase Producto.

## ORDENACIÓN

### Ordenación natural: interfaz Comparable

Ahora queremos establecer el criterio natural de ordenación de todos los productos.

Los productos se ordenarán de forma natural por el precio (siempre por defecto ascendente).

Con el uso de la interface **Comparable** implementa dicha funcionalidad y muestra los productos ordenados.

### Otras ordenaciones: interfaz Comparator (para la tercera evaluación)

Necesitamos generar un informe de los productos ordenados por nombre de forma descendente.

Con el uso de la interface **Comparator** implementa dicha funcionalidad y muestra los productos ordenados por nombre de forma descendente.

