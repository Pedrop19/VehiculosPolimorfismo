import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Variables
        Scanner strs = new Scanner(System.in);
        Scanner ent = new Scanner(System.in);
        int opc = 0;

        // LinkedList
        LinkedList<Vehiculo> vehiculos = new LinkedList<>();
        LinkedList<Persona> personas = new LinkedList<>();

        // Vehiculos
        Camion camion = new Camion("555X", 200, Remolque.PESADO);
        Coche coche = new Coche("666X", 120, 20);
        Moto moto = new Moto("777X", 200, 2);
        vehiculos.add(camion);
        vehiculos.add(coche);
        vehiculos.add(moto);

        // Personas
        Persona persona = new Persona("111X", "Alberto", Categoria.NOVEL);
        Persona persona2 = new Persona("222X", "Jose", Categoria.INTERMEDIO);
        Persona persona3 = new Persona("333X", "Paco", Categoria.PROFESIONAL);
        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);

        do {
            System.out.println("-- DGT --");
            System.out.println("Eliga la operación [1-4]: ");
            System.out.println("1. Mostrar vehiculos y Vmax");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Mostrar opciones de persona");
            System.out.println("4. Salir");
            opc = ent.nextInt();

            switch (opc) {
                case 1:
                    for (Vehiculo v : vehiculos)
                        System.out.println(v.toString());
                    break;
                case 2:
                    for (Persona p : personas)
                        System.out.println(p.toString());
                    break;
                case 3:
                    for (Persona p : personas) 
                        System.out.println(p.toString());
                    System.out.println("Introduce el dni de la persona: ");
                    String dni = strs.nextLine();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getDni().equals(dni)) {
                            personas.get(i).puedeConducir(vehiculos);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo de la app...");
                    break;
                default:
                    System.out.println("ERROR: Opcion no disponible");
            }

        } while (opc != 4);
    }

}
