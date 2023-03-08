package parcial2.examen.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args){
        List<Estudiante> estudianteList = new ArrayList<>();

        estudianteList.add(new Estudiante("789546", "Ramiro", "12/10/02", "Administracion"));
        estudianteList.add(new Estudiante("123389", "Henry", "08/11/99", "Comercial"));
        estudianteList.add(new Estudiante("456434", "Juan", "21/05/05", "Ing de Software"));
        estudianteList.add(new Estudiante("189234", "Mario", "25/12/01", "Derecho"));
        estudianteList.add(new Estudiante("987523", "Paul", "30/10/00", "Arquitectura"));

        EstrategiaOrdenamiento estrategiaOrdenamiento = new EstrategiaOrdenamiento(estudianteList);

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorCI());
        estrategiaOrdenamiento.ordenar();

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorNombre());
        estrategiaOrdenamiento.ordenar();

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorCarrera());
        estrategiaOrdenamiento.ordenar();

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }



    }

}
