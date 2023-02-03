/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

public class reviewmodel {

    private String doctorname;
    private String specilization;
    private String comment;
    private String reviw;

    public reviewmodel(
            String Doctorname,
            String Specilization,
            String comment) {
        this.doctorname = Doctorname;
        this.specilization = Specilization;
        this.comment = comment;
    }

    public String getDoctorname() {
        return this.doctorname;
    }

    public String getSpecilization() {
        return this.specilization;
    }

    public String getComment() {
        return this.comment;

    }

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
