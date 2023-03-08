package parcial2.examen.Ejercicio3;

public interface ISubject {
    void subscribirUsuario(IObserver observer, TipoNotificacion tipoNotificacion);
    void desubscribirUsuario(IObserver observer, TipoNotificacion tipoNotificacion);
    void notifyObservers(String msg, TipoNotificacion tipoNotificacion);
}
