import java.sql.*;

public class Responsables {
    
    static String todos = "SELECT *  FROM responsables ORDER BY nombrer"; 
    
    String curpr, nombrer, sexor, telefono, parentesco, estador;

    public Responsables(String curpr, String nombrer, String sexor, String telefono, String parentesco, String estador) {
        this.curpr = curpr;
        this.nombrer = nombrer;
        this.sexor = sexor;
        this.telefono = telefono;
        this.parentesco = parentesco;
        this.estador = estador;
    }

    public int insertar(Connection con) {
        int resultado = 0;
        String sql = "INSERT INTO responsables (curpr, nombrer, sexor, telefono, parentesco, estador) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curpr);
            ps.setString(2, nombrer);
            ps.setString(3, sexor);
            ps.setString(4, telefono);
            ps.setString(5, parentesco);
            ps.setString(6, estador);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
        
        return resultado; 
    }

    public int borrar(Connection con) {
        int resultado = 0;
        String sql = "DELETE FROM responsables WHERE curpr = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1, curpr);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
        
        return resultado; 
    }

    public int actualizar(Connection con) {
        int resultado = 0;
        String sql = "UPDATE responsables SET nombrer = ?, sexor = ?, telefono = ?, parentesco = ?, estador = ? WHERE curpr = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombrer);
            ps.setString(2, sexor);
            ps.setString(3, telefono);
            ps.setString(4, parentesco);
            ps.setString(5, estador);
            ps.setString(6, curpr);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
        return resultado;
    }
}