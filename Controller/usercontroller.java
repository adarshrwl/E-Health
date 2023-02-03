package controller;

import Database.DbConnection;
import model.user;

public class usercontroller {

  // database connection
  DbConnection dbConnection;

  public int insertUser(user user) {
    // getting user info

    int id = user.getUserid();
    String FullName = user.getFullName();
    String contact = user.getcontact();
    String email = user.getemail();
    String state = user.getstate();
    String zipcode = user.getzipcode();
    String city = user.getcity();
    String filepath = user.getFilepath();
    // code to add user
    String insertQuery = String.format(
        "INSERT INTO register VALUES(%d,'%s', '%s', '%s', '%s', '%s','%s','%s')",
        id,
        FullName,
        contact,
        email,
        state,
        zipcode,
        city,
        filepath

    );

    dbConnection = new DbConnection();

    int result = dbConnection.manipulate(insertQuery);
    return result;
  }

}
