
package caracteres.ejemploBufferedReaderWriter;

public class TestMain {

    public static void main(String[] args) {
        EscribeUsuarioBuffered es = new EscribeUsuarioBuffered();
        es.escribirUsuario();
        Usuario usuario;
        LeerUsuarioBuffered le = new LeerUsuarioBuffered();
        usuario = le.devolver();
        System.out.println(usuario);
    }

}
