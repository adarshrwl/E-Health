package Model;

public class loginadmin1 {
    // instance variable
    private String Username;
    private String Password;
    // Getting Username

    public String getUsername() {
        return this.Username;
    }

    // setting username

    public void setUsername(String Username) {
        this.Username = Username;
    }
    // getting password

    public String getPassword() {
        return this.Password;
    }
    // setting password

    public void setPassword(String Password) {
        this.Password = Password;
    }

    // public constructor of Stucent Class
    loginadmin1(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

}