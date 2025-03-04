COLLECCIONES

## Ejercicio 1

Se requiere desarrollar una aplicación en Java, repasando la orientación a objetos, para gestionar gastos compartidos entre un grupo de participantes. 
Repasaremos herencia abstracta, interfaces y excepciones. 

La aplicación debe permitir registrar ingresos y gastos, calcular los saldos individuales y determinar cuánto debe pagar o recibir cada participante para equilibrar los costos.

Se usará herencia abstracta para definir una clase base **Persona**.
Se implementará una interfaz **Transaccion** , que será utilizada por Gasto e Ingreso.

Gestión de Participantes y Transacciones

La clase **Participante**  representará a cada persona involucrada en los gastos.

Cada Participante tendrá una lista de Transaccion (gastos e ingresos).

Se podrá agregar transacciones (gastos o ingresos) a un participante.
Si el  participante tiene mayor importe en ingresos que en gastos, se propagará una excepción **ImportePositivoExcepcion**,  con los datos del participante y el importe resultante. 

Se podrá consultar el importe pendiente de cada participante (gastos - ingresos).

Gestión de **Gastos**  e  **Ingresos**

La clase Gasto representará un gasto con un importeGasto(double),  categoría (tipo enumerado)  y detalle(String).

La clase Ingreso representará un ingreso con un importeIngredo(double) y descripción (String).

Gasto lanzará una excepción personalizada (GastoInvalidoException) si el monto es negativo (tanto desde el constructor, como desde el setter)

Cálculo de Saldos Pendientes

En la clase **GestionGastos** , se implementará un método calcularPendientes, que:


Determinará la cuota equitativa dividiendo el total de gastos entre el número de participantes.
Indicará cuánto debe pagar o recibir cada participante. 

Manejo de Excepciones
TODAS LAS EXCEPCIONES SE MANEJAN EN LA CLASE GestionGastos
Se almacenarán las excepciones de ImportePositivoExcepcion en una coleccion para en un futuro poder tratarlas. 

Ejemplo de Funcionamiento
Si tres participantes han registrado los siguientes gastos e ingresos:

Ana: Gasto de 30€ en comida, Ingreso de 50€
Juan: Gasto de 20€ en transporte, Ingreso de 30€
Luis: Gasto de 50€ en entradas
El programa calculará cuánto ha pagado y cuánto debería haber pagado cada uno, y mostrará los saldos pendientes de cada participante.
