Trabajar con fechas en Java solía ser difícil. La biblioteca de fechas antiguas proporcionada por JDK incluía solo tres clases: java.util.Date, java.util.Calendar y java.util.Timezone .




Estos solo eran adecuados para las tareas más básicas. Para cualquier cosa remotamente compleja, los desarrolladores tuvieron que usar bibliotecas de terceros o escribir toneladas de código personalizado.

Java 8 introdujo una API de fecha y hora completamente nueva ( java.util.time.* ) que se basa libremente en la popular biblioteca de Java llamada JodaTime. Esta nueva API simplificó drásticamente el procesamiento de fecha y hora y solucionó muchas deficiencias de la biblioteca de fechas anterior.

La nueva API tiene muchas representaciones de tiempo diferentes, cada una adecuada para diferentes casos de uso:

Instantáneo : representa un punto en el tiempo (marca de tiempo)
LocalDate : representa una fecha (año, mes, día)
LocalDateTime : igual que LocalDate , pero incluye la hora con una precisión de nanosegundos
OffsetDateTime : igual que LocalDateTime , pero con desplazamiento de zona horaria
LocalTime : hora con precisión de nanosegundos y sin información de fecha
ZonedDateTime : igual que OffsetDateTime , pero incluye una ID de zona horaria
OffsetLocalTime : igual que LocalTime , pero con desplazamiento de zona horaria
MonthDay : mes y día, sin año ni hora
YearMonth : mes y año, sin día ni hora
Duración : cantidad de tiempo representada en segundos, minutos y horas. Tiene precisión de nanosegundos
Período : cantidad de tiempo representada en días, meses y años.

Otra ventaja es que todas las representaciones de tiempo en Java 8 Date Time API son inmutables y, por lo tanto, seguras para subprocesos.







LocalDate, LocalTime y LocalDateTime

Las clases más comunes para el manejo de fechas con java 8 son LocalDate, LocalTime y LocalDateTime, se utilizan cuando la zona horaria no es requerida.

LocalDate

Un LocalDate representa una fecha en formato ISO (yyyy-MM-dd) sin tiempo. Veamos algunos ejemplos:

1
2
	
LocalDate date = LocalDate.now();
System.out.println(date);

El código anterior tendrá la siguiente salida(Entendiendo que el post se escribió el 30-10-2018):

1
	
2018-10-30

Como vemos es una fecha sin tiempo y sin zona horaria. Veamos algunas otras formas de crear un LocalDate:

1
2
	
LocalDate date2 = LocalDate.of(2018, 10, 30);
LocalDate date3 = LocalDate.parse("2018-10-30");

Las 2 expresiones crearán objetos de tipo LocalDate con la fecha del 30-10-2018.

Operaciones que se pueden realizar con LocalDate

Una vez que sabemos como construir un LocalDate el siguiente paso será conocer el tipo de operaciones que se pueden realizar con el.

Manipulación de fechas (Sumar o restar días, meses, años, etc ):
1
2
3
4
	
LocalDate date = LocalDate.parse("2018-10-30");
LocalDate newDate = date.plusDays(10);
System.out.println(date);
System.out.println(newDate);

Salida:

1
2
	
2018-10-30
2018-11-09

Como vemos a la fecha inicial se le sumaron 10 días y el mes se actualizó de forma automática, esto nos permite evitar considerar el número de días en un mes, el horario de verano, etc.

1
2
3
4
	
LocalDate date = LocalDate.parse("2018-10-30");
LocalDate newDate = date.plusMonths(3);
System.out.println(date);
System.out.println(newDate);

Salida:

1
2
	
2018-10-30
2019-01-30

De igual forma podemos hacerlo con los meses y LocalDate resolverá si es necesario cambiar de año.

Recordemos que cuando hacemos operaciones sobre las fechas debemos asignar la respuesta a una nueva referencia ya que el objeto original no se modificará puesto que los objetos LocalDate son immutables.

Comparación entre fechas

Así como podemos realizar operaciones entre las fechas podemos hacer comparaciones entre ellas, veamos algunos ejemplos:

Valida si una fecha es antes que otra:

1
	
System.out.println(LocalDate.parse("2018-10-30").isBefore(LocalDate.parse("2018-10-31")));

Salida

1
	
true

Valida si un año es bisiesto:

1
	
System.out.println(LocalDate.parse("2018-10-30").isLeapYear());

Salida:

1
	
false

Podemos realizar validaciones muy simples sin necesidad de escribir código complejo.

Obtener información sobre alguna fecha

El siguiente paso será obtener información sobre alguna fecha en específico veamos algunos ejemplos:

Obtener el día de la semana de mi cumpleaños:

1
	
System.out.println(LocalDate.parse("2019-08-19").getDayOfWeek());

Salida:

1
	
MONDAY

Extraer información de una fecha:

1
	
System.out.println(LocalDate.parse("2019-08-19").getDayOfWeek());

Salida:

1
	


Si lo único que necesitamos de una fecha es el mes podemos fácilmente extraerlo .

Podemos ver el detalle de todos los métodos disponibles de la clase LocalDate en el siguiente link.

LocalTime

LocalTime representa una hora sin la fecha, del mismo modo que con LocalDate podemos crearlo haciendo uso de los métodos now(), parse(..) y of(..), veamos algunos ejemplos:

1
2
3
4
5
6
	
LocalTime time = LocalTime.now();
LocalTime time2 = LocalTime.parse("11:00:59.759");
LocalTime time3 = LocalTime.of(11, 00, 59);
System.out.println(time);
System.out.println(time2);
System.out.println(time3);

Salida:

1
2
3
	
11:02:06.198
11:00:59.759
11:00:59

Las 3 anteriores son formas válidas de crear un objeto LocalTime. Veamos algunas de las operaciones que podemos realizar.

Modificar un LocalTime

La primera operación que veremos es como modificar un LocalTime:

1
2
3
	
LocalTime time = LocalTime.parse("11:00:59.759");
LocalTime time2 = time.plusHours(1);
System.out.println(time2);

Salida:

	
12:00:59.759

Con el método plusHours crearemos un nuevo LocalTime con la nueva hora calculada.

Validar un LocalTime

El siguiente punto será hacer validaciones sobre un LocalTime:


LocalTime time = LocalTime.parse("11:00:59.759");
LocalTime time2 = LocalTime.parse("12:00:59.759");
System.out.println(time.isBefore(time2));

Salida:


	
true

Usando métodos como isBefore podremos saber si una hora es mayor a otra.

Extraer información de una hora:

El siguiente paso será extraer solo una parte del objeto LocalTime:


LocalTime time = LocalTime.parse("11:00:59.759");
System.out.println(time.getHour());

Salida:


Esto lo utilizaremos en caso de que nuestra aplicación utilice solo la hora para realizar algún proceso.

LocalDateTime

La siguiente clase a analizar será LocalDateTime la cual representa una combinación entre LocalDate y LocalTime, veamos como crearlo:

	
LocalDateTime dateTime = LocalDateTime.now();
LocalDateTime dateTime1=LocalDateTime.of(2018, 10, 10, 11, 25);
LocalDateTime dateTime2=LocalDateTime.parse("2018-10-10T11:25");

System.out.println(dateTime);
System.out.println(dateTime1);
System.out.println(dateTime2);

Salida:


	
2018-10-30T11:46:58.274
2018-10-10T11:25
2018-10-10T11:25

En la salida anterior podemos ver como la salida incluye fecha y hora por cada objeto. Veamos algunas de las operaciones que podemos realizar con estos objetos.

Manipular un LocalDateTime:

De igual forma que con los anteriores podemos realzar manipulaciones sobre el LocalDateTime:


LocalDateTime dateTime=LocalDateTime.parse("2018-10-10T11:25");
LocalDateTime newDateTime = dateTime.plusDays(1).plusHours(2);

System.out.println(newDateTime);

Lo anterior creará un objeto LocalDateTime le agregará 1 día y después 2 horas, recordemos que debemos asignar el resultado a una nueva referencia ya que el objeto original no se modificará sino que se devolverá uno nuevo.

Realizar validaciones sobre un LocalDateTime

Como lo vimos en los ejemplos anteriores podemos realizar validaciones sobre el LocalDateTime:


	
LocalDateTime dateTime=LocalDateTime.parse("2018-10-10T11:25");
LocalDateTime dateTime2=LocalDateTime.parse("2019-10-10T11:25");

System.out.println(dateTime.isBefore(dateTime2));

Salida:

1
	
true

Se realizará del mismo modo que en los casos anteriores solo que ahora considerará tanto la fecha como la hora.


