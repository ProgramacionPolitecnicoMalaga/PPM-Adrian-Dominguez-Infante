package modelo;

public class Tarea {
    Categoria nombreCat;
    Fechas fecha;

    public Tarea(Categoria nombreCat, Fechas fecha) {
        this.nombreCat = nombreCat;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "categoria=" + nombreCat +
                ", fecha=" + fecha +
                '}';
    }
}
