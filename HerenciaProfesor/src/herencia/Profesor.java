package herencia;

public class Profesor extends Persona {
    private String facultad;
    private String materia;
    
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);  //este metodo llama al constructor del padre
        //this.nombre = "Ing. "+this.nombre;
    
    }
    
    public Profesor (String nombre, String apellido, String facultad, String materia){
        super (nombre, apellido);
        this.facultad = facultad;
        this.materia = materia;
    }
    

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
}
