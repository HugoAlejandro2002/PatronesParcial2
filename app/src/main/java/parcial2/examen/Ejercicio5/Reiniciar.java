package parcial2.examen.Ejercicio5;

import java.util.Arrays;

public class Reiniciar implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) {

        System.out.println("REINICIAR");
        System.out.println("Cerrando todos los programas...");
        Arrays.fill(computadora.getProgramasAbiertos(), null);
        computadora.getCpu().setConsumo(0);
        computadora.getMemoriaRam().setConsumo(0);
        computadora.getCpu().showInfo();
        computadora.getMemoriaRam().showInfo();

        System.out.println("Transición al estado: REINICIAR finalizada");
        System.out.println();



    }
}
