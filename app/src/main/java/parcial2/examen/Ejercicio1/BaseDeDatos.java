package parcial2.examen.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String, Version> baseDeDatosMap = new HashMap<>();
    private int versionContador = 1;

    public int getVersionContador() {
        return versionContador;
    }

    public void setVersionContador(int versionContador) {
        this.versionContador = versionContador;
    }

    public void addVersion(Version version, String alias){
        versionContador++;
        baseDeDatosMap.put(alias, version);
    }
    public Version getVersion(String alias){
        return baseDeDatosMap.get(alias);
    }


}
