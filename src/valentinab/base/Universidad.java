
package valentinab.base;

public class Universidad {
    
    // Propiedades
    private String nombreUni;
    private String ubicacionUni;
    private int numFacultades;
    private int numEstudiantes;
    
    // Constructor por defecto
    public Universidad(){
        this.nombreUni = "Universidad desconocida";
        this.ubicacionUni = "Ubicación no asignada";
        this.numFacultades = 0;
        this.numEstudiantes = 0;
    }
    
    // Constructor con parámetros
    public Universidad(String nombreUni, String ubicacionUni, int numFacultades, int numEstudiantes){
        this.nombreUni = nombreUni;
        this.ubicacionUni = ubicacionUni;
        this.numFacultades = numFacultades;
        this.numEstudiantes = numEstudiantes;
    }
    
    // Getters y setters 
    public String getNombreUni(){
        return nombreUni;
    }

    public void setNombreUni(String nombreUni){
        this.nombreUni = nombreUni;
    }

    public String getUbicacionUni(){
        return ubicacionUni;
    }

    public void setUbicacionUni(String ubicacionUni){
        this.ubicacionUni = ubicacionUni;
    }

    public int getNumFacultades(){
        return numFacultades;
    }

    public void setNumFacultades(int numFacultades){
        this.numFacultades = numFacultades;
    }

    public int getNumEstudiantes(){
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes){
        this.numEstudiantes = numEstudiantes;
    }
    
    // Método para mostrar datos
    public void mostrarDatos(){
        System.out.println("El nombre de la universidad es: " + nombreUni);
        System.out.println("La universidad está ubicada en: " + ubicacionUni);
        System.out.println("Número de facultades de la universidad: " + numFacultades);
        System.out.println("Número de estudiantes de la universidad: " + numEstudiantes);
    }
}
