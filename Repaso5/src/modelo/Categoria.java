package modelo;

public class Categoria {

    private String nombreCat;

    public Categoria(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombreCat='" + nombreCat + '\'' +
                '}';
    }
}
