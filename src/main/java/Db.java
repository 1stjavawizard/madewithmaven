import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    public static void main(String[] args) {
        boolean truthy = false;
  try {
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","");
      if(cn != null){
          truthy = true;
          System.out.println("This is connected");
      }
   else{
       truthy = false;
          System.out.println("This is not connected");
      }
  }
  catch (SQLException e){
      System.out.println(e.getMessage());
  }

    }
}
