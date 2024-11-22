import java.util.Scanner;

public class Principal {
    private static Scanner sc = new Scanner(System.in);

    // es necesario hacer la variable static, para que se pueda llamar desde main
    // siempre que se está en entorno static cualquier función o variable que no sea
    // local
    // tiene que ser static

    private static Libro[] libreria;

    public static void main(String[] args) {

        libreria = new Libro[20];

        mostrarMenu();
    }

    public static void mostrarMenu() {
        String opcion;
        String ISBN;
        int contador = 0;
        System.out.println("1. Modificar libros existentes ");
        opcion = sc.nextLine();
        // TODO - bucle para continuar en el menú hasta salir
        switch (opcion) {
            case "1":
                System.out.println("1.1 Introduce un libro");
                System.out.println("1.2 Elimina un libro");
                opcion = sc.nextLine();

                switch (opcion) {
                    case "1.1":
                        // INTRODUCIR LOS DATOS DE UN LIBRO
                        Libro libro = pedirDatosLibro();
                        // vamos a gestionar el buscar el primer hueco (null) en la librería

                        // TODO informar según el resultado

                        // libreria[contador] = libro;
                        // contador++;

                        break;
                    case "1.2":
                        System.out.println("Qué libro quieres eliminar de la librería");
                        ISBN = sc.nextLine();

                        // ELIMINAR EL LIBRO EN EL ARRAY

                        break;
                    default:
                        System.out.println("OPCIÓN NO VÁLIDA");
                        break;
                }

                break;
            case "2":
                // Venta de un libro (por ISBN)
                System.out.println("DIME EL ISBN DEL LIBRO ");
                ISBN = sc.nextLine();
                Libro libro = buscarLibro(ISBN);

                if (libro != null) {

                    // comprobar el stock, y si tiene suficiente, restar uno
                    // e informar de la venta
                    if (libro.venderLibro()) {
                        System.out.println("Se ha relizado con  " +
                                "éxito la venta del libro " + libro.getTitulo());
                    } else {
                        System.out.println(
                                "No se ha podido realizar la venta, " +
                                        "el stock del libro es " + libro.getStock());
                    }
                } else
                    System.out.println("No tenemos ese libro");

            default:
                break;
        }

    }

    public static boolean eliminarLibro(String isbn) {
        boolean resultado = false;
        // recorrer el array para buscar el libro que tenga isbn
        // en la posición en la que esté libro, voy a sustituirlo por null

        // libreria {"Instancia de: El Quijote", Instancia: "El señor de los anillos",
        // null..... Instancia: "EL hobit"}
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i].getIsbn().equals(isbn)) {
                libreria[i] = null;
                return true;
            }

        }

        return false;

    }

    public static Libro buscarLibro(String ISBN) {
        // CON EL ISBN, RECORRO EL ARRAY Y BUSCO EL LIBRO

        // {"Instancia de: El Quijote", null,null,null.....null}
        for (int i = 0; i < libreria.length; i++) {

            try {
                if (ISBN.equals(libreria[i].getIsbn())) {
                    return libreria[i];
                }
            } catch (Exception ex) {

            }

        }

        // SINTAXIS DEL FOR EACH - EQUIVALENTE AL CÓDIGO ANTERIOR
        /*
         * 
         * for(Libro l: libreria){
         * if(ISBN.equals(l.getIsbn())){
         * return l;
         * }
         * 
         * }
         */

        return null;
    }

    public static boolean pedirDatosLibro() {
        // Título , autor, Sinopsis, ISBN, precio, stock,
        String titulo, autor, sinopsis, ISBN;
        double precio;
        int stock;
        boolean continua = true;
        boolean encontrado = false; 
        
        /// vamos a buscar un hueco en la librería para añadir el libro
        ///
        int contador = 0;
        while (continua) {
            if (libreria[contador] == null) {
                encontrado = true; 
                // tengo hueco, guardo el libro
                continua = false;
                
                // contador almacena la posición del índice
            } else
                contador++;
        } // end while

        if(!encontrado){
            // no hay hueco en la librería, no hace falta pedir los datos          
            return false; 
        }
        // si hay hueco, que es la posición contador

        System.out.println("Titulo ");
        titulo = sc.nextLine();
        System.out.println("autor ");
        autor = sc.nextLine();
        System.out.println("Sinopsis ");
        sinopsis = sc.nextLine();
        System.out.println("ISBN ");
        ISBN = sc.nextLine();

        try {
            System.out.println("precio");
            precio = Double.parseDouble(sc.nextLine());
        } catch (Exception ex) {
            System.out.println("EL VALOR INTRODUCIDO NO ES VÁLIDO, SE MODIFIA POR CERO");
            precio = 0;
        }
        try {
            System.out.println("precio");
            stock = Integer.parseInt(sc.nextLine());
        } catch (Exception ex) {
            System.out.println("EL VALOR INTRODUCIDO NO ES VÁLIDO, SE MODIFIA POR CERO");
            stock = 0;
        }

        libreria[contador]=  new Libro(titulo, autor, sinopsis, ISBN, precio, stock);


        return true;
    }

}
