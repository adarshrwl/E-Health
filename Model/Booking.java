package Model;

public class Booking{
    // instance variable
    private String Username;
    private String Password;
    
    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
    

    // public constructor of Stucent Class
    Booking(String Username,String Password){
        this.Username = Username;
        this.Password = Password;
    }
    
}