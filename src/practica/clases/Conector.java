package practica.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author luisGonzalez
 */
public class Conector {
    
    private static Connection conn;
    private static Statement stmt;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/practica1_IPC2";
    private String[] conector = new String[8];
    
    public Conector(String[] conector){
        this.conector = conector;
        conn = null;
        stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion establecida");
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO Usuarios VALUES('" + 0 + "','"+conector[0]+"','"+conector[1]+"','"+conector[2]+"','"+conector[3]+"','"+conector[4]+"','"+conector[5]+"')");
                JOptionPane.showMessageDialog(null, "Usuario agregado con exito");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar "+e);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void Desconectar(){
        conn = null;
        if(conn== null){
            System.out.println("Conexion terminada");
        }
    }
}
