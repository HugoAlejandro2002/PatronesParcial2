package parcial2.examen.Ejercicio3;

public class Usuario implements IObserver {
    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println(">"+ this.nombre + ": recibio la notificacion: " + msg);
    }
}
