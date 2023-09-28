
package proyectoG50.Entidades;

public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean estado;
    
    //bueno, lo mismo que en alumno, pusieron "activo"

    public Materia() {
    }
    
    public Materia(int idMateria, String nombre, int anioMateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
    }

    public Materia(String nombre, int anioMateria, boolean estado) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "NOMBRE  "+nombre +"  AÑO  "+ anioMateria +"  ID  "+ idMateria;
    }
    
    
}
    
    

