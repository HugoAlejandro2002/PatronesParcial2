package parcial2.examen.Ejercicio2;


public interface Mediator {
    void sendAll(String msg, Jugador jugador);

    void sendTeam(String msg, Jugador jugador) throws ClassNotFoundException;
}
