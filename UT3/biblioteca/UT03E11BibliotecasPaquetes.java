package ejercicios_clase_PR.UT3.biblioteca;

// En muchas ocasiones crearemos funciones que se pueden reutilizar en 
// diversos programas. Cuando esto suceda, podríamos copiar nuestras 
// funciones de un programa a otro para emplearlas, pero esto no es muy 
// eficiente y hace que el mantenimiento del código sea tedioso y propenso 
// a errores.

// Para solucionar este problema existen las bibliotecas de funciones, 
// o paquetes. Estas bibliotecas suelen aportar funcionalidad para resolver 
// algún problema concreto, por ejemplo una biblioteca de funciones para 
// realizar diferentes operaciones matemáticas, o para trabajar con cadenas 
// de texto, o para generar diferentes tipos de laberintos.

// Estas bibliotecas podrán ser exportadas e importadas por los diferentes 
// programas para emplearlas.

// Las bibliotecas de funciones, o paquetes, pueden ser creadas por nosotros 
// mismos, creadas por un tercero, o perteneces a la lista de bibliotecas 
// propias del lenguaje Java.

// Cuando hablamos de las bibliotecas y paquetes propios del lenguaje Java, 
// nos solemos referir a ellas como API del lenguaje (Application Programming 
// Interface). Su organización sigue una metodología muy similar al trabajo 
// con carpetas al que estamos acostumbrados en nuestros diferentes sistemas 
// operativos.

// Para emplear las bibliotecas de funciones o paquetes que necesitemos en 
// nuestro programa debemos importarlas (a excepción de las que están 
// contenidas en java.lang).

// Ejemplos de importación:
// import misfunciones.FuncionesMatematicas;
// import misfunciones.*;
// import java.util.Scanner;


import java.util.Scanner;
import java.util.StringTokenizer;
import misfunciones.FuncionesMatematicas;

public class UT03E11BibliotecasPaquetes {

    public static void main(String[] args) {
        // Usando bibliotecas y paquetes propios
        System.out.println("-----Usando mis funciones de un paquete-----");
        System.out.println("Operaciones con 10 y 2");
        int respuesta;
        respuesta = FuncionesMatematicas.sumar(10, 2);
        System.out.println("Suma: " + respuesta);
        respuesta = FuncionesMatematicas.restar(10, 2);
        System.out.println("Resta: " + respuesta);
        respuesta = FuncionesMatematicas.multiplicar(10, 2);
        System.out.println("Multiplicación: " + respuesta);
        respuesta = FuncionesMatematicas.dividir(10, 2);
        System.out.println("División: " + respuesta);
        // Los saludos
        FuncionesSaludar.SaludoNormal();
        FuncionesSaludar.SaludoEnIngles();
        FuncionesSaludar.SaludoPersonalizado("Pepe");
        // OJO! Como la clase FuncionesSaludar se encuentra en mi mismo
        // paquete no he necesitado importarlo, pero como la clase
        // FuncionesMatematicas está en otro paquete lo he tenido que
        // importar para poder usarlo.
        
        // Usando bibliotecas y paquetes del lenguaje
        System.out.println("-----Usando paquetes de Java-----");
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer("esto es una prueba");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
        // Importando otros paquetes y bibliotecas
        // En el desarrollo profesional de software se emplean
        // unas herramientas conocidas como gestores de dependencias.
        // Estos gestores son unos programas que se encargan de 
        // importar y mantener actualizados los paquetes que
        // empleamos en nuestra aplicación.
        // Dos de los gestores de dependencias más empleados en
        // Java son Maven y Gradle.
        // Por el momento está bien que comiences a familiarizarte
        // con estos términos, pero es pronto para comenzar a 
        // trabajar con ellos.

    }
    
}


// Ejercicio 1.
// Crea una nueva clase en el paquete mis funciones y programa alguna 
// función para que se pueda usar desde la clase con el método main de 
// tu programa.

// Ejercicio 2.
// Crea un paquete llamado FuncionesEstadisticas dentro del paquete 
// FuncionesMatematicas, crea una clase con alguna función, impórtala en 
// tu clase con el método main y úsala.

// Ejercicio 3.
// Ve a la función restar de la clase FuncionesMatematicas. Borra la 
// palabra static en la declaración de la función y familiarízate con 
// el error que arroja nuestro programa principal. Busca información sobre 
// esta palabra clave “static”. No es imprescindible que entiendas todo 
// lo que encuentres (más adelante en el curso hablaremos de static en clase), 
// es solo una forma de introducirte a la búsqueda de información y resolución 
// de problemas.

// Ejercicio 4.
// Explora algunas clases del paquete java.lang y de java.util en la 
// documentación oficial de la API.

// Ejercicio 5.
// Busca información sobre Maven, algún vídeo simple, o algún blog servirá. 
// Cuando le veas/leas crea un nuevo proyecto en NetBeans, pero esta vez que 
// sea Java with Maven -> Java Application. Echa un vistazo a los archivos 
// que se han generado.
