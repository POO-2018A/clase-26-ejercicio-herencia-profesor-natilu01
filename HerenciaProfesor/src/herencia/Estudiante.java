
package herencia;

public class Estudiante extends Persona {  //Heredamos la clase Estudiante de Persona

    private int edad;
    private String nombreCompleto;
    private String materia;
    
    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.edad = this.edad;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    

    @Override
    public String toString() {
        return " "+edad;
    }
        
  
    
}
