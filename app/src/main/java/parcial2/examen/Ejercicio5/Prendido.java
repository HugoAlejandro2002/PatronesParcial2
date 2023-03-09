package parcial2.examen.Ejercicio5;

import java.util.Random;

public class Prendido implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) throws InterruptedException {

        System.out.println("PRENDIDO");

        int randomNumberOfPrograms = new Random().nextInt(10-1) +1; //Hasta 10, ya que el arreglo es de tamaño 10 por defecto

        for(int i = 0; i<randomNumberOfPrograms; i++) {

            computadora.getProgramasAbiertos()[i] = new Programa("Programa " + (i+1));

        }

        System.out.println("Numero de programas encendidos: " + randomNumberOfPrograms);


        int aumentoDeRecursos = randomNumberOfPrograms*5;

        System.out.println("Por esto, se consume un "+aumentoDeRecursos+"%");

        computadora.getCpu().setConsumo(aumentoDeRecursos);
        computadora.getMemoriaRam().setConsumo(aumentoDeRecursos);

        computadora.getCpu().showInfo();
        computadora.getMemoriaRam().showInfo();

        System.out.println("Transición al estado: PRENDIDO finalizada");
        System.out.println();



    }
}
