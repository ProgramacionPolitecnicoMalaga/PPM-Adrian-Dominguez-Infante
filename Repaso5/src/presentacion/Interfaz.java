package presentacion;

import java.util.Scanner;

public class Interfaz {
    Scanner userInput;

    public Interfaz(){
        userInput = new Scanner(System.in).useDelimiter("\n");
    }

    public int obtenerOpción(){
        System.out.println(
                "1. Crear una nueva categoría.\n" +
                "2. Mostrar las categorías existentes.\n" +
                "3. Crear una nueva tarea.\n" +
                "4. Consultar las tareas pendientes.\n" +
                "5. Eliminar una tarea (completada).\n" +
                "6. Consultar las tareas de una categoría.\n" +
                "7. Consultar las tareas en una fecha.\n" +
                "8. Consultar las tareas en tiempo.\n" +
                "9. Consultar las tareas retrasadas. \n" +
                "10. Terminar"
        );
        return userInput.nextInt();
    }

    public void despedida() {
        System.out.println("Adiós");
    }

    public void fueraRango(){
        System.out.println("Has elegido una opción fuera de rango..");
    }
}