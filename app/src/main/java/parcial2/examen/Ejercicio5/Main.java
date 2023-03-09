package parcial2.examen.Ejercicio5;

public class Main {

    public static void main (String[] args) throws InterruptedException {

        Computadora computadora = new Computadora();

        computadora.viewState();

        computadora.setStateComputadora(new Reiniciar());

        computadora.viewState();

        computadora.setStateComputadora(new Prendido());

        computadora.viewState();

    }

}
