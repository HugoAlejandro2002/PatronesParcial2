package parcial2.examen.Ejercicio5;

import java.util.Arrays;

public class Apagado implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) {

        System.out.println("APAGADO");
        Arrays.fill(computadora.getProgramasAbiertos(), null);
        computadora.getCpu().setConsumo(0);
        computadora.getMemoriaRam().setConsumo(0);
        computadora.getCpu().showInfo();
        computadora.getMemoriaRam().showInfo();

        System.out.println("Transición al estado: APAGADO finalizada");
        System.out.println();



    }
}
