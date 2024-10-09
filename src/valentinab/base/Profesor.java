
package valentinab.base;

public class Profesor {
    
    // Propiedades
    public String nombreProfesor;
    private String especialidad;
    private int tiempoExperiencia;
    private String email;
    
    // Constructor por defecto
    public Profesor(){
        this.nombreProfesor = "Profesor/a desconocido";
        this.especialidad = "Especialidad no encontrada";
        this.tiempoExperiencia = 0;
        this.email = "Email desconocido";
    }
    
    // Constructor con parámetros
    public Profesor(String nombreProfesor, String especialidad, int tiempoExperiencia, String email){
        this.nombreProfesor = nombreProfesor;
        this.especialidad = especialidad;
        this.tiempoExperiencia = tiempoExperiencia;
        this.email = email;
    }
    
    // Getters y setters
    public String getNombreProfesor(){
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor){
        this.nombreProfesor = nombreProfesor;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public int getTiempoExperiencia(){
        return tiempoExperiencia;
    }
    
    public void setTiempoExperiencia(){
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    // Método para mostrar datos
    public void mostrarDatos(){
        System.out.println("El nombre del profesor/a es: " + nombreProfesor);
        System.out.println("La especialidad del profesor/a es: " + especialidad);
        System.out.println("El email del profesor/a es: " + email);
        System.out.println("El tiempo de experiencia en años del profesor/a es de: " + tiempoExperiencia);
    }
}
