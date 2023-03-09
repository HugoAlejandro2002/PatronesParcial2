package parcial2.examen.Ejercicio5;


public class Computadora {

    private Programa[] programasAbiertos;

    private IStateComputadora stateComputadora;
    private CPU cpu;
    private MemoriaRam memoriaRam;

    public Computadora() {

        cpu = new CPU(0);
        memoriaRam = new MemoriaRam(0);
        programasAbiertos = new Programa[10];
        stateComputadora = new Apagado();

    }

    public Programa[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(Programa[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public IStateComputadora getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IStateComputadora stateComputadora) {
        this.stateComputadora = stateComputadora;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void viewState() throws InterruptedException {

        stateComputadora.memoryProgramManager(this);

    }



}
