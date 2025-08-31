package javaapplication12;
import java.sql.*;

public class JavaApplication12 {

    public static void deleted(int id){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","");
            String s="DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(s);
            
            ps.setInt(1, id);
            
            int r = ps.executeUpdate();
            if(r > 0){
                System.out.println("DELETED");
            } else {
                System.out.println("ID NOT FOUND");
                conn.close();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","");
            System.out.println("CONNECTED SUCCESSFULLY");
            String sq="INSERT INTO students(ID,Name,Marks,Total,Grade)VALUES(?,?)";
            PreparedStatement ps=conn.prepareStatement(sq);
            
            ps.setString(101, "Moriom ,70,100,A-");
            ps.setString(102, "jannatul,75,100,A");
            ps.setString(103, "Riya,80,100,A+");
            ps.setString(104, "Fariya,78,100,A");
            ps.setString(105, "Maliha,92,100,A+");
             
            ps.executeUpdate();
            System.out.println("INSERTED");
            conn.close();
            
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
    
