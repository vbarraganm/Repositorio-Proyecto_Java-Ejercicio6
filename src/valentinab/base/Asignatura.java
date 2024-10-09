
package valentinab.base;

public class Asignatura {
    
    // Propiedades
    private String nombreAsignatura;
    private String descripcion;
    private int creditos;
    private Profesor profesorResponsable;
    
    // Constructor por defecto
    public Asignatura(){
        this.nombreAsignatura = "Nombre de asignatura no disponible";
        this.descripcion = "Descripción no disponible";
        this.creditos = 0;
        this.profesorResponsable = new Profesor();
    } 
    
    // Constructor con parámetros
    public Asignatura(String nombreAsignatura, String descripcion, int creditos, Profesor profesorResponsable){
        this.nombreAsignatura = nombreAsignatura;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.profesorResponsable = profesorResponsable;
    }

    // Getters y setters
    public String getNombreAsignatura(){
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura){
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public int getCreditos(){
        return creditos;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }

    public Profesor getProfesorResponsable(){
        return profesorResponsable;
    }

    public void setProfesorResponsable(Profesor profesorResponsable) {
        this.profesorResponsable = profesorResponsable;
    }
    
    // Método para mostrar datos
    public void mostrarDatos(){
        System.out.println("El nombre de la asignatura es: " + nombreAsignatura);
        System.out.println("Descripción de la asignatura: " + descripcion);
        System.out.println("Créditos de la asignatura: " + creditos);
        System.out.println("El profesor responsable de esta asignatura es: " + profesorResponsable.nombreProfesor);
    }
}
