package model;

/**
 *
 * @author prasa
 */
public class user {

  private int userid;
  private String FullName;
  private String contact;
  private String email;
  private String state;
  private String city;
  private String zipcode;
  private String filepath;

  public user(
      int userid,
      String FullName,
      String contact,
      String email,
      String state,
      String city,
      String zipcode,
      String filepath

  ) {
    this.userid = userid;
    this.FullName = FullName;

    this.contact = contact;
    this.email = email;
    this.state = state;
    this.zipcode = zipcode;
    this.filepath = filepath;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }

  public void setFullName(String FullName) {
    this.FullName = FullName;
  }

  public void setcontact(String contact) {
    this.contact = contact;
  }

  public void setemail(String email) {
    this.email = email;
  }

  public void setstate(String state) {
    this.state = state;
  }

  public void setcity(String city) {
    this.city = city;
  }

  public void setzipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  public int getUserid() {
    return userid;
  }

  public String getFullName() {
    return FullName;
  }

  public String getcontact() {
    return contact;
  }

  public String getemail() {
    return email;
  }

  public String getstate() {
    return state;
  }

  public String getcity() {
    return city;
  }

  public String getzipcode() {
    return zipcode;

  }

  public String getFilepath() {
    return filepath;
  }
}

private int userid;
private String FullName;
private String contact;
private String email;
private String state;
private String city;
private String zipcode;
private String filepath;