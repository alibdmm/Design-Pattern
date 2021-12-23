package Creational.Factory;

public class User {
    String userName;
    String eMail;

    public User(){
        System.out.println("test user constracture");
    }
    public User(String name, String email){
        this.userName=name;
        this.eMail = email;
    }
}
