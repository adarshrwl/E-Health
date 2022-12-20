package controller;

import database.DbConnection;
import models.Student;

public class StudentController {
    DbConnection dbConnection;

    public int insertStudent(Student student) {
       String username = student.getusername();
       String password = student.getpassword();
        
        String insertQuery = String.format(
                "insert into login1(username,password) values('%s','%s')",
                username,
                password);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }


}