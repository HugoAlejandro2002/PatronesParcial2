package parcial2.examen.Ejercicio2;

public class Main {

    public static void main(String[]args) throws ClassNotFoundException {
        ChatJuego mediator = new ChatJuego();

        Estudiante estudiante1 = new Estudiante(mediator, "alias1", "Ander", "Veterano");
        Estudiante estudiante2 = new Estudiante(mediator, "alias2", "Andrea", "Novato");
        Estudiante estudiante3 = new Estudiante(mediator, "alias3", "Veggeta", "Marine");

        Docente docente1 = new Docente(mediator, "alias4", "Pull", "Cadete");
        Docente docente2 = new Docente(mediator, "alias5", "NOSEQ", "Brigadier");
        Docente docente3 = new Docente(mediator, "alias6", "Saurio", "Soldado");

        mediator.addJugador(estudiante1);
        mediator.addJugador(estudiante2);
        mediator.addJugador(estudiante3);
        mediator.addJugador(docente1);
        mediator.addJugador(docente2);
        mediator.addJugador(docente3);

        docente1.sendTeam("Pidan la tarea");

        estudiante1.sendTeam("Pasa la tarea");

        estudiante3.sendAll("Dia de entrega");


    }

}
