package controller;

import database.DbConnection;
import Model.Dashboard;

public class dashcontroller {
    DbConnection dbConnection;

    public int insertStudent(Dashboard dashboard) {

        int id = dashboard.getStd_id();
        String name = dashboard.getStd_name();
        String address = dashboard.getStd_address();
        int age = dashboard.getStd_age();
        int contact = dashboard.getStd_contacr();
        String insertQuery = String.format(
                "insert into tbl_student(std_id,std_name,std_age,std_address,std_contacr) values(%d,'%s',%d,'%s',%d)",
                id,
                name, age, address, contact);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

}

    public int insertStudent(Dashboard dashboard) {

        int id = dashboard.getStd_id();
        String name = dashboard.getStd_name();
        String address = dashboard.getStd_address();
        int age = dashboard.getStd_age();
        int contact = dashboard.getStd_contacr();
        String insertQuery = String.format(
                "insert into tbl_student(std_id,std_name,std_age,std_address,std_contacr) values(%d,'%s',%d,'%s',%d)",
                id,
                name, age, address, contact);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

}