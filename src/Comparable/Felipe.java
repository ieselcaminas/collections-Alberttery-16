package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Datos implements Comparable<Datos>{
    int prioridad, duracion;
    Datos(int p, int d) {
        this.prioridad = p;
        this.duracion = d;
    }

    @Override
    public String toString(){
        return this.prioridad + " " + this.duracion;
    }
    @Override
    public int compareTo(Datos other){
        if (other.prioridad == this.prioridad) return other.duracion - this.duracion;

        return this.prioridad - other.prioridad;
    }
}

public class Felipe {
    public static String ordenar(List<Tareas> tareas){
        StringBuilder sb = new StringBuilder();
        Collections.sort(tareas);
        for (Tareas t:tareas) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Tareas> tareas = new ArrayList<>();
        tareas.add(new Tareas(1, 6));
        tareas.add(new Tareas(2, 4));
        tareas.add(new Tareas(3, 5));
        tareas.add(new Tareas(3, 7));
        tareas.add((new Tareas(3, 2)));
        System.out.println(ordenar(tareas));
    }
}