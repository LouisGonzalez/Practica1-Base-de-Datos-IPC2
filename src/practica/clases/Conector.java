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
    private static final String url = "jdbc:mysql://localhost:3306/Code_n_Bugs";
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
                stmt.executeUpdate("INSERT INTO Usuarios VALUES('"+conector[0]+"','"+conector[1]+"','"+conector[2]+"','"+conector[3]+"','"+conector[4]+"','"+conector[5]+"','"+conector[6]+"')");
                JOptionPane.showMessageDialog(null, "Usuario agregado con exito");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar "+e);
            JOptionPane.showMessageDialog(null, "Ya existe un usuario con este identificador, porfavor escribe un identificador diferente.");
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
