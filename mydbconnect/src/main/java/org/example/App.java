package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
            if(connection!=null){
                System.out.println("Connection done");
            }else{
                System.out.println("issue in connection");
            }
            CallableStatement callableStatement =  null;
            String sql = "{call getStudentByStd(?) }";
            callableStatement = connection.prepareCall(sql);
            callableStatement.setInt("std",4);
            ResultSet resultSet= callableStatement.executeQuery();
            while(resultSet.next()){
                System.out.print(resultSet.getInt(1));
                System.out.print(resultSet.getString(2));
                System.out.print(resultSet.getInt(3));
                System.out.println(resultSet.getInt(4));
            }
            callableStatement.setInt("std",2);
            resultSet= callableStatement.executeQuery();
            while(resultSet.next()){
                System.out.print(resultSet.getInt(1));
                System.out.print(resultSet.getString(2));
                System.out.print(resultSet.getInt(3));
                System.out.println(resultSet.getInt(4));
            }
            PreparedStatement preparedStatement = null;
            String psql = "Select * from student where std = ? and status = ?";
            preparedStatement = connection.prepareStatement(psql);
            preparedStatement.setInt(1,1);
            preparedStatement.setInt(2,1);
            resultSet = preparedStatement.executeQuery();
            System.out.println("Prepare statement=====");
            while(resultSet.next()){
                System.out.print(resultSet.getInt(1));
                System.out.print(resultSet.getString(2));
                System.out.print(resultSet.getInt(3));
                System.out.println(resultSet.getInt(4));
            }
            Statement stmnt =  connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = stmnt.executeQuery("select * from student");

            resultSet.absolute(1);
            resultSet.moveToInsertRow();
            resultSet.updateString("name", "Test");
            resultSet.updateInt("std", 6);
            resultSet.updateInt("status", 1);
            resultSet.insertRow();
            resultSet.absolute(3);
            resultSet.deleteRow();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
