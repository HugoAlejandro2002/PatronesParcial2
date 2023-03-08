package parcial2.examen.Ejercicio4;

import java.util.List;

public class OrdenarPorCarrera implements IStrategy {

    @Override
    public List<Estudiante> ordenar(List<Estudiante> listaEstudiantes) {
        System.out.println("Sort by Career");
        listaEstudiantes.sort((e1, e2) -> e1.getCarrera().compareTo(e2.getCarrera()));
        return listaEstudiantes;
    }
}
