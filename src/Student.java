
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Student extends Person {
    private int amountPaid;
    private int tuitionFee;
    private int balance;
    private int numberOfModules;
    private int numberOfRepeat;
    
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

    public Student(String firstName, String lastName, String gender, String phoneNumber, String address) {
        super(firstName, lastName, gender, phoneNumber, address);
    }
    
    public Student(){
        
    }
    
    public boolean addStudent (){       
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                                   
            sql = "INSERT INTO students ("
                    + "id,"
                    + "firstname,"
                    + "lastname,"
                    + "gender,"
                    + "phonenumber,"
                    + "address"
                    + ") "
                    + "VALUES (next value for stud_id_seq,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, super.firstName);
            ps.setString(2, super.lastName);
            ps.setString(3, super.gender);
            ps.setString(4, super.phoneNumber);
            ps.setString(5, super.address);

            // execute insert SQL stetement
            ps.executeUpdate();
            ps.clearParameters();
            return true;
        } catch (Exception ex) {
            System.out.println("Add Student exception: "+ex);
            return false;
        }           
        
    }
    
    public boolean delStudent(){
         
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement(); 
            query.executeUpdate("DELETE FROM STUDENTS WHERE ID = " + id);
            return true;
             
        } catch (Exception ex) {
            System.out.println("delStudent exception: " + ex);
            return false;
        } 
         
    }
    
    public boolean searchStudent(int id) {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement();
            sql = "select * from students where id = " + id;            
            rs = query.executeQuery(sql);
            while (rs.next()) {
                super.id = rs.getInt("id");
                super.firstName = rs.getString("firstname");
                super.lastName = rs.getString("lastname");            
                
            }
        query.close();
        return true;
            
        } catch (Exception ex) {
            System.out.println("searchStudent exception: " + ex);
            return false;
        }
        
    }
}

