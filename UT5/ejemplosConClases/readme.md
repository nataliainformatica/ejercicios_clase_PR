## Ejercicio  7 .

Diseñar la clase Texto que gestiona una cadena de caracteres con algunas
características:

 La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.

 Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la
longitud máxima, es decir, exista espacio disponible.

 Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y
cuando no se rebase el tamaño máximo establecido.

 Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

 Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha
y hora de la última modificación efectuada.

 Deberá existir un método que muestre la información que gestiona cada texto.



Ejercicio LIBRERÍA

Nuestro objetivo es hacer una aplicación que nos permita gestinar una pequeña librería. 
Para ello debemos seguir los siguientes requisitos: 

La librería podrá tener como máximo 20 libros. 
Al arrancar nuestra aplicación no hay ningún libro. 

La aplicación nos mostrará un menú: 

1. Modificar libros existentes
   1.1 Introduce un libro
   1.2 Elimina un libro (por ISBN) 
    
2. Venta  de un libro
4. Valoración de un usuario para un título (por ISBN)
5. Muestra los datos de un libro (por ISBN)
6. Muestra los datos de todos los libros



   Cada libro tiene los siguientes atributos:

   Título , autor, Sinopsis, ISBN, precio, stock, valoración  (son datos imprescindibles en el momento de crear el libro en la librería, la valoración inicial es cero). 

  Valoración,  es como en la reseñas de una web, son votos positivos o negativos, y se almacena el total. 
  Por lo tanto, la clase libro tendrá un método que recibirá el valor "POSITIVO" O "NEGATIVO" que modificará la calificación del libro. 

 Una vez creado el libro, no es posible modificar sus atributos, si se crea con un valor erróneo, sería necesario eliminarlo y volver a crearlo.  

  







