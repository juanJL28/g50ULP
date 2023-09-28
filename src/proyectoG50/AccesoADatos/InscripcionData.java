package proyectoG50.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectoG50.Entidades.Alumno;
import proyectoG50.Entidades.Inscripcion;
import proyectoG50.Entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {

        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inscripción guardada con éxito.");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripción: " + ex.getMessage());
        }
    }                      //

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT nota, idAlumno, idMateria FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Double nota = rs.getDouble("nota");
                int idAlumno = rs.getInt("idAlumno");
                int idMateria = rs.getInt("idMateria");
                Alumno alumno = aluData.buscarAlumno(idAlumno);
                Materia materia = matData.buscarMateria(idMateria);
                Inscripcion inscripcion = new Inscripcion(alumno, materia, nota);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones: " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) { // IDEA: PODRIA USAR MAP.HASH MAP
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT nota, idMateria FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Double nota = rs.getDouble("nota");
                int idMateria = rs.getInt("idMateria");
                Alumno alumno = aluData.buscarAlumno(idAlumno);
                Materia materia = matData.buscarMateria(idMateria);//buscar materia un mtodo de materiaData
                Inscripcion inscripcion = new Inscripcion(alumno, materia, nota);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones por alumno: " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT idMateria FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idMateria = rs.getInt("idMateria");
                
                Materia materia = matData.buscarMateria(idMateria);
                materias.add(materia);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias cursadas por alumno: " + ex.getMessage());
        }
        return materias;
    }
  

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        List<Materia> materiasNoCursadas = new ArrayList<>();
        String sql = "SELECT idMateria, nombre, anioMateria,estado FROM materia "
                + "WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idMateria = rs.getInt("idMateria");
                String nombre = rs.getString("nombre");
                int anioMateria = rs.getInt("anioMateria");
                boolean estado = rs.getBoolean("estado");

                Materia materia = new Materia(idMateria, nombre, anioMateria, estado);
                materiasNoCursadas.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias no cursadas por el alumno: " + ex.getMessage());
        }

        return materiasNoCursadas;
    }

    


    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filasBorradas = ps.executeUpdate();

            if (filasBorradas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripción eliminada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la inscripción para eliminar.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la inscripción: " + ex.getMessage());
        }
        
}

public void actualizarNota(int idAlumno,int idMateria, Double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la inscripción.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la nota: " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT idAlumno FROM inscripcion WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idAlumno = rs.getInt("idAlumno");
                Alumno alumno = aluData.buscarAlumno(idAlumno);
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos por materia: " + ex.getMessage());
        }
        return alumnos;
    }

}
