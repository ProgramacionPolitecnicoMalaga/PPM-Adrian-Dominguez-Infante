package negocio;
import modelo.Categoria;
import modelo.Fechas;

import java.util.ArrayList;
import java.util.Iterator;

public class Tareas {

    public Tareas(ArrayList<Tareas> tareasList) {
        this.tareasList = tareasList;
    }

    ArrayList<Tareas> tareasList = new ArrayList<Tareas>();

    public Tareas(Categoria categoria, Fechas date) {
    }

    public void anadirTarea(Tareas tarea){
        tareasList.add(tarea);
        System.out.println("Tarea añadida.");
    }

    public void consultarTarea(){
        Iterator<Tareas> iterator = tareasList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void eliminarTarea(Tareas tarea){

    }

}
