
package sistema.de.veterinaria;
import java.util.ArrayList;
public class Dueño {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int DNI;
    private int telefono;   
    private ArrayList<Mascota> listaMascotas;
    
    public Dueño() {
        listaMascotas = new ArrayList<>();
    }
    
    public Dueño(String Nombre, String Apellido, String Direccion, int DNI, int telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.DNI = DNI;
        this.telefono = telefono;
        this.listaMascotas = new ArrayList<>();
    }

    // Getters y Setters
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    // ← NUEVO: Método para agregar mascota
    public void agregarMascota(Mascota m) {
        listaMascotas.add(m);
    }
    
    // ← NUEVO: Getter de mascotas
    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    @Override
    public String toString() {
        return "Dueño: " + Nombre + " " + Apellido + " (DNI: " + DNI + ") - Mascotas: " + listaMascotas.size();
    }
    
}