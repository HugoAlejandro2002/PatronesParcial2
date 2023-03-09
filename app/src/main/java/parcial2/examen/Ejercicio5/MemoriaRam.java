package parcial2.examen.Ejercicio5;

public class MemoriaRam {

    private int consumo;

    public MemoriaRam(int consumo) {

        this.consumo = consumo;

    }
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void showInfo() {

        System.out.println("----Estado de la memoria RAM----");
        System.out.println("Consumo de la memoria: " + consumo);       
        System.out.println();

    }
}
