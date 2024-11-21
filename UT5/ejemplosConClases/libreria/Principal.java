import java.util.Scanner;

public class Principal {
    private static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        

        Libro[] libreria = new Libro[20]; 
       
        mostrarMenu(libreria);
    }

    public static void mostrarMenu( Libro[] libreria) {
        String opcion;
        int contador=0; 
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
                        libreria[contador] = libro; 
                        contador++; 
                        // TODO comprobar que no hemos llegado al máximo

                        break;
                    case "1.2":
                    // TODO PARA EL EJERICIO AMPLIADO
                        // PEDIR ISBN PARA ELIMINAR EL LIBRO EN EL ARRAY

                        break;
                    default:
                        System.out.println("OPCIÓN NO VÁLIDA");
                        break;
                }

                break;
            case "2": 
               // Venta de un libro (por ISBN)
               System.out.println("DIME EL ISBN DEL LIBRO ");
               String ISBN = sc.nextLine(); 
               buscarLibro(ISBN);

                 
            

            default:
                break;
        }

    }
    public static Libro buscarLibro(String ISBN){
            // CON EL ISBN, RECORRO EL ARRAY Y BUSCO EL LIBRO

            
        return 

    }

    public static Libro pedirDatosLibro() {
        // Título , autor, Sinopsis, ISBN, precio, stock,
        String titulo, autor, sinopsis, ISBN;
        double precio;
        int stock;
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
            stock =0; 
        }
        
        Libro libro = new Libro(titulo, autor, sinopsis, ISBN, precio, stock); 
        return libro; 
    }

}
