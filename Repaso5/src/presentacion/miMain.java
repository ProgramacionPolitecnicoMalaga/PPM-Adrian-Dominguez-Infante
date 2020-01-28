package presentacion;
import modelo.Categoria;
import modelo.Fechas;
import modelo.Tarea;
import negocio.Tareas;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class miMain{
    private static Interfaz interfaz;

    public static void main(String[] args) throws ParseException {
        interfaz = new Interfaz();
        Tareas tareas = null;

        Fechas NuevaFecha = new Fechas(new GregorianCalendar(2014,02,11).getTime());

        int opcion = -1;
        while (opcion != 10){
            opcion = interfaz.obtenerOpción();
            switch (opcion) {
                case 1:
                    Tarea tarea1 = new Tarea(new Categoria("Ocio"), new Fechas(new Date(2020,04,20)));
                    System.out.println(tarea1);
                    tareas.anadirTarea();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    interfaz.despedida();
                    break;
                default:
                    interfaz.fueraRango();
                    break;
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
