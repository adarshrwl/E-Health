package controller;

import database.DbConnection;

import Model.loginadmin1;
import java.sql.ResultSet;

public class Logincontroller  {
    DbConnection dbConnection;

    public int insertloginadmin1(String username,String password) {
        
//        String Username = loginadmin1.getUsername();
//        String Password = loginadmin1.getPassword();
//        loginadmin1=new loginadmin1(username,password);
       
//        int contact = login.getStd_contacr();
        String insertQuery = String.format(
                "insert into loginadmin1(Username,Password) values('%s','%s')",
                username,
                password );
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
    
    public ResultSet logincheck(String username,String password) {
        
//        String Username = loginadmin1.getUsername();
//        String Password = loginadmin1.getPassword();
//        loginadmin1=new loginadmin1(username,password);
       
//        int contact = login.getStd_contacr();
        String Query = String.format(
                "SELECT * FROM login1 WHERE Username='%s' AND patientPassword='%s'",username,password,
                username,
                password );
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(Query);
        return result;
    }
    public ResultSet check_reset_password(String uname,String email){
        String query=String.format("SELECT * FROM login1 WHERE Username='%s' AND patientemail='%s'",uname,email);
         dbConnection = new DbConnection();
          ResultSet result = dbConnection.retrieve(query);
        return result;
        
    }
    public int resetpassword(String uname,String email,String password){
        String query=String.format("UPDATE login1 SET patientPassword='%s' WHERE Username='%s' AND patientemail='%s'",password,uname,email);
        dbConnection = new DbConnection();
        int result=dbConnection.manipulate(query);
        return result;
        
    }
    

    

}