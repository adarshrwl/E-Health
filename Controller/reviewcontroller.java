/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package controller;

import Database.DbConnection;
import model.reviewmodel;

public class reviewcontroller {
  DbConnection dbConnection;

  public int insert_review(reviewmodel model) {
    String doctorname = model.getDoctorname();
    String specilization = model.getSpecilization();
    String comment = model.getComment();
    int id = 1;
    String insertQuery = String.format(
        "INSERT INTO comment_table VALUES(%d,'%s', '%s', '%s')", id, doctorname, specilization, comment);

    dbConnection = new DbConnection();

    int result = dbConnection.manipulate(insertQuery);
    return result;
  }

  public static void main(String args[]) {
    // TODO code application logic here
  }
}
