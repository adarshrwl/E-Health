/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this templates
 */
package controller;

import database.DbConnection;

import Model.loginadmin1;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class BookingAppointmentController {
   DbConnection dbConnection;

   public int insertBooking(int ID, String Dname, String Specilization, int Price, String Date, String PatientName) {
      String insertQuery = String.format(
            "insert into bookingappointment(AppointmentID, DoctorName, Specilization, price, Appointmentdate, PatientName, bookingstatus) values (%d,'%s','%s',%d,'%s','%s','%s')",
            ID, Dname, Specilization, Price, Date, PatientName, "Book");
      dbConnection = new DbConnection();
      int result = dbConnection.manipulate(insertQuery);
      return result;

   }

   public ResultSet fetchPatient(int ID) {
      String Query = String.format(
            "select *from login1 where patientID=%d ", ID);
      dbConnection = new DbConnection();
      ResultSet result = dbConnection.retrieve(Query);
      return result;

   }

   public ResultSet fetchAppointment(int id) {
      String query = String.format("Select * from bookingappointment Where AppointmentID=%d", id);
      dbConnection = new DbConnection();
      ResultSet result = dbConnection.retrieve(query);
      return result;

   }

   public int updateAppointment(String dname, String specilization, int price, String date, int id) {
      String query = String.format(
            "update bookingappointment set DoctorName='%s', Specilization='%s', price=%d, Appointmentdate='%s' where AppointmentID=%d",
            dname, specilization, price, date, id);
      dbConnection = new DbConnection();
      int result = dbConnection.manipulate(query);
      return result;
   }

   public int cancelappointment() {
      String query = String.format("update bookingappointment set bookingstatus='%s'", "Cancel");
      dbConnection = new DbConnection();
      int result = dbConnection.manipulate(query);
      return result;
   }
}
