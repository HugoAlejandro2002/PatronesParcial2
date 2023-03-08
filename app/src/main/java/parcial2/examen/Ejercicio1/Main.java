package parcial2.examen.Ejercicio1;

public class Main {
    public static void main(String[] ardssd) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        VersionadorArchivo versionadorArchivo = new VersionadorArchivo();

        Archivo archivo = new Archivo(versionadorArchivo, baseDeDatos);

        archivo.addTexto("este documento es una prueba\n");
        archivo.addTexto("el exito solo depende de tu esfuerzo\n");
        archivo.addTexto("prologo\n");
        archivo.addTexto("este documento fue actualizado satisfactoriamente\n");

        System.out.println("Version Final");
        archivo.showInfo();

        System.out.println("Version 1");
        archivo = versionadorArchivo.restoreVersion(baseDeDatos.getVersion("version1"));
        archivo.showInfo();

    }
}
