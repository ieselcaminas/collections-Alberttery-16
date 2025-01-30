package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tareas implements Comparable<Tareas>{
    int prioridad, duracion;
    Tareas(int p, int d) {
        this.prioridad = p;
        this.duracion = d;
    }

    @Override
    public String toString(){
        return this.prioridad + " " + this.duracion;
    }
    @Override
    public int compareTo(Tareas other){
        if (this.prioridad == other.prioridad) return this.duracion - other.duracion;

        return other.prioridad - this.prioridad;
    }
}

public class PapaNoel {
    public static String ordenar(List<Tareas> tareas){
        StringBuilder sb = new StringBuilder();
        Collections.sort(tareas);
        for (Tareas t:tareas) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        List<Tareas> Datos = new ArrayList<>();
        Datos.add(new Tareas(100, 6));
        Datos.add(new Tareas(20, 4));
        Datos.add(new Tareas(30, 5));
        Datos.add(new Tareas(60, 7));
        Datos.add((new Tareas(30, 2)));
        Datos.add((new Tareas(30, 10)));
        Datos.add((new Tareas(1, 2)));
        System.out.println(ordenar(Datos));
    }
}
