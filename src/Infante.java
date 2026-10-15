import java.sql.*;

public class Infante {
    
    
   static String todos = "SELECT *  FROM infantes ORDER BY nombrei"; 
   static String curps = "SELECT curp FROM infantes ORDER BY curp";
    
    String curp, nombrei, sexoi, fecha_nan, estado;

    public Infante(String curp, String nombrei, String sexoi, String fecha_nan, String estado) {
        this.curp = curp;
        this.nombrei = nombrei;
        this.sexoi = sexoi;
        this.fecha_nan = fecha_nan;
        this.estado = estado;
    }

    Infante() {
    }

    public int insertar(Connection con) {
        int resultado = 0;
        String sql = "INSERT INTO infantes (curp, nombrei, sexoi, fecha_nan, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curp);
            ps.setString(2, nombrei);
            ps.setString(3, sexoi);
            ps.setString(4, fecha_nan);
            ps.setString(5, estado);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
        
        return resultado; 
    }

    // Método BORRAR
    public int borrar(Connection con) {
        int resultado = 0;
        String sql = "DELETE FROM infantes WHERE curp = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1, curp);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
        
        return resultado; 
    }

    // Método ACTUALIZAR
    public int actualizar(Connection con) {
        int resultado = 0;
        String sql = "UPDATE infantes SET nombrei = ?, sexoi = ?, fecha_nan = ?, estado = ? WHERE curp = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombrei);
            ps.setString(2, sexoi);
            ps.setString(3, fecha_nan);
            ps.setString(4, estado);
            ps.setString(5, curp);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
        return resultado;
    }
}