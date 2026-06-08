
package sistema.de.veterinaria;

public class Mascota {
  private String NombreMascota;
  private String especie;
  private String Raza;
  private int edad;
  private String sexo;
  private int Tamaño;
  private String Color;
  private int FechaNacimiento;

    public Mascota() {
    }

    public Mascota(String NombreMascota, String especie, String Raza, int edad, String sexo, int Tamaño, String Color, int FechaNacimiento) {
        this.NombreMascota = NombreMascota;
        this.especie = especie;
        this.Raza = Raza;
        this.edad = edad;
        this.sexo = sexo;
        this.Tamaño = Tamaño;
        this.Color = Color;
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    
    @Override
    public String toString() {
        return "Mascota{" + "NombreMascota=" + NombreMascota + ", especie=" + especie + ", Raza=" + Raza + ", edad=" + edad + ", sexo=" + sexo + ", Tama\u00f1o=" + Tamaño + ", Color=" + Color + ", FechaNacimiento=" + FechaNacimiento + '}';
    }
  
}
