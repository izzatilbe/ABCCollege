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
    public final static String USERNAME="administrator";
    public final static String PASSWORD="password";
    
    static Statement query;
    static PreparedStatement ps;
    static CallableStatement cs;
    static ResultSet rs;
    static Connection conn;
    String sql;

    public Teacher(String firstName, String lastName, String gender, String phoneNumber, String address, String department, String designation) {
        super(firstName, lastName, gender, phoneNumber, address);
        this.department = department;
        switch (designation) {
            case "Lecturer":
                this.designation = "L";
                break;
            case "Head of Faculty":
                this.designation = "HOF";
                break;
            case "Coordinator":
                this.designation = "CO";
                break;
        }
                    
    }
    
    public Teacher(){
        
    }
    
    public boolean addTeacher (){       
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                                   
            sql = "INSERT INTO teachers ("
                    + "id,"
                    + "firstname,"
                    + "lastname,"
                    + "gender,"
                    + "phonenumber,"
                    + "address,"
                    + "department,"
                    + "designation"
                    + ") "
                    + "VALUES (next value for teacher_id_seq,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, super.firstName);
            ps.setString(2, super.lastName);
            ps.setString(3, super.gender);
            ps.setString(4, super.phoneNumber);
            ps.setString(5, super.address);
            ps.setString(6, department);
            ps.setString(7, designation);

            // execute insert SQL stetement
            ps.executeUpdate();
            ps.clearParameters();;
            return true;
        } catch (Exception ex) {
            System.out.println("Add Teacher exception: "+ex);
            return false;
        }          
        
    }
    
     public boolean delTeacher(){
         
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement(); 
            query.executeUpdate("DELETE FROM TEACHERS WHERE ID = " + id);
            return true;
             
        } catch (Exception ex) {
            System.out.println("delTeacher exception: " + ex);
            return false;
        } 
         
    }
    
    public boolean searchTeacher(int id) {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement();
            sql = "select * from teachers where id = " + id;            
            rs = query.executeQuery(sql);
            while (rs.next()) {
                super.id = rs.getInt("id");
                super.firstName = rs.getString("firstname");
                super.lastName = rs.getString("lastname");            
                
            }
        query.close();
        return true;
            
        } catch (Exception ex) {
            System.out.println("searchTeacher exception: " + ex);
            return false;
        }
        
    }
}
