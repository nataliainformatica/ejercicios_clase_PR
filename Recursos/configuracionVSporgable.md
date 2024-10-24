## Configuración del fichero settings.json

{
    "workbench.colorTheme": "Default Dark+",
    "explorer.confirmDelete": false,
    "window.zoomLevel": -1,
   
          "java.jdt.ls.java.home": "D:\\ruta\\completa\\jdk-17.0.0.1"
    ]
}

## Para probar la versión que se está ejecutando.

public class App {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaVmName = System.getProperty("java.vm.name");

        System.out.println("Versión de Java: " + javaVersion);
        System.out.println("Proveedor de Java: " + javaVendor);
        System.out.println("JVM en uso: " + javaVmName);
    }
}
