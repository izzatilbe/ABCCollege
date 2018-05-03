
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Teacher extends Person {
    private String department;
    private String designation;
    
    public final static String DRIVER="org.apache.derby.jdbc.ClientDriver";
    public final static String URL="jdbc:derby://localhost:1527/ABCCollege";
    public final static String USERNAME="admin";
    public final static String PASSWORD="admin";
    
    static Statement query;
    static PreparedStatement ps;
    static CallableStatement cs;
    static ResultSet rs;
    static Connection conn;   

    public Teacher(String firstName, String lastName, char gender, String phoneNumber, String address) {
        super(firstName, lastName, gender, phoneNumber, address);
    }
    
    public boolean addStudent (String fname, String lname, char gender, String phone, String address){       
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement();
            query.executeUpdate("insert into students values (next value for stud_id_seq, "
                    +fname+","
                    +lname+","
                    +gender+","
                    +phone+","
                    +address+","
                    +");");
            return true;
        } catch (Exception ex) {
            System.out.println("Add Student exception: "+ex);
            return false;
        }           
        
    }
    
    public boolean delStudent (int id){
         
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement(); 
            query.executeUpdate("DELETE FROM STUDENTS WHERE ID = "+id);
            
            return true;
             
        } catch (Exception ex) {
            System.out.println("delStudent  exception: "+ex);
            return false;
        } 
         
    }
}
