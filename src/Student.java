
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Student extends Person {
    public int amountPaid;
    public int tuition;
    public int balance;
    public int newModule;
    public int repModule;
    public int deposit;
    
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
    
    public Student(int id, String firstName, String lastName, String gender, String phoneNumber, String address) {
        super(id, firstName, lastName, gender, phoneNumber, address);
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
            
            if (rs.next()) {
                
                super.id = rs.getInt("id");
                super.firstName = rs.getString("firstname");
                super.lastName = rs.getString("lastname");            
                super.gender = rs.getString("gender");
                super.phoneNumber = rs.getString("phonenumber"); 
                super.address = rs.getString("address");
                
            } else {
                query.close();
                return false;
            }
            query.close();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println("searchStudent exception: " + ex);
            return false;
        }
        
    }
    
    public boolean updateStudent(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                                   
            sql = "UPDATE students SET "                    
                    + "firstname = ?,"
                    + "lastname = ?,"
                    + "gender = ?,"
                    + "phonenumber = ?,"
                    + "address = ?"                    
                    + "WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, super.firstName);
            ps.setString(2, super.lastName);
            ps.setString(3, super.gender);
            ps.setString(4, super.phoneNumber);
            ps.setString(5, super.address);
            ps.setInt(6, super.id);

            // execute update SQL stetement
            ps.executeUpdate();
            ps.clearParameters();
            return true;
        } catch (Exception ex) {
            System.out.println("Update Student exception: "+ex);
            return false;
        }
    }
    
    public ResultSet getAllStudents() {
        
        try {
            conn = conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement(); 
            sql = "SELECT * FROM students";
            
            rs = query.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println("Unable to get all students.");
            return null;
        }
        
    }
    
    public ResultSet getWithBalance() {
        
        try {
            conn = conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement(); 
            sql = "SELECT "                    
                    + "s.id, "
                    + "s.firstname, "
                    + "s.lastname, "             
                    + "a.tuition, "
                    + "a.deposit, " 
                    + "a.balance " 
                    + "FROM students s INNER JOIN student_accounts a " 
                    + "ON a.id = s.id WHERE a.balance > 0";
            
            rs = query.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println("Unable to get data.");
            return null;
        }
        
    }
    
    public ResultSet getWithoutBalance() {
        
        try {
            conn = conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement(); 
            sql = "SELECT "                    
                    + "s.id, "
                    + "s.firstname, "
                    + "s.lastname, "             
                    + "a.tuition, "
                    + "a.deposit, " 
                    + "a.balance " 
                    + "FROM students s INNER JOIN student_accounts a " 
                    + "ON a.id = s.id WHERE a.balance = 0";
            
            rs = query.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println("Unable to get data.");
            return null;
        }
        
    } 
        
    public boolean searchEnrolled(int id) {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement();
            sql = "select * from student_accounts where id = " + id;            
            rs = query.executeQuery(sql);
            
            if (rs.next()) {
                
                super.id = rs.getInt("id");
                repModule = rs.getInt("repmodule");
                newModule = rs.getInt("newmodule");                
                balance = rs.getInt("balance");
                deposit = rs.getInt("deposit");
                tuition = rs.getInt("tuition");
                
            } else {
                query.close();
                return false;
            }
            query.close();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println("searchEnrolled exception: " + ex);
            return false;
        }
        
    }
    
    public boolean getBalance(int id) {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement();
            sql = "SELECT "                    
                    + "s.id, "
                    + "s.firstname, "
                    + "s.lastname, " 
                    + "a.balance " 
                    + "FROM students s INNER JOIN student_accounts a " 
                    + "ON a.id = s.id WHERE a.id = " + id;           
            rs = query.executeQuery(sql);
            
            if (rs.next()) {
                
                super.id = rs.getInt("id");
                super.firstName = rs.getString("firstname");
                super.lastName = rs.getString("lastname");             
                balance = rs.getInt("balance");                
                
            } else {
                query.close();
                return false;
            }
            query.close();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println("searchEnrolled exception: " + ex);
            return false;
        }
        
    }
    
     public boolean enrollStudent (int id, int repModule, int newModule, int balance, int deposit, int tuition){       
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                                   
            sql = "INSERT INTO student_accounts ("
                    + "id,"
                    + "repmodule,"
                    + "newmodule,"
                    + "balance,"
                    + "deposit,"
                    + "tuition"
                    + ") "
                    + "VALUES (?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, repModule);
            ps.setInt(3, newModule);
            ps.setInt(4, balance);
            ps.setInt(5, deposit);
            ps.setInt(6, tuition);

            ps.executeUpdate();
            ps.clearParameters();
            return true;
        } catch (Exception ex) {
            System.out.println("Add Student exception: "+ex);
            return false;
        }           
        
    }
    
    
    
}

