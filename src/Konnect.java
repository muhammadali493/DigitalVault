
import java.sql.*;

public class Konnect {
    
    public Connection kon = null;
    public Statement stm;  //To execute mysql queires
    public PreparedStatement st;
    Konnect() {
        try {
            //loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");  //will search for driver class in these packages
            System.out.println("Driver loaded");
            //Establishing connection
            kon = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
            /*getConnection returns connection object on successful otherwise null*/
            System.out.println("Connection established");
            //Creating statement
            stm = kon.createStatement();
            st = kon.prepareStatement("update credentials set Username = ? , Password = ?, URL = ?, Note = ? where SiteName = ?");

        } catch (ClassNotFoundException e) { 
            System.out.println("Exception " + e.getMessage());
        } catch (SQLException e) { //For (sqlexceptions)
            System.out.println("SQLException " + e.getMessage());
        }
        
        /*........Close connection on logout......*/
//        try{
//            kon.close();
//        }
//        catch(SQLException e){
//            System.out.println("SQL Exception: "+e.getMessage());
//        }
    }
    /*.....Main method here.......*/
    public static void main(String[] args) {
        new Konnect();
    }
}
