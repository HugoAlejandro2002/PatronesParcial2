package parcial2.examen.Ejercicio4;

import java.util.List;

public class OrdenarPorCI implements IStrategy {

    @Override
    public List<Estudiante> ordenar(List<Estudiante> listaEstudiantes) {
        System.out.println("Sort by CI");
        listaEstudiantes.sort((e1, e2) -> e1.getCi().compareTo(e2.getCi()));
        return listaEstudiantes;
    }
}
