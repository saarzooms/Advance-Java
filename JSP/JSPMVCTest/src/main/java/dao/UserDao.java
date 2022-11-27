package dao;

import bean.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
    public static int save(User u){
        int affecttedRow=0;
        try{
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String query = "insert into users(username, pwd, city, country, mobile_no, email_id) " +
                    "values(" +
                    "'"+u.getUsername()+"', '"+u.getPwd()+"','"+u.getCity()+"','"+u.getCountry()+"','"+u.getMobileNo()+"'," +
                    "'"+u.getEmailId()+"')";
            affecttedRow = stmt.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }

        return affecttedRow;
    }
    public static boolean validate(User u){
        boolean isValid = false;
        try {
                Connection conn = getConnection();
                Statement s = conn.createStatement();
                String qry = "select * from users where username='"+u.getUsername()+"' and pwd='"+u.getPwd()+"'";
                System.out.println(qry);
                if(s.executeQuery(qry).next()){
                    isValid = true;
                }
        }catch(Exception e){
            System.out.println(e);
        }
        return isValid;
    }
    public static List<User> getAllUsers(){
        List<User> uList = new ArrayList<User>();
        try {
            Connection conn = getConnection();
            Statement s = conn.createStatement();
            String qry = "select * from users";
            ResultSet rs =s.executeQuery(qry);
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setCity(rs.getString("city"));
                u.setMobileNo(rs.getString("mobile_no"));
                u.setEmailId(rs.getString("email_id"));
                uList.add(u);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return uList;
    }
}
