import java.sql.*;

public class Educadores {
    
    
     static String todos = "SELECT *  FROM educadores ORDER BY nombree"; 
    
    String curpe, nombree, sexoe, telefonoe, direccione, estadoe;

    public Educadores(String curpe, String nombree, String sexoe, String telefonoe, String direccione, String estadoe) {
        this.curpe = curpe;
        this.nombree = nombree;
        this.sexoe = sexoe;
        this.telefonoe = telefonoe;
        this.direccione = direccione;
        this.estadoe = estadoe;
    }

    // Método INSERTAR
    public int insertar(Connection con) {
        int resultado = 0;
        String sql = "INSERT INTO educadores (curpe, nombree, sexoe, telefonoe, direccione, estadoe) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curpe);
            ps.setString(2, nombree);
            ps.setString(3, sexoe);
            ps.setString(4, telefonoe);
            ps.setString(5, direccione);
            ps.setString(6, estadoe);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
        
        return resultado; 
    }

    public int borrar(Connection con) {
        int resultado = 0;
        String sql = "DELETE FROM educadores WHERE curpe = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1, curpe);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
        
        return resultado; 
    }

    public int actualizar(Connection con) {
        int resultado = 0;
        String sql = "UPDATE educadores SET nombree = ?, sexoe = ?, telefonoe = ?, direccione = ?, estadoe = ? WHERE curpe = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombree);
            ps.setString(2, sexoe);
            ps.setString(3, telefonoe);
            ps.setString(4, direccione);
            ps.setString(5, estadoe);
            ps.setString(6, curpe);
            
            resultado = ps.executeUpdate(); 
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
        return resultado;
    }
}