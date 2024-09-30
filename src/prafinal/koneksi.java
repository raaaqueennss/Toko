
package prafinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    private static Connection Koneksi;
    
    public static Connection getkoneksi() throws SQLException{
        if (Koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/prafinal";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("Berhasil");
                                
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return Koneksi;
    }
    public static void main(String args[]) throws SQLException{
        getkoneksi();
    }
}
    
       

    


    

