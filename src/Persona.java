import java.util.LinkedList;

public class Persona {

    // Atributos
    private String dni;
    private String nombre;
    private Categoria categoria;

    // Constructor
    public Persona(String dni, String nombre, Categoria categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Metodo para comprobar si puede conducir el vehiculo o no
    public void puedeConducir(LinkedList<Vehiculo> vehiculos) {
        for (int i = 0; i < vehiculos.size(); i++) {
            switch (this.categoria) {
                case NOVEL:
                    if (vehiculos.get(i).getPotencia() <= 100)
                        System.out.println("La persona con dni: " + this.dni + " puede conducir el vehiculo: "
                                + vehiculos.get(i).toString());
                    else
                        System.out.println("La persona con dni: " + this.dni + " no puede conducir el vehiculo: "
                                + vehiculos.get(i).toString());
                    break;
                case INTERMEDIO:
                    if (vehiculos.get(i).getPotencia() <= 160)
                        System.out.println("La persona con dni: " + this.dni + " puede conducir el vehiculo: "
                                + vehiculos.get(i).toString());
                    else
                        System.out.println("La persona con dni: " + this.dni + " no puede conducir el vehiculo: "
                                + vehiculos.get(i).toString());
                    break;
                case PROFESIONAL:
                    System.out.println("La persona con dni: " + this.dni + " puede conducir el vehiculo: "
                            + vehiculos.get(i).toString());
                default:
                    break;
            }
        }
    }

    // ToString
    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + "]";
    }
}
