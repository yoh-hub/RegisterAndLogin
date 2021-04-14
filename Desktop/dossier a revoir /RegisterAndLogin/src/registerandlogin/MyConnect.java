
package registerandlogin;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConnect {
    private Object MyConnect;
    
    public int verifLogin(String req) throws SQLException {
        Statement stmt=null;
        Connection connexion=null;
        int nombre=0;
        try {
            String url = "jdbc:mysql://localhost:8889/bddgraph" ;
            String user= "root";
            String password ="";
            connexion = MyConnect.Connexion(url, user, password);
            stmt = (Statement) connexion.createStatement() ;
            ResultSet result = stmt.executeQuery(req) ;

            while (result.next()){
                    nombre = result.getInt(1);
                }
            }
            catch (SQLException e) {
System.out.println("Connection error");
            }
           return nombre;
}            

    
    
}
