import java.util.Scanner;
// El número máximo de candidatos que se puede presentar es 3, y el mínimo es 1

public class Ejercicio2 {
    private static final int MAX_CANDIDATOS = 3;
    private static final int MIN = 1;
    private static final int MAX_VOTANTES = 33;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean continua = true;
        int numCandidatos = 0;
        String[] nombreCandidatos;
        int[] votosCandidatos; 
        int numVotos = 0;
        int opcion = 0;
        int aux =0; 
        int posicion =0; 

        // la aplicación comenzará pidiendo el número de candidatos
        // (no permitirá respuestas menores a 1 y mayores a 3)

        do {
            System.out.println("EL NÚMERO DEBE SER ENTRE 1 Y 3");
            System.out.println("INDICA EL NÚMERO DE CANDIDATOS QUE SE PRESENTAN");
            try {
                numCandidatos = Integer.parseInt(sc.nextLine());
                if (numCandidatos >= MIN && numCandidatos <= MAX_CANDIDATOS) {
                    continua = false;
                }
            } catch (Exception ex) {
                System.out.println("NO HAS INTRODUCIDO UN NÚMERO");
            }

        } while (continua);

        // después pedirá el nombre de cada uno de los candidatos
        nombreCandidatos = new String[numCandidatos];
        // creo también el array para contabilizar después los votos
        // que tiene cada candidato
        votosCandidatos = new int[numCandidatos]; 
        for (int i = 0; i < numCandidatos; i++) {
            System.out.println("Introduce el nombre del candidato : " + (i + 1));
            nombreCandidatos[i] = sc.nextLine();
        }

        // RECUENTO DE VOTOS
        // se introducirán los votos emitidos.
        // No se permiten respuestas de votos emitidos mayores al nḿero de votantes o
        // menores 1

        do {
            System.out.println("EL NÚMERO DEBE SER ENTRE 1 Y 33");
            System.out.println("INDICA EL NÚMERO VOTOS");
            try {
                numVotos = Integer.parseInt(sc.nextLine());
                if (numVotos >= MIN && numVotos <= MAX_VOTANTES) {
                    continua = false;
                }
            } catch (Exception ex) {
                System.out.println("NO HAS INTRODUCIDO UN NÚMERO");
            }

        } while (continua);

        // REGISTRO DE VOTOS
        // Se muestran los candidaots para que se pueda registrar el voto

        for (int j = 0; j < numVotos; j++) {
            System.out.println("Selecciona el candidato que ha recibido el voto: ");
            for (int i = 0; i < nombreCandidatos.length; i++) {
                System.out.println((i + 1) + nombreCandidatos[i]);
            }
            do {
                continua = true;
                try {
                    opcion = Integer.parseInt(sc.nextLine());
                    if (opcion >= MIN && opcion <= numCandidatos) {
                        continua = false;
                    }
                } catch (Exception ex) {
                    System.out.println("No es un número");

                }
            } while (continua);
            //  opción indica el candidato votado
            opcion = opcion-1;
            votosCandidatos[opcion]++ ; 
            // finaliza el registro de votos
        }
            // muestra el candidato elegido como delegado

            // aquí hay que comprobar qué posición del array tiene más votos

            for(int i=0; i< votosCandidatos.length; i++){
                if  (votosCandidatos[i]> aux ){
                    aux = votosCandidatos[i]; 
                    posicion= i; 
                }
            }
            System.out.println("EL CANDIDATO GANADOR ES ");
            System.out.println(nombreCandidatos[posicion]);

            // después muestra los votos que ha recibido cada candidato
            for(int i=0; i< nombreCandidatos.length; i++){
                System.out.println("El candidato " 
                + nombreCandidatos[i] + "ha recibido "+votosCandidatos[i]);
            }


            // mediante la llamada a la función 
      
    }

    public static void mostrarParticipacion (int numeroVotantes, int totalVotos){
        int valor = MAX_VOTANTES - numeroVotantes; 
            System.out.println(" El número de votos emitidos ha sido " + numeroVotantes);
            System.out.println("Las abstenciones ha sido "+ valor);
        ; 

    }
    // TODO se podría refactorizar la petición de enteros
    // en una función, para evitar repetir código

}
